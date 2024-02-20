package com.LearningPortal.LearningPortal.dto.request;

import java.io.Serializable;
import java.util.Date;

import com.LearningPortal.LearningPortal.entity.UserEntity;
import com.LearningPortal.LearningPortal.entity.UserRole;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data  // This annotation generates getters, setters, toString, equals, and hashCode methods
@NoArgsConstructor // This annotation generates a no-args constructor
@AllArgsConstructor // This annotation generates an all-args constructor
public class UserRequest implements Serializable{
	private String name;
    private String role;
    private Date email;
    private String password;
    //name role email password
}