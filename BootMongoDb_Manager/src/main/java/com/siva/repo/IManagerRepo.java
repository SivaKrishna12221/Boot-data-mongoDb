package com.siva.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.siva.documents.Manager;

public interface IManagerRepo extends MongoRepository<Manager,String>{

	//@Query(value="")
	//public List<Manager> fetchManagerInfo(Integer id);
	@Query(value="{mgrId:{$gte:?0,$lte:?1}}",count=true)
	public int fetchCountOfManagers(Integer id,Integer id2);
	@Query(value="{mgrId:{$gte:?0,$lte:?1}}")
	public List<Manager> fetchInBetweenManagerData(Integer id,Integer id2);
}
