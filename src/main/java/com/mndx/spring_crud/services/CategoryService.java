package com.mndx.spring_crud.services;

import com.mndx.spring_crud.entities.Category;
import com.mndx.spring_crud.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
		@Autowired
		private CategoryRepository categoryRepository;

		public List<Category> findAll() {
				return categoryRepository.findAll();
		}

		public Optional<Category> findById(Long id) {
				return categoryRepository.findById(id);
		}
}
