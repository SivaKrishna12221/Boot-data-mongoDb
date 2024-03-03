package com.siva.runner;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.siva.documents.Medal;
import com.siva.documents.Player;
import com.siva.documents.Sport;
import com.siva.service.IPlayerMgmtService;

@Component
public class AssociationTestRunner implements CommandLineRunner{

	@Autowired
	private IPlayerMgmtService service;
	@Override
	public void run(String... args) throws Exception {
		
		Sport  cric=new Sport(100, "cricket", Set.of("Ball","Bat","Helmet","Glowses","pads"));
		Sport  footBall=new Sport(101, "FootBall", Set.of("Ball","Net","shooes","pads"));
		
		Medal icc=new Medal(500, "ICC ODI Player","ICC Tournaments","India");
		Medal  khel=new Medal(501, "Rajiv Gandhi Khel Ratna","Cricket Player","India");
		
		Player p=new Player(1000, "Ms.Dhoni","Ranchi");
		
		p.setMedals(List.of(icc,khel));
		p.setSports(List.of(cric,footBall));
		
		//String res = service.addPlayerInfo(p);
		//System.out.println(res);
		
		List<Player> players = service.fetchAllPlayerInfo();
	    players.forEach(System.out::println);
	}
}
