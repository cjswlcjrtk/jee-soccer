package com.soccer.web.factory2;

public class DatabaseFactory {
	public static Database createDatabase(String vendor) {
		
		Database db = null;
		switch (vendor) {
		case "oracle": 
			db = new Oracle();
			break;
		case "mariadb": 
			db = new MariaDB();
			break;
		

		default:
			break;
		}		
		
		return db;
	}
}
