package com.mvc.controller;

import java.io.IOException;
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
			path += "/movie/list.jsp";
			request.setAttribute("movieInfoList", movieInfoList);
		}else if("view".equals(uri)) {
			path += "/movie/view.jsp";
			String miNum = request.getParameter("miNum");
			Map<String, String> movieInfo = miRepo.selectMovieInfo(miNum);
			request.setAttribute("movieInfo", movieInfo);
		}
		RequestDispatcher rd = request.getRequestDispatcher(path);
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
