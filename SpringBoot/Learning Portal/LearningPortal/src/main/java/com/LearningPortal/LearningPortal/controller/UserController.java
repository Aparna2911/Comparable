package com.LearningPortal.LearningPortal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LearningPortal.LearningPortal.entity.UserEntity;
import com.LearningPortal.LearningPortal.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	private final UserService userService;
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping
	public List<UserEntity> findAllUser(){
		return userService.findAllUser();
		
	}
	
	@GetMapping("/{id}")
	public Optional<UserEntity> findUserById(@PathVariable("id") Long id){
		return userService.findById(id);
	}
	
	@PostMapping
	public UserEntity saveUser(@RequestBody UserEntity userEntity) {
		return userService.saveUser(userEntity);
	}
	
	 @PutMapping
	    public UserEntity updateUser(@RequestBody UserEntity userEntity) {
	    	Long id=userEntity.getUser_id();
	    	Optional<UserEntity> checkExistingUser = findUserById(id);
			if (!checkExistingUser.isPresent())
				throw new RuntimeException("User Id " + id + " Not Found!");
	    	return userService.updateUser(userEntity);
	    }
	 
	 @DeleteMapping("/{id}")
		public ResponseEntity<Void> deleteUser(@PathVariable("id") Long id) {
			Optional<UserEntity> user = userService.findById(id);
			if (user.isPresent()) {
				userService.deleteUser(id);
				return ResponseEntity.noContent().build();
			} else {
				return ResponseEntity.notFound().build();
			}
}
	 }
