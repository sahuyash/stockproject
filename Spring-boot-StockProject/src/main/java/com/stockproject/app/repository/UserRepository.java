package com.stockproject.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stockproject.app.entity.userEntity;

@Repository
public interface UserRepository extends JpaRepository<userEntity, Long> {

}
