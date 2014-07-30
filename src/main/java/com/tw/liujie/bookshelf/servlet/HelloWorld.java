package com.tw.liujie.bookshelf.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Logger logger = LoggerFactory.getLogger(getClass());

	public HelloWorld() {
		super();
		System.out.println("constructure...");
		logger.debug("constructure...");
	}

	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init...");
		logger.debug("init...");
		super.init(config);
	}

	
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("do Get...");
		String name = request.getParameter("name");
		
		logger.debug("Name:"+name);
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>say Hello</title></head>");
		out.println("<body>");
		out.println("<h1>");
		out.println("Hello!<br>");
		out.println("</h1>");
		if (name != null) {
			out.println(name);
		}
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("do Post...");
		// TODO Auto-generated method stub
	}


	@Override
	protected void service(HttpServletRequest httpRequest, HttpServletResponse httpResponse)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service...");
		super.service(httpRequest, httpResponse);
	}


	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy...");
		super.destroy();
	}

}
