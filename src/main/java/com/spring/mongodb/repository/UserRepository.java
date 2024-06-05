package com.spring.mongodb.repository;

import com.spring.mongodb.model.users.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
