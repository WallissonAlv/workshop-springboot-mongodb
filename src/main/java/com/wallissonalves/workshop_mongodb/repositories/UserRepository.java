package com.wallissonalves.workshop_mongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.wallissonalves.workshop_mongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
