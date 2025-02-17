package com.mndx.spring_crud.resources;

import com.mndx.spring_crud.entities.User;
import com.mndx.spring_crud.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
		@Autowired
		private UserService userService;
		@GetMapping
		public ResponseEntity<List<User>> findAll() {
			List<User> users = userService.findAll();

			return ResponseEntity.ok().body(users);
		}

		@GetMapping(value = "/{id}")
		public ResponseEntity<Optional<User>> findById(@PathVariable Long id) {
				Optional<User> user = userService.findById(id);

				if (user.isEmpty()) {
						return ResponseEntity.notFound().build();
				}

				return ResponseEntity.ok().body(user);
		}
}
