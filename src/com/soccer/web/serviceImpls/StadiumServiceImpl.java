package com.soccer.web.serviceImpls;

import com.soccer.web.services.StadiumService;

public class StadiumServiceImpl implements StadiumService{
	private static StadiumServiceImpl instance = new StadiumServiceImpl();

	public static StadiumServiceImpl getInstance() {
		return instance;
	}
	
	private StadiumServiceImpl() {}
	
}
