package com.siva.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siva.documents.DrivingLicense;
import com.siva.documents.Person;
import com.siva.repo.IMongoDrivingLicenceRepo;
import com.siva.repo.IMongoPersonRepo;

@Service("asso-service")
public class AssoMongoServiceMgmtImpl implements IAssociationMongoServiceMgmt {

	@Autowired
	private IMongoPersonRepo perRepo;
	
	@Autowired
	private IMongoDrivingLicenceRepo licenseRepo;
	@Override
	public String registerPersonDetails(Person per) {

		Integer pid = perRepo.save(per).getPid();
		return "person is registered successfully with id:"+pid;
	}
	@Override
	public String registerDrivingLicence(DrivingLicense license) {
		
		String lcno = licenseRepo.save(license).getLicenceNumber();
		
		return "Driving license is registered sucessfully:"+lcno;
		
	}
	@Override
	public List<Person> fetchListOfPersonDetailsByAnyChar(String s) {
		// TODO Auto-generated method stub
		return  perRepo.personByDetailByAnyChar(s);
	}
	@Override
	public List<Person> fetchListOfPersonsInSorting() {
	return 	perRepo.fetchPersonDetailsInSort();
	}
}
