package com.effigo.learning.portal.entity;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Enrollment")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class EnrollmentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "enrollmentId")
	private Long enrollmentId;

	@ManyToOne
	@JoinColumn(name = "userId")
	private UserEntity userId;

	@ManyToOne
	@JoinColumn(name = "courseId")
	private CourseEntity courseId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createdOn", nullable = false, updatable = false)
	@CreationTimestamp
	private Date createdOn;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updatedOn", nullable = false)
	@UpdateTimestamp
	private Date updatedOn;

}
