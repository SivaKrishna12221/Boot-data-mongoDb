package com.siva.service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.siva.documents.Product;

@Service("mongo-service")
public class MongoTempShopRepo implements IMongoTempMgmtService{

	@Autowired
	private MongoTemplate mgTemp;//it will create at the time of auto configuration 
	@Override
	public String addProductInfo(Product prod) {
		Integer prodId = mgTemp.save(prod).getProdId();
		return "Product is added with its id: "+prodId;
	}
	@Override
	public String addAllProduct(List<Product> prs) {
		//mgTemp.saveAl() ;//save all is not there in the mongo template so we have to use insert all 
	      Collection<Product> prods = mgTemp.insertAll(prs);
	      List<Integer> ids = prods.stream().map(x->x.getProdId()).collect(Collectors.toList());
	      return "List of products are added with ids"+ ids.toString();
	}
	@Override
	public List<Product> fetchListofPrductsbyCategory(String category) {
		Query query = new Query();
		query.addCriteria(Criteria.where("category").is(category));//here category is property
		List<Product> products = mgTemp.find(query, Product.class);
		return products;
	}
	@Override
	public List<Product> fetchListofPrductsByRange(Double d1, Double d2) {
		Query query = new Query();
		query.addCriteria(Criteria.where("price").gte(d1).lte(d2));
		List<Product> prds = mgTemp.find(query, Product.class);
		return prds;
	}
	@Override
	public String updateProductPriceById(Integer id, Product p) {
	   Query query=new Query();
	   query.addCriteria(Criteria.where("prodId").is(id));
	   Update update = new Update();
	   update.set("price", p.getPrice());
	   update.set("pname",p.getPname());
	   Integer prodId = mgTemp.findAndModify(query, update, Product.class).getProdId();
	   return prodId+" id product  is updated successfully";
	}
	@Override
	public String updateMultipleDocumentsWhichIshavingChar(String s, Double ld,Double gd,Double nd) {

		Query query = new Query();
		//query.addCriteria(Criteria.where("price").gte(ld).andOperator(Criteria.where("price").lte(gd)));
		query.addCriteria(Criteria.where("price").gte(ld+1000).andOperator(Criteria.where("price").lte(gd+1000)));
		Update update=new Update();
		update.set("price",nd+1034);
		// mgTemp.findAndModify(query, update,Product.class); not this method this method will not work
		long modifiedCount = mgTemp.updateMulti(query, update,Product.class).getModifiedCount();
		return "documents are updated:"+modifiedCount;
	}
	
    @Override
    public String removeProductDetailsBetweenRange(Double d1, Double d2) {

    	Query query=new Query();
    	query.addCriteria(Criteria.where("price").gte(d1).lte(d2));
    	Product product = mgTemp.findAllAndRemove(query, Product.class).get(0);
    	return "product is deleted "+product;
    }
	}
