package com.soccer.web.factory;

import com.soccer.web.enums.DB;

public class DatabaseFactory{
	
//	public static DatabaseBean createDatabase(String vendor, String username, String password) {
	public static Database createDatabase(String vendor) {
		
//		DatabaseBean db = null;
//		String db_url = "", db_driver = "";
			
//		switch (vendor) {
//		case "oracle":
//			db_url = Constants.ORACLE_URL;
//			db_driver = Constants.ORACLE_DRIVER;
//			break;
//		case "mariadb":	
//			db_url = Constants.MARIA_URL;
//			db_driver = Constants.MARIA_DRIVER;
//			break;
//		case "h2":	
//			db_url = Constants.H2_URL;
//			db_driver = Constants.H2_DRIVER;
//			break;
//		default:
//			break;
//		}
		
//			DatabaseBean db = new DatabaseBean(db_url, username, 
//					password, db_driver);		
//		return new DatabaseBean(db_driver, db_url, username, 
//				password);
		
		Database db = null;
		switch (DB.valueOf(vendor.toUpperCase())) {
		case ORACLE: db = new Oracle();break;
		case MARIADB: db = new MariaDB();break;
		case H2: break;
		case DB2: break;

		default:
			break;
		}
		
		return db;
		
	}
	
}
