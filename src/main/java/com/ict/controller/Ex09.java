package com.ict.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex09")
public class Ex09 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charest=utf-8");
		PrintWriter out = response.getWriter();
		
		// 파라미터값이 같은이름으로 여러개 넘어오면 배열로 받자
		try {
			String[] hobby = request.getParameterValues("hobby");
			String[] web = request.getParameterValues("web");
			out.println("<h2>결과 보기</h2>");
			out.println("<h3><ul>");
			for (String k : hobby) {
				out.println("<li>"+ k +"</il>");
			}
			out.println("<hr>");
			for (String k : web) {
				out.println("<li>"+ k +"</il>");
			}
			out.println("</ul></h3>");
		
		} catch (Exception e) {
		}
}

}