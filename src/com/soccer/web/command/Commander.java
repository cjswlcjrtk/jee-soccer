package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;
import com.soccer.web.enums.Action;
public class Commander {
	
	public static Command direct(HttpServletRequest request) {
		Command cmd = null;
//		String action = request.getParameter("action").toUpperCase().toString();
		
		
		switch (Action.valueOf(request.getParameter("action").toUpperCase())) {		
		case SEARCH:
			break;
		case CREATE:
			cmd = new CreateCommand(request);
			break;
		case UPDATE:
			break;
		case DELETE:
			break;
		case MOVE:
			cmd = new MoveCommand(request);
			System.out.println("MoveCommand");
			break;
		case LOGIN:
			cmd = new LoginCommand(request);
			System.out.println("LoginCommand");
			break;
		case POSITION:
			cmd = new PositionCommand(request);
			System.out.println("PositionCommand");
			break;

		default:
			break;
		}
		
		return cmd;
		
	}

}
