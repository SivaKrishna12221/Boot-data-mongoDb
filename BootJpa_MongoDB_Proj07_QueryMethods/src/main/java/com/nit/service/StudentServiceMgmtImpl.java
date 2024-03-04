package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.StudentInfo;
import com.nit.repository.CustomStudentRepository;
@Service("service")
public class StudentServiceMgmtImpl implements IStudentService{
	@Autowired
	private CustomStudentRepository custRepo;
@Override
public List<Object[]> showStudentDetails(String address) {
	return custRepo.fetchStudentInfoByAddress(address);
	
}@Override
public List<StudentInfo> showAllStudentInfoByName(String name) {
	return	custRepo.fetchStudentAllDetailsByName(name);
	
}@Override
public List<StudentInfo> showAllStudentInfoByRangeOfFees(Double range1, Double range2) {
	
	return custRepo.fetchAllStudentInfoByfeesRange(range1, range2);
}@Override
public List<Object[]> showStudentInfoByNameWithInitChars(String initChars) {
	
	return custRepo.fetchStudentInfoByNameInitialChars(initChars);
}
@Override
public List<StudentInfo> showAllStudentInfoByNames(String name1, String name2, String name3) {
	
	return custRepo.fetchAllDetailByNames(name1, name2, name3);
}
@Override
public int countDocumentsByfeesRange(Double fees1, Double fees2) {
	
	return custRepo.getStudentCountByFeesRange(fees1, fees2);
}
 @Override
public List<StudentInfo> showAllStudentByNameSort() {
	
	return custRepo.fetchAllEmployeesByNamesSort();
}
 @Override
public List<StudentInfo> showAllDetails() {
	
	return custRepo.findAll();
}

 @Override
public String saveStudentDetails(StudentInfo sInfo) {
	 StudentInfo stud= custRepo.save(sInfo);
		return "Student Document addedd successfully with Id"+stud.getSId();
	
}
 @Override
public String removeTheDocumentByName(String sName) {
     custRepo.deleteTheRecordByName(sName);
	return sName+" document deleted successfully";
}
 @Override
public Boolean checkingTheStudentNotPayFees() {
	
	return custRepo.doesStudentStudyWithoutFees();
}@Override
public Boolean checkingTheStudentStudentPayingFeesInRange(Double range1, Double range2) {
	Boolean flag=custRepo.doesStudentStudyingInSalRange(range1, range2);
	return flag;
}
}
