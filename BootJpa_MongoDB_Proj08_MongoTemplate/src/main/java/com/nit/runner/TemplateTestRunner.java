package com.nit.runner;

import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Athelets;
import com.nit.service.IStockMgmtService;

@Component
public class TemplateTestRunner implements CommandLineRunner
{
	@Autowired
	private IStockMgmtService service;
  @Override
public void run(String... args) throws Exception {
	/*Stock details=new Stock(new Random().nextInt(1000),"CANARA",4999d,"SBI");
	Stock details2=new Stock(new Random().nextInt(1000),"UNION",3999d,"SBI");
	Stock details3=new Stock(new Random().nextInt(1000),"APGB",3400d,"SBI");
  List<Stock> stocks= service.registerStockDetailsByBatch(List.of(details,details2,details3));
  int size=stocks.size();
  ArrayList<Integer> ids=new ArrayList<Integer>();
  stocks.forEach(data->
          ids.add(data.getStockId())
		  );
   System.out.println(size+":Stock details are  stored successfully with Ids "+ids.toString());
  */
	/*List list=service.fetchStockDetailsByName("SBI")  ;
	  list.forEach(System.out::println);*/
	  
	 //stocks between range
		/*List list=  service.fetchStockDetailsByRangeOfPrices(2000d,5000d);
		list.forEach(System.out::println);*/
	  //find and update
		/* String result= service.findByNameAndUpdateTheDocument("ICICI", 5999d, "CANARA");
		 System.out.println(result);*/
	  //find and remove..If we found no.of document it will delete first record
		/*String result=  service.findAndRemoveStockDocument("ICICI");
		System.out.println(result);*/
		/*Athelets ath1=new Athelets();
		ath1.setAge(23);
		ath1.setCid(new Random().nextInt(1000));
		ath1.setCName("Siva");
		ath1.setGames(new String[] {"Cricket","VolleyBall"});
		ath1.setGameAndmedals(Map.of("cricket","gold","volleyBall","silver"));
		ath1.setGameAndRecord(Map.of("Cricket","6 balls 20 runs","VolleyBall",20));
		Athelets ath2=new Athelets();
		ath2.setAge(22);
		ath2.setCid(new Random().nextInt(1000));
		ath2.setCName("Pavan");
		ath2.setGames(new String[] {"Cricket","VolleyBall","Kabaddi"});
		ath2.setGameAndmedals(Map.of("cricket","silver","volleyBall","bronze","Kabaddi","gold"));
		ath2.setGameAndRecord(Map.of("Cricket","10 of 30","VolleyBall","12 points","kabaddi","20 points"));
		String result= service.registerAtheletDetails(List.of(ath1,ath2));
		System.out.println(result);*/
	 String result= service.registerOrUpdateStockDetials("stockName",3500d,"UNION");
	 System.out.println(result);
  }  
}
