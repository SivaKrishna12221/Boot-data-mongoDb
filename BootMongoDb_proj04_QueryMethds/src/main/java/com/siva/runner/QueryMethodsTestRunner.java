package com.siva.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.siva.documents.Employee;
import com.siva.service.IEmployeeMgmtService;

@Component
public class QueryMethodsTestRunner implements CommandLineRunner{

	@Autowired
	private IEmployeeMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {

		/*Employee e1 = new Employee("rajesh",35000d,"Java Dev", true);
		Employee e2 = new Employee("tharun",28000d,"python Dev", false);
		Employee e3 = new Employee("soundharya",23000d,"front End Dev", true);
		Employee e4 = new Employee("meena",37000d,"Spring Dev", true);*/
		//String result = service.addEmpsData(List.of(e1,e2,e3,e4));
		/*List<Employee> emps = service.fetchListOfEmployeeByName("soundharya");
		emps.forEach(System.out::println);*/
		//service.fetchListOfEmployeeByTwoFields("rajesh",35000d).forEach(System.out::println);
		/*List<Employee> emps = service.fetchListOfEmployeeBySalRange(20000d,30000d);
		emps.forEach(System.out::println);*/
		/*List<Employee> emps = service.fetchListOfEmployeeByAnyNames("soundharya","meena");
		emps.forEach(System.out::println);*/
		
		/*List<Employee> emps = service.fetchListOfEmployeeByAnyNames("soundharya","meena");
		emps.forEach(System.out::println);*/
		/*List<Employee> emps = service.fetchEmpsByAnyChar("a");
		emps.forEach(System.out::println);*/
		List<Employee> emps = service.fetchListOfEmpsByJobs("python Dev", "Java Dev", "Spring Dev");
		emps.forEach(System.out::println);
	}
}
