package com.siva.documents;

import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document("boot_manager")
@Data
public class Manager {

	@Id
	private String id;//mongo db server generates UUId 
	private Integer mgrId;
	private String name;
	private String Address;
	private Long mobileNo;
	private List<String> friends;
	private Map<String,Object> map;
	private Admin1 admin;
}
