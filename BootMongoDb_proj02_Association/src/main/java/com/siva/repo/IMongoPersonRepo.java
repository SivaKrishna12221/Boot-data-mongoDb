package com.siva.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.siva.documents.Person;

public interface IMongoPersonRepo extends MongoRepository<Person, Integer>{

	@Query(value="{name:{'$regex':?0,'$options':'i'}}")//i for case insensitive
	public List<Person> personByDetailByAnyChar(String s);
	
	@Query(value="{}",sort= "{name:-1}")//here we should hard cord the sort either -1 and 1 here -1 indicate descs
	public List<Person> fetchPersonDetailsInSort();
}
