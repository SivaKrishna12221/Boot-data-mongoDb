package com.siva.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Document
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor

public class Employee {

	@Id
	private String empId;
	
	@NonNull
	private String name;
	@NonNull
	private Double sal;
	@Nonnull
	private String job;
	
	@NonNull
	private Boolean isVaccinated;
	
}
