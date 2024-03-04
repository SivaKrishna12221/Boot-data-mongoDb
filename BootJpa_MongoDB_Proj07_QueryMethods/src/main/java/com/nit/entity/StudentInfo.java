package com.nit.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection="Student_info")
@Data
public class StudentInfo 
{
	@Id
	 private Integer sId;
	  private String sName;
	  private String sAddress;
	  private String sFather;
	  private Double fees;
	  private Integer sClass;
}
