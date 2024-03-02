package com.siva.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.siva.documents.Person;
import com.siva.service.IAssociationMongoServiceMgmt;

@Component
public class AssociationTestRunner implements CommandLineRunner {

	@Autowired
	private IAssociationMongoServiceMgmt mservice;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		/*AadharDetails ad = new AadharDetails();
		ad.setAadharId(353646565707l);
		ad.setDob(LocalDate.of(2000,10,21));
		ad.setAddress("k-jangam");
		ad.setFatherName("anji");
		DrivingLicense dl = new DrivingLicense("AP-2465453l", "two-wheelar", LocalDate.of(2026,10, 10));
		Person p1 = new Person(2002, "siva", 7799838443l);
		p1.setAdhar(ad);
		p1.setDrLicense(dl);*///parent to child one side enough
					
		  //dl.setPersonDetails(p1);//converting mapping exception
			
			/*	String result = mservice.registerPersonDetails(p1);
				System.out.println(result);*/
	       	
	       	
			/* 	AadharDetails ad2 = new AadharDetails();
			ad2.setAadharId(353768434334l);
			ad2.setDob(LocalDate.of(2001,10,21));
			ad2.setAddress("jp");
			ad2.setFatherName("bala");
			DrivingLicense dl2 = new DrivingLicense("AP-246464342l", "2-wheelar", LocalDate.of(2026,10, 10));
			Person p2 = new Person(2003, "sreedhar", 764648443l);
			p2.setAdhar(ad);
			  dl2.setPersonDetails(p1);//child to parent one side enough //insert the data
			String result = mservice.registerDrivingLicence(dl2);
			System.out.println(result);*/
	       	
			/*List<Person> ps = mservice.fetchListOfPersonDetailsByAnyChar("s");
			ps.forEach(System.out::println);*/
			List<Person> ps = mservice.fetchListOfPersonsInSorting();
			ps.forEach(System.out::println);
	}
}
