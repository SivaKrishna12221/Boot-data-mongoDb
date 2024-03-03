package com.siva.documents;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Document
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Player {

	@Id
	@NonNull
	private Integer playerId;
	@NonNull
	private String name;
	@NonNull
	private String address;
	private List<Sport> sports;
	private List<Medal> medals;
	
	
}
