package com.siva.service;

import java.util.List;

import com.siva.documents.Product;

public interface IMongoTempMgmtService {

	public String addProductInfo(Product prod);
	public String addAllProduct(List<Product> prs);
	public List<Product> fetchListofPrductsbyCategory(String category);
	public List<Product> fetchListofPrductsByRange(Double d1,Double d2);
	public String updateProductPriceById(Integer id,Product p);
	public String updateMultipleDocumentsWhichIshavingChar(String s,Double ld,Double gd,Double nd);
	public String removeProductDetailsBetweenRange(Double d1,Double d2);

}
