package com.nit.runner;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.StudentInfo;
import com.nit.service.IStudentService;

@Component
public class StudentTestRunner implements CommandLineRunner {

	@Autowired
	private IStudentService studService;

	@Override
	public void run(String... args) throws Exception {
		// retrieve the specific fields using student addresss
		/*List<Object[]> sInfo=studService.showStudentDetails("siva");
		sInfo.forEach(data->
		{
			for(Object info:data)
			{
			  System.out.print(info+",");
			}
		}
		);*/

		// display student data using Name
		/*List<StudentInfo> list	=studService.showAllStudentInfoByName("ramana");
		list.forEach(System.out::println);
		*/

		// display student Info by fees range
		/* List<StudentInfo> list=	studService.showAllStudentInfoByRangeOfFees(10000d, 30000d);
			list.forEach(System.out::println);
		*/

		// display Student datails by initchars
		/*List<Object[]> list=studService.showStudentInfoByNameWithInitChars("r");
		list.forEach(info->//info contains list of documents
		{
			for(Object obj:info)//one by document is stored in obj 
			{
				System.out.println(obj);//one document displayed
			}
		}
		);*/

		// display all student detials by names
		/*List<StudentInfo> list=studService.showAllStudentInfoByNames("siva","ramana","sudharshan");
		list.forEach(System.out::println);
			*/
		// display count of documents
		/*int noOfDocs=studService.countDocumentsByfeesRange(20000d, 30000d);
		System.out.println("The number of documents by fees range is:"+noOfDocs);
			*/

		/*List<StudentInfo> list=	studService.showAllStudentByNameSort();
		list.forEach(System.out::println);*/

		/*List details=	studService.showAllDetails();
		details.forEach(System.out::println);
			*/

		/*StudentInfo sInfo=new StudentInfo();
		sInfo.setSId(new Random().nextInt(1000));
		sInfo.setSName("rajesh");
		sInfo.setSAddress("anankanpalli");
		sInfo.setSClass(16);
		sInfo.setFees(37000d);
		sInfo.setSFather("Hari yadav");
		String result=studService.saveStudentDetails(sInfo);
		System.out.println(result);*/

		/*String result=   studService.removeTheDocumentByName("rajesh");
		System.out.println(result);*/
    
	
	 //exits
		/* Boolean flag=	studService.checkingTheStudentNotPayFees();
		 System.out.println("Does Any one studying without paying money:"+flag);
		*/
	    System.out.println(studService.checkingTheStudentStudentPayingFeesInRange(30000d,40000d));
	}
}
