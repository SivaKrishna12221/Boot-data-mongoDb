package com.nit.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.mongodb.client.result.UpdateResult;
import com.nit.entity.Athelets;
import com.nit.entity.Stock;
@Service("service")
public class StockServiceMgmtImpl implements IStockMgmtService
{
	@Autowired
 private MongoTemplate template;
	
	@Override
	public String registerStockDetails(Stock details) {
		// Stock stock=  template.insert(details,"Stock");
		 int id=template.insert(details,"Stock").getStockId();
			return "Registered succesfully with stock id:"+id;
		
	}
	@Override
	public List<Stock> registerStockDetailsByBatch(List<Stock> details) {
	 List<Stock> sdetails=(List<Stock>)template.insertAll(details);
		return sdetails;
	}
	@Override
	public List<Stock> fetchStockDetailsByName(String name) {
	     Query query=new Query();
	     query.addCriteria(Criteria.where("stockName").is(name));
	     List<Stock> list=template.find(query, Stock.class);
		return list;
	}
	@Override
	public List<Stock> fetchStockDetailsByRangeOfPrices(Double price1, Double price2) {
		Query query=new Query();
		query.addCriteria(Criteria.where("price").gte(price1).lte(price2));
	     List<Stock> list=template.find(query, Stock.class);
	     
		return list;
	}
	@Override
	public String findByNameAndUpdateTheDocument(String name, Double price,String exchangeName) {
		Query query=new Query();
		query.addCriteria(Criteria.where("stockName").is(name));
		Update update=new Update();
		update.set("price",price);
		update.set("exchangeName", exchangeName);
		template.findAndModify(query, update,Stock.class);
		return "updated successfully";
		
	}
	@Override
	public String findAndRemoveStockDocument(String sname) {
		Query query=new Query();
		query.addCriteria(Criteria.where("stockName").is(sname));
		template.remove(query, Stock.class);
		return "Removed Successfully";
	}
	
	//register athelets details
	@Override
	public String registerAtheletDetails(List<Athelets> candidates) {
		template.insertAll(candidates);
		return "Collection created and documents registered successfully";
	}
	
	@Override
	public String registerOrUpdateStockDetials(String stockName, Double price, String exchange) {
      Query query=new Query();
      query.addCriteria(Criteria.where("stockName").is(stockName));
       Update updt=new Update();
       updt.setOnInsert("exchange",exchange);//this or for insertino
       updt.setOnInsert("price",price);
       updt.set("stockId", new Random().nextInt(1000));//this methods are for insertion and updation
       updt.set("stockName", "RayalSeema");
       UpdateResult result=template.upsert(query, updt,Stock.class);
       if(result.getModifiedCount()==0)
       {
    	   return "new Document is created";
       }
       else
       {
    	   return" update is happend";
       }
       
     
       
	}
}
