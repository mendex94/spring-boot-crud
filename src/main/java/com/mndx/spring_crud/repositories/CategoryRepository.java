package com.mndx.spring_crud.repositories;

import com.mndx.spring_crud.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
