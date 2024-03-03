package com.siva.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siva.documents.Player;
import com.siva.repo.IPlayerRepo;

import lombok.NonNull;

@Service("player-service")
public class PlayerServiceMgtmImpl implements IPlayerMgmtService {

	@Autowired
	private IPlayerRepo playerRepo;
	@Override
	public String addPlayerInfo(Player player) {
		
		@NonNull
		Integer playerId = playerRepo.save(player).getPlayerId();
		return playerId+" id player is addedd";
	}
	 
	@Override
	public List<Player> fetchAllPlayerInfo() {
	
		List<Player> findAll = playerRepo.findAll();
		return findAll;
	}
}

