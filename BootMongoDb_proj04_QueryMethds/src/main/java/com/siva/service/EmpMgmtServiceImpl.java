package com.siva.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.siva.documents.Employee;
import com.siva.repo.IEmployeeRepo;

@Service("emp-service")
public class EmpMgmtServiceImpl implements IEmployeeMgmtService{

	@Autowired
	private IEmployeeRepo empRepo;
	
	@Autowired
	private MongoTemplate template;
	 @Override
	public String addEmpsData(List<Employee> emps) {
		
		 List<Employee> empsList= empRepo.saveAll(emps);
		 List<String> collect = empsList.stream().map(x->x.getEmpId()).collect(Collectors.toList());
		 return "Employee details are added with ids"+ collect.toString();
	}
	 @Override
	public List<Employee> fetchListOfEmployeeByName(String name) {
		
	return  empRepo.fetchEmployeeDetailsByName(name);
	}
	
	 @Override
	public List<Employee> fetchListOfEmployeeByTwoFields(String name, Double sal) {
	return 	empRepo.fetchEmployeeByTwoFields(name, sal);
	}
	 @Override
	public List<Employee> fetchListOfEmployeeBySalRange(Double lsal, Double hsal) {
	
		/*Query query =new Query();
		query.addCriteria(Criteria.where("sal").gte(lsal).lte(hsal)); by using template if we use template no need to take separate repository for document classes
		template.find(query,Employee.class);*/
	return 	 empRepo.fetchEmpsByRange(lsal, hsal);
	}
	 @Override
	public List<Employee> fetchListOfEmployeeByAnyNames(String name1, String name2) {
	
		/*Criteria criteria=new Criteria();
		criteria.orOperator(Criteria.where("name").is(name1),Criteria.where("name").is(name2));
		Query query=new Query();
		query.addCriteria(criteria);
		List<Employee> find = template.find(query,Employee.class);
		return find;*/
		return  empRepo.fetchEmpsByAnyNames(name1, name2);
	}
	 @Override
	public List<Employee> fetchEmpsByAnyChar(String s) {
		
	return	 empRepo.fetchEmpByAnyChar(s);
	}
	 @Override
	public List<Employee> fetchListOfEmpsByJobs(String s1, String s2, String s3) {
		
		return  empRepo.fetchEmpsByNames(s1, s2, s3);
	}
}
