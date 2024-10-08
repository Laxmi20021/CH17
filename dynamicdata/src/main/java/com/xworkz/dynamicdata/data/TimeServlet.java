package com.xworkz.dynamicdata.data;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(loadOnStartup = 1,urlPatterns = "")
public class TimeServlet extends HttpServlet{
	
	
	public TimeServlet()
	{
		System.out.println("created TimeServlet");
	}
		protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("running service in TimeServlet");
	}
	
	
	

}


