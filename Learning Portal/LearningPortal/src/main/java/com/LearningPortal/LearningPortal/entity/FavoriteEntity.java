package com.LearningPortal.LearningPortal.entity;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Favorite")
@Data // This annotation generates getters, setters, toString, equals, and hashCode methods
@NoArgsConstructor // This annotation generates a no-args constructor
@AllArgsConstructor // This annotation generates an all-args constructor
public class FavoriteEntity {
// favorite_id course_id user_id
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="favorite_id")
	private Long favorite_id;
	
	@ManyToOne
    @JoinColumn(name="course_id")
	private CourseEntity course_id;
	
	@ManyToOne
    @JoinColumn(name="user_id")
	private UserEntity user_id;
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name="created_on", nullable = false, updatable = false)
    @CreationTimestamp
    private Date createdOn;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="updated_on", nullable = false)
    @UpdateTimestamp
    private Date updatedOn;

    @Column(name = "deleted", columnDefinition = "boolean default false")
    private boolean deleted;

	
    
}
