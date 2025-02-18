package com.mndx.spring_crud.services;

import com.mndx.spring_crud.entities.Order;
import com.mndx.spring_crud.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
		@Autowired
		private OrderRepository orderRepository;

		public List<Order> findAll() {
				return orderRepository.findAll();
		}

		public Optional<Order> findById(Long id) {
				return orderRepository.findById(id);
		}
}
