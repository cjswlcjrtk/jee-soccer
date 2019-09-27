package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.pool.Constants;

import lombok.Data;

@Data
public class Command implements Order{
	
	protected HttpServletRequest request;
	protected String action, domain, page, view, facade;
	@Override
	public void execute() {		
		setDomain();
		setPage();
		facade = "facade";
		this.view = String.format(Constants.DOUBLE_PATH, facade, page);
	}
	
	public void setDomain() {
		String path = request.getServletPath();
		domain = path.replace(".do", "");
		domain = domain.substring(1);
	}
	
	public void setPage() {
		page = request.getParameter("page");
	}
}
