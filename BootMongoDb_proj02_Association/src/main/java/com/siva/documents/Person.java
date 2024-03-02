package com.siva.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Document("one_to_one_person")
@NoArgsConstructor
@RequiredArgsConstructor
public class Person {

	@Id
	@NonNull
	private Integer pid;
	@NonNull
	private String name;
	@NonNull
	private Long mobileNo;
	private DrivingLicense drLicense;
	private AadharDetails adhar;
}
