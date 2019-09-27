package com.soccer.web.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.soccer.web.pool.Constants;

@WebServlet("/facade.do")
public class FacadeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	enum Resources{
		CTX, CSS, JS, IMG;
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("파사드로 들어옴");
//		HttpSession session = request.getSession();
		for(Resources r : Resources.values()) {			
//			request.getSession().setAttribute(r.toString().toLowerCase(),
//						(r.toString().equals("CTX") 
//						? request.getContextPath()
//						: request.getContextPath() + "/resources/" + r.toString().toLowerCase())						
//					);
			
			request.getSession().setAttribute(r.toString().toLowerCase(),
					request.getContextPath() + (r.toString().equals("CTX") 
					? ""
					: "/resources/" + r.toString().toLowerCase())						
				);
			
		}
		
		request
			.getRequestDispatcher(
					String.format(Constants.DOUBLE_PATH
							,request.getServletPath()
								.substring(1, request.getServletPath().indexOf("."))
							, "login"))
			.forward(request, response);
	}



}
