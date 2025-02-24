package com.mndx.spring_crud.repositories;

import com.mndx.spring_crud.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
