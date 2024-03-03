package com.siva.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.siva.documents.Employee;

public interface IEmployeeRepo extends MongoRepository<Employee,Integer> {
    //here we can specify the fields using 0 and 1
	//here 0 indicates the do not involve the select query,and 1 indicates involvments
    //for all property default value is 0 and But @Id default value is 1
	//by default it contains select query with all fields
	//@Query(fields="{empId:1,name:1,salary:1}",value="{name:?0}")
	//for this Employee(empId=65e44cf52250f345b14a55cb, name=soundharya, sal=null, job=null, isVaccinated=null)

	//@Query(value="{name:?0}")//Employee(empId=65e44cf52250f345b14a55cb, name=soundharya, sal=23000.0, job=front End Dev, isVaccinated=true)

	@Query(fields="{empId:1,name:1,sal:1,isVaccinated:1}",value="{name:?0}")//Employee(empId=65e44cf52250f345b14a55cb, name=soundharya, sal=23000.0, job=null, isVaccinated=true)
	public List<Employee> fetchEmployeeDetailsByName(String name);
	@Query(fields="{empId:1,name:1,job:1}",value="{name:?0,sal:?1}")//Employee(empId=65e44cf52250f345b14a55c9, name=rajesh, sal=null, job=Java Dev, isVaccinated=null)
	public List<Employee> fetchEmployeeByTwoFields(String name,Double sal);
	
	@Query(fields="{empId:1,name:1,job:1}",value="{sal:{$gte:?0,$lte:?1}}")
	public List<Employee> fetchEmpsByRange(Double sal,Double sal2);
	
	@Query(value="{$or:[{name:?0},{name:?1}]}")
	public List<Employee> fetchEmpsByAnyNames(String name1,String  name2);
	
	@Query(value="{name:{'$regex':?0,'$options':'i'}}")
	public List<Employee> fetchEmpByAnyChar(String s);
	
	@Query(value="{job:{$in:[?0,?1,?2]}}")
	public List<Employee> fetchEmpsByNames(String job1,String job2,String job3);
	
}
