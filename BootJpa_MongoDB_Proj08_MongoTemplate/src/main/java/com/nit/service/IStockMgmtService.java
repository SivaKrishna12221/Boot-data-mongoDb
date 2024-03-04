package com.nit.service;

import java.util.List;

import com.nit.entity.Athelets;
import com.nit.entity.Stock;

public interface IStockMgmtService 
{
  public String registerStockDetails(Stock details);
  
  public List<Stock> registerStockDetailsByBatch(List<Stock> details);
  
  public List<Stock> fetchStockDetailsByName(String name);
  
  public List<Stock> fetchStockDetailsByRangeOfPrices(Double price1,Double price2);
  
  public String findByNameAndUpdateTheDocument(String SName,Double price,String exchange);
  
  public String findAndRemoveStockDocument(String sname);
  
  public String registerAtheletDetails(List<Athelets> candidates);
  
  public String registerOrUpdateStockDetials(String stockName,Double price,String exchange);
}
