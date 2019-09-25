package com.soccer.web.enums;

public enum DBUrl {
	ORACLE_URL,
	MYSQL_URL,
	MARIA_URL;
	
	@Override
	public String toString() {
		String url = "";
		switch (this) {
		case ORACLE_URL:
			url = "dbc:oracle:thin:@localhost:1521:xe";
			break;
		case MYSQL_URL:
			url = "jdbc:mysqldb://localhost:1521";
			break;
		case MARIA_URL:
			url = "jdbc:mariadb://localhost:3306";
			break;
		default:
			break;
		}
		return url;
	}
}
