package com.siva.service;

import java.util.List;
import java.util.Optional;

import com.siva.documents.Manager;

public interface IManagerServiceMgmt {

	public String registerManagerInfo(Manager mgr);
	
	public List<Manager> fetchAllManagerInfo();
	
	public Optional<Manager> fetchManagerEmployeeId();
	public int countOfMgrsBetween(Integer id,Integer id2);
	
	public List<Manager> fetchBetweenRangeManagers(Integer id,Integer id2);
}
