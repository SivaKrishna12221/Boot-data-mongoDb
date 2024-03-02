package com.siva.service;

import java.util.List;

import com.siva.documents.DrivingLicense;
import com.siva.documents.Person;

public interface IAssociationMongoServiceMgmt {

	public String registerPersonDetails(Person per);
	
	public String registerDrivingLicence(DrivingLicense license);
	
	public List<Person> fetchListOfPersonDetailsByAnyChar(String s);
	
	public List<Person> fetchListOfPersonsInSorting();
}
