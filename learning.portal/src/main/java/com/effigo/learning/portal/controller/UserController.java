package com.effigo.learning.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.effigo.learning.portal.dto.Userdto;
import com.effigo.learning.portal.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/userentity")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping
	public List<Userdto> findAllUsers() {
		log.info("all users");
		return userService.findAllUsers();
	}

	@GetMapping("/{userId}")
	public Userdto findUserById(@PathVariable("userId") Long id) {
		log.info("Get users by id");
		return userService.findUserById(id);
	}

	@DeleteMapping("{userId}")
	public void deleteUser(@PathVariable("userId") Long id) {
		log.info("The user with" + id + " is deleted");
		userService.deleteUser(id);
	}

	@PostMapping("/post")
	public Userdto saveUser(@RequestBody Userdto request) {
		log.info("The user is created");
		return userService.saveUser(request);
	}

	@PutMapping("/update/{id}")
	public Userdto updateUser(@RequestBody Userdto request, @PathVariable("id") Long id) {
		log.info("Updating user with ID: {}", id);
		// Check if the user with the specified ID exists
		Userdto updatedUser = userService.updateUser(request, id);
		if (updatedUser == null) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User with ID " + id + " not found");
		}
		return updatedUser;
	}

}
