package com.stockproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stockproject.entity.userdb;

public interface UserRepository extends JpaRepository<userdb, Long> {

}
