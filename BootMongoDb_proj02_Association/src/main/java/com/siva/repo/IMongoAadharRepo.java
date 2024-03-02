package com.siva.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.siva.documents.AadharDetails;

public interface IMongoAadharRepo extends MongoRepository<AadharDetails,Long>{

}
