package com.LearningPortal.LearningPortal.dto.response;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data  // This annotation generates getters, setters, toString, equals, and hashCode methods
@NoArgsConstructor // This annotation generates a no-args constructor
@AllArgsConstructor // This annotation generates an all-args constructor
public class FavoriteResponse implements Serializable{
	
	private Long favorite_id;
	private Long courseId;
	private Long userId;
    private Date createdOn;
	private Date updatedOn;
	private boolean deleted;
    
    //name role email password
}