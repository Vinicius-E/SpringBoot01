package com.udemy.SpringBoot01.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.SpringBoot01.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
 