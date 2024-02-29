package com.effigo.learning.portal.dto;

import java.util.Date;

import com.effigo.learning.portal.entity.UserRole;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Userdto {

	private Long userId;
	private String name;
	private UserRole role;
	private String email;
	private String password;
	private Date createdOn;
	private Date updatedOn;

}
