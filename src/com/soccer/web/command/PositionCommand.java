package com.soccer.web.command;

//import java.util.ArrayList;
//import java.util.List;

import javax.servlet.http.HttpServletRequest;
//import com.soccer.web.serviceImpls.PlayerServiceImpl;

public class PositionCommand extends Command{
	public PositionCommand(HttpServletRequest request) {
		setRequest(request);
		setAction((request.getParameter("action")==null)
				? "login" : request.getParameter("action"));
		System.out.println("PositionCommand");
		setPage(request.getParameter("page"));
		execute();
	}
	@Override
	public void execute() {		
		super.execute();
	}
}
