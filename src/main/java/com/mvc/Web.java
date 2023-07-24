package com.mvc;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

class TestServlet{
	private int rNum;
	int c = 1;
	public TestServlet() {
		Random r = new Random();
		rNum = r.nextInt(100) + 1;
	}
	
	public Map<String, String> checkNum(int num){
		Map<String, String> result = new HashMap<>();
		int c = 0;
		c++;
		if(rNum == num) {
			result.put("msg", "맞췄다!");
			result.put("c", c + "");
		}
		return result;
	}
}

public class Web {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		TestServlet testServlet = null;
		int num = 0;
		while(true) {
			System.out.println("type uri : ");
			String uri = scan.nextLine();
			if("STOP".equals(uri.trim().toUpperCase())) {
				System.out.println("시스템을 종료합니다.");
				return;
			}
			int idx = uri.lastIndexOf("/");
			uri = uri.substring(idx + 1);
			if("test".equals(uri)) {
				if(testServlet == null) {
					testServlet = new TestServlet();
				}
				System.out.println("맞출 번호 : ");
				num = scan.nextInt();
			}else if("check".equals(uri)) {
				if(testServlet == null) {
					testServlet = new TestServlet();
				}
				testServlet.checkNum(num);
				
			}else {
				System.out.println("404 Page Not Found!!!");
			}
		}
	}
}
