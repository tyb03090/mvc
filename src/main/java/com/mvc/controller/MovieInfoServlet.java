package com.mvc.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.repository.MovieInfoRepository;


public class MovieInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private MovieInfoRepository miRepo = new MovieInfoRepository();
    List<Map<String, String>> movieInfoList = miRepo.selectMovieInfoList();
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		int idx = uri.lastIndexOf("/");
		uri = uri.substring(idx + 1);
		String path = "/WEB-INF/views";
		
		if("list".equals(uri)) {
			path += "/movie-info/list.jsp";
			request.setAttribute("movieInfoList", movieInfoList);
		}else if("view".equals(uri)) {
			path += "/movie-info/view.jsp";
			String miNum = request.getParameter("miNum");
			Map<String, String> movieInfo = miRepo.selectMovieInfo(miNum);
			request.setAttribute("movieInfo", movieInfo);
		}else if("insert".equals(uri)) {
			path += "/movie-info/insert.jsp";
		}
		RequestDispatcher rd = request.getRequestDispatcher(path);
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String uri = request.getRequestURI();
		int idx = uri.lastIndexOf("/");
		uri = uri.substring(idx + 1);
		String path = "/WEB-INF/views/common/msg.jsp";
		
		if("insert".equals(uri)) {
			Map<String, String> param = new HashMap<>();
			param.put("miTitle", request.getParameter("miTitle"));
			param.put("miDesc", request.getParameter("miDesc"));
			param.put("miGenre", request.getParameter("miGenre"));
			param.put("miCnt", request.getParameter("miCnt"));
			
			int result = miRepo.insertMovieInfo(param);
			request.setAttribute("msg", "영화 등록에 실패하였습니다...");
			request.setAttribute("url", "/movie-info/list");
			
			if(result == 1) {
				request.setAttribute("msg", "영화 등록에 성공하였습니다!");
				request.setAttribute("url", "/movie-info/list");
			}
		}
		RequestDispatcher rd = request.getRequestDispatcher(path);
		rd.forward(request, response);
	}

}
