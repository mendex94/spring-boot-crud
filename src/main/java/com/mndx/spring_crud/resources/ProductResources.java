package com.mndx.spring_crud.resources;

import com.mndx.spring_crud.entities.Product;
import com.mndx.spring_crud.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductResources {
		@Autowired
		private ProductService productService;
		@GetMapping
		public ResponseEntity<List<Product>> findAll() {
			List<Product> products = productService.findAll();

			return ResponseEntity.ok().body(products);
		}

		@GetMapping(value = "/{id}")
		public ResponseEntity<Optional<Product>> findById(@PathVariable Long id) {
				Optional<Product> product = productService.findById(id);

				if (product.isEmpty()) {
						return ResponseEntity.notFound().build();
				}

				return ResponseEntity.ok().body(product);
		}
}
