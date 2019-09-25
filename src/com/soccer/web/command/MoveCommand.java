package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

public class MoveCommand extends Command{
	
	public MoveCommand(HttpServletRequest request) {
		setRequest(request);
		setDomain(domain);
		setAction((request.getParameter("action")==null)
				? "move" : request.getParameter("action"));
		System.out.println("MoveCommand");
		setPage(request.getParameter("page"));
		excute();
	}
	
//	@Override
//	public void excute() {
//		super.excute();
//		request.setAttribute("page", request.getParameter("page"));
//	}

}
