package com.mndx.spring_crud.resources;

import com.mndx.spring_crud.entities.User;
import com.mndx.spring_crud.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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

		@PostMapping
		public ResponseEntity<User> insertUser(@RequestBody User user) {
				user = userService.insert(user);
				URI uri = ServletUriComponentsBuilder
								.fromCurrentRequest()
								.path("/{id}")
								.buildAndExpand(user.getId())
								.toUri();

				return ResponseEntity.created(uri).body(user);
		}
}
