package com.mndx.spring_crud.resources;

import com.mndx.spring_crud.entities.Order;
import com.mndx.spring_crud.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/orders")
public class OrderResources {
		@Autowired
		private OrderService orderService;
		@GetMapping
		public ResponseEntity<List<Order>> findAll() {
			List<Order> orders = orderService.findAll();

			return ResponseEntity.ok().body(orders);
		}

		@GetMapping(value = "/{id}")
		public ResponseEntity<Optional<Order>> findById(@PathVariable Long id) {
				Optional<Order> order = orderService.findById(id);

				if (order.isEmpty()) {
						return ResponseEntity.notFound().build();
				}

				return ResponseEntity.ok().body(order);
		}
}
