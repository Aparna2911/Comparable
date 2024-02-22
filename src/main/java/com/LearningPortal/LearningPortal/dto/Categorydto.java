package com.LearningPortal.LearningPortal.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Categorydto implements Serializable {

	private Long categoryId;
	private String name;
	private Date createdOn;
	private Date updatedOn;

}
