package com.siva.documents;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import jakarta.annotation.Nonnull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Document("one_to_one_aadhar_details")//this is the collection name
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class AadharDetails {

	@Id
	@NonNull
	private Long aadharId;
	@NonNull
	private LocalDate dob;
	@Nonnull
	private String fatherName;
	@NonNull
	private String address;
	
	//private Person per;
	
	
}
