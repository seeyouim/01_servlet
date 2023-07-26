package com.ict.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex07")
public class Ex07 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		String math = request.getParameter("math");
		String math2 = request.getParameter("math2");
		String oper = request.getParameter("oper");
		
		int num = Integer.parseInt(math);
        int num2 = Integer.parseInt(math2);
        int result = 0;
		
	            switch (oper) {
	                case "+":
	                    result = num + num2;
	                    break;
	                case "-":
	                    result = num - num2;
	                    break;
	                case "*":
	                    result = num * num2;
	                    break;
	                case "/":
	                    result = num / num2;
	                    break;
	               
	            }

	            // 결과 출력
	            out.println("<h2>계산 결과</h2>");
	            out.println("<p>" + num + " " + oper + " " + num2 + " = " + result + "</p>");

	        } 
	    }
	


