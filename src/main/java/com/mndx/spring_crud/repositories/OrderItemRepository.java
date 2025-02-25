package com.mndx.spring_crud.repositories;

import com.mndx.spring_crud.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
