package com.siva.service;

import java.util.List;

import com.siva.documents.Player;

public interface IPlayerMgmtService {

	public String addPlayerInfo(Player player);
	
	public List<Player> fetchAllPlayerInfo();
}
