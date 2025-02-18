package com.mndx.spring_crud.repositories;

import com.mndx.spring_crud.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
