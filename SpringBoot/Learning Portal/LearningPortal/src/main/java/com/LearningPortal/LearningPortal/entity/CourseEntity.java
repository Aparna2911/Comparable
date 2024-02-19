package com.LearningPortal.LearningPortal.entity;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="Course")
@Data // This annotation generates getters, setters, toString, equals, and hashCode methods
@NoArgsConstructor // This annotation generates a no-args constructor
@AllArgsConstructor // This annotation generates an all-args constructor
public class CourseEntity {
   //course_id name description category_id
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="course_id")
	private Long course_id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@ManyToOne
	@JoinColumn(name="category_id")
	private CategoryEntity category_id;
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name="created_on", nullable = false, updatable = false)
    @CreationTimestamp
    private Date createdOn;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="updated_on", nullable = false)
    @UpdateTimestamp
    private Date updatedOn;

	
}
	