package com.nit.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Stock {

	@Id
	private Integer stockId;
	private String stockName;
	private Double price;
	private String exchangeName;

}
