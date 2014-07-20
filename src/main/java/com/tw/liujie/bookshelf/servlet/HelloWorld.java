package com.tw.liujie.bookshelf.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Logger logger = LoggerFactory.getLogger(getClass());

	public HelloWorld() {
		super();
		System.out.println("init...");
		logger.debug("log file starting...");
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("do Get...");
		String name = request.getParameter("name");
		
		logger.debug("Name:"+name);
		response.setContentType("text/html;charset=GB18030");
		PrintWriter out = response.getWriter();
		out.println("Hello!");
		if (name != null) {
			out.println(name);
		}
		out.close();
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("do Post...");
		// TODO Auto-generated method stub
	}

}
