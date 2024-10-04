package com.javaguides.springapi.repository;

import com.javaguides.springapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    //User - type of the Entity
    //Long - type of the primary key
}
