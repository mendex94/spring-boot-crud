package com.mndx.spring_crud.resources;

import com.mndx.spring_crud.entities.Category;
import com.mndx.spring_crud.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResources {
		@Autowired
		private CategoryService categoryService;
		@GetMapping
		public ResponseEntity<List<Category>> findAll() {
			List<Category> categories = categoryService.findAll();

			return ResponseEntity.ok().body(categories);
		}

		@GetMapping(value = "/{id}")
		public ResponseEntity<Optional<Category>> findById(@PathVariable Long id) {
				Optional<Category> category = categoryService.findById(id);

				if (category.isEmpty()) {
						return ResponseEntity.notFound().build();
				}

				return ResponseEntity.ok().body(category);
		}
}
