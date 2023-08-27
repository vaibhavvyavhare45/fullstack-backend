package com.prowings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prowings.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
