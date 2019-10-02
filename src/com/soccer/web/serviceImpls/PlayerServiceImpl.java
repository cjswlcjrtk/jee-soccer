package com.soccer.web.serviceImpls;

import java.util.List;

import com.soccer.web.daoImpls.PlayerDAOImpl;
import com.soccer.web.domains.PlayerBean;
import com.soccer.web.services.PlayerService;

public class PlayerServiceImpl implements PlayerService {
	
//	private  PlayerDao dao;
//	
//	public PlayerServiceImpl() {
//		dao = new PlayerDaoImpl();
//	}
	
	private static PlayerServiceImpl instance = new PlayerServiceImpl();
		
	public static PlayerServiceImpl getInstance() {
		System.out.println("instance");
		return instance;
	}
	
	private PlayerServiceImpl() {}
	
	

	@Override
	public List<String> findPositions() {
		System.out.println("ServiceImpl");
//		List<String> positions = PlayerDaoImpl.getInstance().selectPositions();
		return  PlayerDAOImpl.getInstance().selectPositions();
	}
	
	

	@Override
	public List<PlayerBean> selectfindByTeamIdPosition(PlayerBean param) {
//		List<PlayerBean> players = 
//				PlayerDaoImpl.getInstance().selectfindByTeamIdPosition(param);
		return PlayerDAOImpl.getInstance().selectfindByTeamIdPosition(param);
	}

	@Override
	public List<PlayerBean> findByTeamIdHeightName(PlayerBean param) {
//		List<PlayerBean> players = 
//				PlayerDaoImpl.getInstance().selectByTeamIdHeightName(param);
		return PlayerDAOImpl.getInstance().selectByTeamIdHeightName(param);
	}

	@Override
	public PlayerBean login(PlayerBean param) {	
//		param.getPlayerId();
//		param.getSolar();		
		return PlayerDAOImpl.getInstance().selectByplayerIdSolar(param);
	}

	@Override
	public boolean join(PlayerBean param) {
		return PlayerDAOImpl.getInstance().insertPlayer(param);
	}
}
