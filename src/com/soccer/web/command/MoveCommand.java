package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

public class MoveCommand extends Command{
	
	public MoveCommand(HttpServletRequest request) {
		setRequest(request);
//		setDomain(domain);
		setAction((request.getParameter("action")==null)
				? "move" : request.getParameter("action"));
		System.out.println("MoveCommand");
		setPage(request.getParameter("page"));
		execute();
//		setDomain(request.getServletPath().substring(1,request.getServletPath().indexOf(".")));
	}
	
	@Override
	public void execute() {
		super.execute();
//		request.setAttribute("pagename", request.getParameter("page"));
	}

}
