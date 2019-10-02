package com.soccer.web.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.soccer.web.command.Receiver;
import com.soccer.web.command.Sender;
import com.soccer.web.enums.Action;
import com.soccer.web.serviceImpls.PlayerServiceImpl;

@WebServlet("/player.do")
public class PlayerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("+++playerController+++");
		Receiver.init(request);
//		Receiver.cmd.excute();
		switch(Action.valueOf(request.getParameter("action").toUpperCase())) {
		case CREATE : 
			request.setAttribute("page", "login"); 
			break;
		case LOGIN : 
			request.setAttribute("page", "main"); 
			break;
		case POSITION : 
			request.setAttribute("page", "position");
			request.setAttribute("positions", PlayerServiceImpl.getInstance().findPositions()); 
			break;
		default:break;
		}
		Sender.forward(request, response);
		

	}
	
}
