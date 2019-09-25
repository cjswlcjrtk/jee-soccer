package com.soccer.web.services;

import java.util.List;

import com.soccer.web.domains.PlayerBean;

public interface PlayerService {
	
/**SQL_TEST_002
       포지션 종류(중복제거,없으면 빈공간*/
	public List<String> findPositions();
	//4.수원팀(ID: K02)골키퍼findPositions
	public List<PlayerBean> selectfindByTeamIdPosition(PlayerBean param);
	//5.팀아이디,키,선수이름
	public List<PlayerBean> findByTeamIdHeightName(PlayerBean param);
	
	public PlayerBean login(PlayerBean param);
}
