package com.lucascerqueira.java.kubernetes.persistence;

import org.springframework.data.repository.CrudRepository;

import com.lucascerqueira.java.kubernetes.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

}

