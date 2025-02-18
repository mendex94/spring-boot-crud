package com.mndx.spring_crud.repositories;

import com.mndx.spring_crud.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
