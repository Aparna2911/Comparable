package com.effigo.learning.portal.dto;

import java.util.Date;

import com.effigo.learning.portal.entity.CourseEntity;
import com.effigo.learning.portal.entity.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Favoritedto {

	private Long favoriteId;
	private CourseEntity courseId;
	private UserEntity userId;
	private Date createdOn;
	private Date updatedOn;
	private boolean deleted;

}
