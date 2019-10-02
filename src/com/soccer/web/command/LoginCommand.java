package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.domains.PlayerBean;
import com.soccer.web.serviceImpls.PlayerServiceImpl;

public class LoginCommand extends Command{
	public LoginCommand(HttpServletRequest request) {
		setRequest(request);
		setAction((request.getParameter("action")==null)
				? "login" : request.getParameter("action"));
		System.out.println("LoginCommand");
		setPage(request.getParameter("page"));
		System.out.println("loginCommand1====="+request.getParameter("page"));
		execute();
	}
	@Override
	public void execute() {		
		String playerId = request.getParameter("playerId");
		String solar = request.getParameter("solar");
		
		PlayerBean player = new PlayerBean();
		player.setPlayerId(playerId);
		player.setSolar(solar);
		player = PlayerServiceImpl.getInstance().login(player);
//		System.out.println("DB에서 커맨드로 전달된 로그인 객체 : " + player.toString());
				
		setPage((player!=null) ? request.getParameter("page") : "login");
		System.out.println("loginCommand2====="+request.getParameter("page"));
		super.execute();
	}

}
