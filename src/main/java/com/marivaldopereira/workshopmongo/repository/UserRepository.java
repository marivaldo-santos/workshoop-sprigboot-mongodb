package com.marivaldopereira.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.marivaldopereira.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

}
