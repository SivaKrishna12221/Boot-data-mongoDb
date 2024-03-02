package com.siva.documents;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.annotation.Nonnull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
@Document("one_to_one_driving_license")
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class DrivingLicense {

	@Id
	@Nonnull
	private String licenceNumber;
	@Nonnull
	private String type;
	@Nonnull
	private LocalDate expiryDate;
	private Person personDetails;
	
}
