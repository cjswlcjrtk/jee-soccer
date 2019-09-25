package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;
import com.soccer.web.enums.Action;
public class Commander {
	
	public static Command direct(HttpServletRequest request) {
		Command cmd = new Command();
//		String action = request.getParameter("action").toUpperCase().toString();
		
		
		switch (Action.valueOf(request.getParameter("action").toUpperCase())) {		
		case SEARCH:
			cmd = new SearchCommand();
			break;
		case MOVE:
			cmd = new MoveCommand(request);
			System.out.println("Commander");
			break;

		default:
			break;
		}
		
		return cmd;
		
	}

}
