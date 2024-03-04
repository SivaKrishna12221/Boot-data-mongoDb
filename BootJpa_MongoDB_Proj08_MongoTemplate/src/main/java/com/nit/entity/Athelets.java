package com.nit.entity;

import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Athelets 
{
	@Id
  private Integer cid;
  private String cName;
  private String[] games;
  private Map<String,String> gameAndmedals;
  private Map<String,Object> gameAndRecord;
  private Integer age;
   
  
  
}
