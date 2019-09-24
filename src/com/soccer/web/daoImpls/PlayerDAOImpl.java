package com.soccer.web.daoImpls;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.soccer.web.daos.PlayerDAO;
import com.soccer.web.domains.PlayerBean;
import com.soccer.web.factory.DatabaseFactory;
import com.soccer.web.pool.Constants;

public class PlayerDAOImpl implements PlayerDAO{
	
	private static PlayerDAOImpl instance = new PlayerDAOImpl();
	
	public static PlayerDAOImpl getInstance() {
		return instance;
	}
	
	private PlayerDAOImpl() {}

	@Override
	public List<String> selectPositions() {
		System.out.println("DAOImpl");
		List<String> positions = new ArrayList<String>();
		
		try {			
			String sql = "SELECT "
					+ "DISTINCT (NVL(POSITION,'')) as position \r\n" + 
					"FROM PLAYER";
//			PreparedStatement stmt = DatabaseFactory
//					.createDatabase("oracle", Constants.USERNAME,
//							Constants.PASSWORD)
//					.getConnection()
//					.prepareStatement(sql);
//			ResultSet rs = stmt.executeQuery();		
			
			ResultSet rs = DatabaseFactory
					.createDatabase(Constants.VENDOR)
					.getConnection()
					.prepareStatement(sql)
					.executeQuery();
					
			while(rs.next()) {
				positions.add(rs.getString("position"));					
			}
			System.out.println("연결 성공");
			System.out.println("팀명: \n" +positions);	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return positions;
	}

	@Override
	public List<PlayerBean> selectfindByTeamIdPosition(PlayerBean param) {
		
		return null;
	}

	@Override
	public List<PlayerBean> selectByTeamIdHeightName(PlayerBean param) {
		return null;
	}

}
