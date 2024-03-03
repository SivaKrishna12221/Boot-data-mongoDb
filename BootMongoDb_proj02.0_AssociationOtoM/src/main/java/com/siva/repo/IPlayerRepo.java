package com.siva.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.siva.documents.Player;

public interface IPlayerRepo extends MongoRepository<Player,Integer>{

}
