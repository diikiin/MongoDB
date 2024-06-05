package com.spring.mongodb.repository;

import com.spring.mongodb.model.movies.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository extends MongoRepository<Movie, String> {
}
