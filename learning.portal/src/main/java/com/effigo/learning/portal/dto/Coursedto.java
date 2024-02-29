package com.effigo.learning.portal.dto;

import java.util.Date;

import com.effigo.learning.portal.entity.CategoryEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coursedto {

	private Long courseId;
	private String name;
	private String description;
	private CategoryEntity categoryId;
	private Date createdOn;
	private Date updatedOn;

}