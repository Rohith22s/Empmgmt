package com.icolleague.assistant.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.icolleague.assistant.model.User;

public interface UserRepository extends MongoRepository<User, String> {
    User findByUsernameAndPassword(String username, String password);
}
