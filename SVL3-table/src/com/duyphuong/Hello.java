package com.duyphuong;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Hello() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html");
//		PrintWriter out=response.getWriter();
//		
//		out.print("<html><body>");
//		out.print("<h3>Hello Servlet</h3>");
//		out.print("</body></html>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out=response.getWriter();
		
		List<User> list = Bean.createList();
		
		out.print("<html><body>");
		out.print("<h3>Hello Servlet</h3>");
		//xai for de duyet r in ra cx dk
		out.print("<p>" + list.get(0).getName1() + " " + list.get(0).getName2() + "</p>");
		out.print("</body></html>");
	}

}
