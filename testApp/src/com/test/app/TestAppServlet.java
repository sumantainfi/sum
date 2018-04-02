package com.test.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class TestAppServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		/*PrintWriter out = resp.getWriter();

	    out.println(
	        "Article with the title: " + req.getParameter("title") + " by "
	            + req.getParameter("author") + " and the content: "
	            + req.getParameter("description") + " added.");*/
		System.out.println(req.getParameter("title"));
		Object title = req.getParameter("title");
		Object author = req.getParameter("author");
		Object description = req.getParameter("description");
		SaveData data = new SaveData();
		data.save( title,author,description);
	    

	}
}
