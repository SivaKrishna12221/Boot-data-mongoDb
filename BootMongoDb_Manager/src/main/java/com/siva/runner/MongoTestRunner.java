package com.siva.runner;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.siva.documents.Admin1;
import com.siva.documents.Manager;
import com.siva.service.IManagerServiceMgmt;
class SortManager implements Comparator<Manager>
{
	@Override
	public int compare(Manager o1, Manager o2) {
		
		return o1.getMgrId()-o2.getMgrId();
	}
}
@Component
public class MongoTestRunner implements CommandLineRunner {

	@Autowired
	private IManagerServiceMgmt service;
	@Override
	public void run(String... args) throws Exception {
		
		Manager mgr=new Manager();
		mgr.setAddress("mdn");
		mgr.setMobileNo(794345355l);
		mgr.setName("vishnu");
		mgr.setMgrId(253);
		mgr.setFriends(List.of("sitha","ram"));
		mgr.setMap(Map.of("id",443,"name","admin"));
		Admin1 admin = new Admin1(20,"raju");
	//	String result = service.registerManagerInfo(mgr);
	  //  System.out.println(result);
	//	List<Manager> mgrs = service.fetchAllManagerInfo();
	//	OptionalInt max = mgrs.stream().mapToInt(x->x.getMgrId()).max();
	/*	System.out.println("max value:");
		System.out.println(max);
		Collections.sort(mgrs,new SortManager());
		mgrs.forEach(System.out::println);*/
	
	/*Manager mgr2=new Manager();
	mgr2.setId(UUID.randomUUID().toString());
	mgr2.setAdmin(new Admin1(20,"raj"));
	String re = service.registerManagerInfo(mgr2);
	System.out.println(re);
	*//* Manager manager = service.fetchManagerEmployeeId().get();
			System.out.println(manager);
		*/
	/*	int countOfMgrsBetween = service.countOfMgrsBetween(200, 500);
		System.out.println(countOfMgrsBetween);*/
		List<Manager> mgrs = service.fetchBetweenRangeManagers(200, 500);
		System.out.println(mgrs);
	}
}
