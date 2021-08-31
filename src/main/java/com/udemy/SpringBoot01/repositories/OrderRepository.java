package com.udemy.SpringBoot01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.SpringBoot01.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
