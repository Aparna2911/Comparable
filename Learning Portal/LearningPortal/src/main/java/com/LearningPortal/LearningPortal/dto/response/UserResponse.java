package com.LearningPortal.LearningPortal.dto.response;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  // This annotation generates getters, setters, toString, equals, and hashCode methods
@NoArgsConstructor // This annotation generates a no-args constructor
@AllArgsConstructor // This annotation generates an all-args constructor
public class UserResponse implements Serializable{
	
	private Long id;
	private String name;
    private String role;
    private Date email;
    private String password;
    private Date createdOn;
    private Date updatedOn;
    
    //name role email password
}