package com.LearningPortal.LearningPortal.dto;

import java.io.Serializable;
import java.util.Date;

import com.LearningPortal.LearningPortal.entity.UserRole;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // This annotation generates getters, setters, toString, equals, and hashCode methods
@NoArgsConstructor // This annotation generates a no-args constructor
@AllArgsConstructor // This annotation generates an all-args constructor
public class UserEntitydto implements Serializable {

	private Long userId;
	private String name;
	private UserRole role;
	private String email;
	private String password;
	private Date createdOn;
	private Date updatedOn;

}