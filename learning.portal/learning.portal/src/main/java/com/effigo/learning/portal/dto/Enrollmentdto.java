package com.effigo.learning.portal.dto;

import java.util.Date;

import com.effigo.learning.portal.entity.CourseEntity;
import com.effigo.learning.portal.entity.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Enrollmentdto {
	private long enrollmentId;
	private UserEntity userId;
	private CourseEntity courseId;
	private Date createdOn;
	private Date updatedOn;
}
