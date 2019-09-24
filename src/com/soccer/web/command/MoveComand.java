package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

public class MoveComand extends Command{
	public MoveComand(HttpServletRequest request) throws Exception{
		setRequest(request);
		setAction((request.getParameter("action")==null)
				? "move" : request.getParameter("action"));
		execute();
	}	
}
