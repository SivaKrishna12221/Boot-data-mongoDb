package com.siva.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Document
@Data
@AllArgsConstructor
public class Medal {

	@Id
	private Integer medalId;
	
	private String medalName;
	
	private String eventName;
	
	private String place;
}
