package com.LearningPortal.LearningPortal.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coursedto implements Serializable {

	private Long courseId;
	private String name;
	private String description;
	private Long categoryId;
	private Date createdOn;
	private Date updatedOn;

}