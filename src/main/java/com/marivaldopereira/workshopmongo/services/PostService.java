package com.marivaldopereira.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marivaldopereira.workshopmongo.domain.Post;
import com.marivaldopereira.workshopmongo.repository.PostRepository;
import com.marivaldopereira.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto " + id + " não encontrado"));
	}
}
