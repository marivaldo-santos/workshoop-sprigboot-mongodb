package com.marivaldopereira.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.marivaldopereira.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

}
