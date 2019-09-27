package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.daoImpls.PlayerDAOImpl;
import com.soccer.web.domains.PlayerBean;
import com.soccer.web.serviceImpls.PlayerServiceImpl;

public class LoginCommand extends Command{
	public LoginCommand(HttpServletRequest request) {
		setRequest(request);
		setAction((request.getParameter("action")==null)
				? "login" : request.getParameter("action"));
		System.out.println("LoginCommand");
		setPage(request.getParameter("page"));
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
		System.out.println("DB에서 커맨드로 전달된 로그인 객체 : " + player.toString());
		if(!player.getPlayerId()
				.equals("")) {
			setPage(request.getParameter("page"));
		}else {
			setPage("fail.jsp");
		}
		
		super.execute();
	}

}
