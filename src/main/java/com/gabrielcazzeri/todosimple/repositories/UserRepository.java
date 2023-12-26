package com.gabrielcazzeri.todosimple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabrielcazzeri.todosimple.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
