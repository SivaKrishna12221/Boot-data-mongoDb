package com.siva.service;

import java.util.List;

import com.siva.documents.Employee;

public interface IEmployeeMgmtService {

	public String addEmpsData(List<Employee> emps);

	public List<Employee> fetchListOfEmployeeByName(String name);

	public List<Employee> fetchListOfEmployeeByTwoFields(String name, Double sal);

	public List<Employee> fetchListOfEmployeeBySalRange(Double lsal, Double hsal);

	public List<Employee> fetchListOfEmployeeByAnyNames(String name1, String name2);

	public List<Employee> fetchEmpsByAnyChar(String s);
	
	public List<Employee> fetchListOfEmpsByJobs(String s1,String s2,String s3);
}
