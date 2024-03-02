package com.siva.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.siva.documents.DrivingLicense;

public interface IMongoDrivingLicenceRepo extends MongoRepository<DrivingLicense,String>{

}
