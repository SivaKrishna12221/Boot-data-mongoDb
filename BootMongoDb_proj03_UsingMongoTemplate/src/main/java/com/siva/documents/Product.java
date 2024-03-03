package com.siva.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	@Id
	private Integer prodId;
	private String pname;
	private Double price;
	private String category;//type of product like electronics,raw materials
	
}
