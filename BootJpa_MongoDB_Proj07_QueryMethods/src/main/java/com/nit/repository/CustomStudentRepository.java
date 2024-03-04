package com.nit.repository;

import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.nit.entity.StudentInfo;

public interface CustomStudentRepository extends MongoRepository<StudentInfo, Integer> {

	@Query(fields = "{sId:1,sName:1,sAddress:1,sFather:1,fees:1,sClass:1}", value = "{sName:?0}")
	public List<Object[]> fetchStudentInfoByAddress(String address);

	@Query(fields = "{}", value = "{sName:?0}")
	public List<StudentInfo> fetchStudentAllDetailsByName(String name);

	@Query(fields = "{}", value = "{fees:{$gte:?0},fees:{$lte:?1}}")
	public List<StudentInfo> fetchAllStudentInfoByfeesRange(Double range1, Double range2);

	@Query(fields = "{sId:0,sName:1,sAddress:1,sFather:1,fees:1}", value = "{sName:{'$regex':?0}}") // where ename // like=":?0%
	public List<Object[]> fetchStudentInfoByNameInitialChars(String initChars);

	@Query(value = "{sName:{$in:[:?0,:?1,:?2]}}")
	public List<StudentInfo> fetchAllDetailByNames(String name1, String name2, String name3);
	
	@Query(value="{$or:[{sName:?0},{sName:?1}]}")
	public List<StudentInfo> fetchAllDetailsByAnyName(String name1,String name2);
	
	//count documents
	@Query(value="{fees:{$gte:?0,$lte:?1}}",count=true)
	public int getStudentCountByFeesRange(Double fees1,Double fees2);
	
	@Query(value="{}",sort="{sName:-1")
	public List<StudentInfo> fetchAllEmployeesByNamesSort();
	
	//delete the document by Name
	@Query(value="{sName:?0}",delete=true)
	public void deleteTheRecordByName(String sName);
	
	//exits type
	@Query(value="{fees:null}",exists=true)
	public Boolean doesStudentStudyWithoutFees();
	
	@Query(value="{fees:{$gte:?0,$lte:?1}}",exists=true)
	public Boolean doesStudentStudyingInSalRange(Double sal1,Double sal2);
}
