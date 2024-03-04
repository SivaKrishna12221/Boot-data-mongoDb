package com.nit.service;

import java.util.List;

import com.nit.entity.StudentInfo;

public interface IStudentService {

	public List<Object[]> showStudentDetails(String address);
	
	public List<StudentInfo> showAllStudentInfoByName(String name);
	
	public List<StudentInfo> showAllStudentInfoByRangeOfFees(Double range1,Double range2);
	
	public List<Object[]> showStudentInfoByNameWithInitChars(String initChars);
	
	public List<StudentInfo> showAllStudentInfoByNames(String name1,String name2,String name3);
	
	public int countDocumentsByfeesRange(Double fees1,Double fees2);
	
	public List<StudentInfo> showAllStudentByNameSort();
	
	public List<StudentInfo> showAllDetails();
	
	public String saveStudentDetails(StudentInfo sInfo);
	
	public String removeTheDocumentByName(String sName);
	
	public Boolean checkingTheStudentNotPayFees();
	
	public Boolean checkingTheStudentStudentPayingFeesInRange(Double range1,Double range2);
}
