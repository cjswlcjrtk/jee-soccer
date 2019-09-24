package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.pool.Constants;

import lombok.Data;

@Data
public class Command implements Order{
	protected HttpServletRequest request;
	protected String action, page, view;
	
	@Override
	public void execute() throws Exception {
		this.view = String.format(Constants.VIEW_PATH, page);		
	}
	
	public void setPage() {
		System.out.println("########page##############" + page);
		page = request.getParameter("page");
	}
	

}
