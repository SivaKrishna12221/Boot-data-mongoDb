package com.siva.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.siva.service.IMongoTempMgmtService;

@Component
public class MongoTemplateTestRunner implements CommandLineRunner {

	@Autowired
	private IMongoTempMgmtService mgService;

	@Override
	public void run(String... args) throws Exception {

		// Product p1 = new Product(101,"mobile",25000d,"electronics");
		// String res = mgService.addProductInfo(p1);
		/*	Product p2 = new Product(106,"charger",230d,"electronics");
			Product p3 = new Product(98,"shirt",3443d,"cloths");
			Product p4 = new Product(99,"spects",1300d,"glass");
			 String res = mgService.addAllProduct(List.of(p2,p3,p4));
		*/
		// List<Product> res = mgService.fetchListofPrductsbyCategory("electronics");
		/*	List<Product> res = mgService.fetchListofPrductsByRange(100d, 25000d);
			List<Product> fdata = res.stream().filter(x->x.getPname().startsWith("s")).collect(Collectors.toList());
			List<Product> f2data = fdata.stream().filter(x->x.getPrice()<3000&&x.getPrice()>1000).collect(Collectors.toList());
			*/// Collections.sort(res);
		// System.out.println(res.toString());
		/*	Optional<Product> collect = res.stream().collect(Collectors.maxBy(Comparator.comparing(x->x.getPrice())));
			System.out.println(collect);//it gives product object
		*/
		/*	Optional<Product> collect = res.stream().collect(Collectors.minBy(Comparator.comparing(x->x.getPrice())));
		  System.out.println(collect);*/
		/*OptionalDouble min = res.stream().mapToDouble(x->x.getPrice()).min();
		System.out.println(min);*/ // it returns only value

		// grouping operation
		// Map<String, List<Product>> groups =
		// res.stream().collect(Collectors.groupingBy(x->x.getCategory()));
		// sorting data and collecting only specied property values
		/*Collections.sort(res,(x,y)->(int)(x.getPrice()-y.getPrice()));
		List<Double> collect = res.stream().map(x->x.getPrice()).collect(Collectors.toList());
		*/
		// sorting using stream
		// res.stream().sorted((e1,e2)->(int)(e1.getPrice()-e2.getPrice())).forEach(System.out::println);
		// res.stream().sorted((x,y)->x.getPname().compareTo(y.getPname())).forEach(System.out::println);
		// @formatter:on

		// res.forEach(System.out::println);

		/*Product pe2 = new Product();
		pe2.setPrice(34348d);
		pe2.setPname("airConditionar");
		String res = mgService.updateProductPriceById(106, pe2);*/
		/*String res = mgService.updateMultipleDocumentsWhichIshavingChar("price", 2000d, 3000d, 3405d);
		System.out.println(res);*/
		String res = mgService.removeProductDetailsBetweenRange(4400d, 5000d);
		System.out.println(res);
	}
}
