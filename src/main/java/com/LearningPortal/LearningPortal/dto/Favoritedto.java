package com.LearningPortal.LearningPortal.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Favoritedto implements Serializable {

	private Long favoriteId;
	private Long courseId;
	private Long userId;
	private Date createdOn;
	private Date updatedOn;
	private boolean deleted;

}