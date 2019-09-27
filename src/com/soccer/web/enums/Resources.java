package com.soccer.web.enums;

public enum Resources {
	CTX, CSS, JS, IMG;
	
	@Override
	public String toString() {
		String resources = null;
		switch (this) {
		case CTX:
			resources = "request.getContextPath()";
			break;
		case CSS:
			resources = "request.getContextPath()/resources/css";
			break;
		case JS:
			resources = "request.getContextPath()/resources/js";
			break;
		case IMG:
			resources = "request.getContextPath()/resources/img";
			break;

		default:
			break;
		}
		return resources;
	}
}
