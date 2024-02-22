package com.LearningPortal.LearningPortal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LearningPortal.LearningPortal.dto.Userdto;
import com.LearningPortal.LearningPortal.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/users")
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

	@PostMapping
	public Userdto saveUser(@RequestBody Userdto request) {
		log.info("The user is created");
		return userService.saveUser(request);
	}

	@PutMapping("/update/{id}")
	public Userdto updateUser(@RequestBody Userdto request, @PathVariable("id") Long id) {
		log.info("The user with id" + id + "is updated");
		return userService.updateUser(request, id);
	}

}