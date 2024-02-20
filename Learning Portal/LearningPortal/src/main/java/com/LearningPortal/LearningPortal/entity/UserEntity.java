package com.LearningPortal.LearningPortal.entity;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="UserEntity")
@Data  // This annotation generates getters, setters, toString, equals, and hashCode methods
@NoArgsConstructor // This annotation generates a no-args constructor
@AllArgsConstructor // This annotation generates an all-args constructor
public class UserEntity {
	//id name role email password updated_on created_on
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="user_id")
	private Long user_id;
	
	@Column(name="name")
	private String name;
	
	@Enumerated(EnumType.STRING)
	@Column(name="role")
	private UserRole role;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	 @Temporal(TemporalType.TIMESTAMP)
	    @Column(name="created_on", nullable = false, updatable = false)
	    @CreationTimestamp
	    private Date createdOn;

	    @Temporal(TemporalType.TIMESTAMP)
	    @Column(name="updated_on", nullable = false)
	    @UpdateTimestamp
	    private Date updatedOn;
 
}
