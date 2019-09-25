package com.soccer.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.soccer.web.command.Commander;
import com.soccer.web.command.Receiver;
import com.soccer.web.command.Sender;
//import com.soccer.web.command.Sender;
//import com.soccer.web.domains.PlayerBean;
//import com.soccer.web.serviceImpls.PlayerServiceImpl;
@WebServlet("/player.do")
public class PlayerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		Receiver rc = new Receiver();
//		rc.init(request);-->receiver에 init을 static 주면 바로 호출 가능하다.
		
		
		Receiver.init(request);
//		Receiver.cmd.excute();
		Sender.forward(request, response);
		
//		
//		Commander cmd = new Commander();
//		Sender sd = new Sender();
//		
//		
////		PlayerBean player = null;
//		String action = request.getParameter("action");
//		System.out.println("액션"+action);		
		
//		switch(action) {
//		case "move" :
//		break;
//		case "find2":
//			System.out.println("xkskxkxkxkxkxk");
//			request.setAttribute("positions", PlayerServiceImpl.getInstance().findPositions());
//			break;
//		case "findinfo" :
//			player = new PlayerBean();
//			player.setTeamId(request.getParameter("teamId"));
//			player.setPosition(request.getParameter("position"));
//									
//			request.setAttribute("players",PlayerServiceImpl.getInstance().selectfindByTeamIdPosition(player));
//			
////			System.out.println("########################" + PlayerServiceImpl.getInstance().selectfindByTeamIdPosition(player));
//			System.out.println("4번"+player);
//		break;
//		case "findinfo2" : 
//			player = new PlayerBean();
//			player.setTeamId(request.getParameter("teamId"));
//			player.setHeight(request.getParameter("height"));
//			player.setPlayername(request.getParameter("playername"));
//			request.setAttribute("player",PlayerServiceImpl.getInstance().findByTeamIdHeightName(player));
//			System.out.println("5번"+player);
//			break;
//		}
		
//		String page = request.getParameter("page");
//		System.out.println("페이지"+page);
//		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/"+page+".jsp");		
//		rd.forward(request, response);
	}
	
}
