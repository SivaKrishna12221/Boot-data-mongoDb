package com.siva.service;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siva.documents.Manager;
import com.siva.repo.IManagerRepo;

@Service("mgr-service")
public class ManagerMgmtService implements IManagerServiceMgmt{

	@Autowired
	private IManagerRepo mgrRepo;
	@Override
	public String registerManagerInfo(Manager mgr) {
	 
		String id=mgrRepo.save(mgr).getId();
		return "Manager is registered with id:"+id;	
	}
	@Override
	public List<Manager> fetchAllManagerInfo() {
		List<Manager> mgrs = mgrRepo.findAll();
		OptionalInt max = mgrs.stream().mapToInt(x->x.getMgrId()).max();
		System.out.println(max);
		return mgrs;
	}
	@Override
	public Optional<Manager> fetchManagerEmployeeId() {
		Optional<Manager> mgr = mgrRepo.findById("65e206bc43faf00330c4e556");
		return mgr;
	}
	public int countOfMgrsBetween(Integer id,Integer id2)
	{
		int fetchCountOfManagers = mgrRepo.fetchCountOfManagers(id, id2);
		return fetchCountOfManagers;
	}
	@Override
	public List<Manager> fetchBetweenRangeManagers(Integer id, Integer id2) {
	return 	mgrRepo.fetchInBetweenManagerData(id, id2);
	}
}
