package com.soccer.web.daos;

import java.util.List;

import com.soccer.web.domains.PlayerBean;

public interface PlayerDAO {
	
	public PlayerBean selectByplayerIdSolar(PlayerBean param);
	
	public List<String> selectPositions();

	public List<PlayerBean> selectfindByTeamIdPosition(PlayerBean param);
	
	public List<PlayerBean> selectByTeamIdHeightName(PlayerBean param);
	
	//테스트
	public List<PlayerBean> selectByMany(PlayerBean param);
	// 0. 조인
	public boolean insertPlayer(PlayerBean param);
}
