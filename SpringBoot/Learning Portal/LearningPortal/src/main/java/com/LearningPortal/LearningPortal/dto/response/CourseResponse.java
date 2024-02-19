package com.LearningPortal.LearningPortal.dto.response;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  // This annotation generates getters, setters, toString, equals, and hashCode methods
@NoArgsConstructor // This annotation generates a no-args constructor
@AllArgsConstructor // This annotation generates an all-args constructor
public class CourseResponse implements Serializable{
	
	private Long course_id;
	private String name;
	private String description;
	private Long category_Id;
	private Date createdOn;
	private Date updatedOn;
}