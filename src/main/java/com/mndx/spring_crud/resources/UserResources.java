package com.mndx.spring_crud.resources;

import com.mndx.spring_crud.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

		@GetMapping
	public ResponseEntity<User> findAll() {
			User dummyUser = new User(1L, "Maria", "maria@maria.com", "999999", "nicepassword");

			return ResponseEntity.ok().body(dummyUser);
	}
}
