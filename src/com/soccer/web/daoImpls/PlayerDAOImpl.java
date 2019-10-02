package com.soccer.web.daoImpls;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
	public PlayerBean selectByplayerIdSolar(PlayerBean param) {
		
		PlayerBean player = new PlayerBean();
		
		String sql = "select player_id, solar \r\n" + 
				"from player where player_id like ? and solar like ? ";
		try {
			PreparedStatement stmt = DatabaseFactory
					.createDatabase(Constants.VENDOR.toUpperCase())
					.getConnection()
					.prepareStatement(sql);
			stmt.setString(1, param.getPlayerId());
			stmt.setString(2, param.getSolar());	
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				player = new PlayerBean();
				player.setPlayerId(rs.getString("PLAYER_ID"));
				player.setSolar(rs.getString("SOLAR"));
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
//		System.out.println("반환된 결과값"+ player.toString());
		return player;
		
		
	}	
	
	@Override
	public List<String> selectPositions() {
		System.out.println("DAOImpl");
		List<String> positions = new ArrayList<String>();
		
		try {			
			String sql = "SELECT "
					+ "DISTINCT (NVL(POSITION,'')) as position \r\n" + 
					"FROM PLAYER";
			
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
		List<PlayerBean> list = new ArrayList<>();
		return list;
	}

	@Override
	public List<PlayerBean> selectByTeamIdHeightName(PlayerBean param) {
		return null;
	}

	@Override
	public List<PlayerBean> selectByMany(PlayerBean param) {
		List<PlayerBean> player = new ArrayList<>();
		
		String sql = "";
		try {
			PreparedStatement stmt = DatabaseFactory
					.createDatabase(Constants.VENDOR)
					.getConnection()
					.prepareStatement(sql);
			stmt.setString(1, param.getPlayerId());
			stmt.setString(2, param.getSolar());
			
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return player;
	}

	@Override
	public boolean insertPlayer(PlayerBean param) {
		boolean flag = false;
		try {
			String sql = "INSERT INTO PLAYER(PLAYER_ID, SOLAR, TEAM_ID,PLAYER_NAME) \r\n" + 
					"VALUES(?, ?, 'K03','김광진')";
			PreparedStatement stmt = DatabaseFactory
					.createDatabase(Constants.VENDOR)
					.getConnection()
					.prepareStatement(sql);
			stmt.setString(1, param.getPlayerId());
			stmt.setString(2, param.getSolar());
			int rs = stmt.executeUpdate();
			flag = (rs == 1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	

	

}
