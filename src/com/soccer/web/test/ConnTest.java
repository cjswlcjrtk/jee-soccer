package com.soccer.web.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.soccer.web.enums.DBDriver;
import com.soccer.web.enums.DBUrl;
import com.soccer.web.pool.Constants;

public class ConnTest {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe", 
				username = "c##bit", 
				password = "oracle";
		try {
			Class.forName(DBDriver.ORACLE_DRIVER.toString());
			conn = DriverManager.getConnection(DBUrl.ORACLE_URL.toString(), 
					Constants.USERNAME, Constants.PASSWORD);
			if(conn != null) {
				
				stmt = conn.createStatement();
				rs = stmt.executeQuery("SELECT DISTINCT (NVL(POSITION,'')) list\r\n" + 
						"FROM PLAYER");
				List<String> list = new ArrayList<String>();
				while(rs.next()) {
					list.add(rs.getString("list"));					
				}
				System.out.println("연결 성공");
				System.out.println("팀명: \n" +list);		
				
			}else {
				System.out.println("연결 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
