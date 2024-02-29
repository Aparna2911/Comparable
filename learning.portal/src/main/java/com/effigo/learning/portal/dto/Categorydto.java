package com.effigo.learning.portal.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Categorydto {

	private Long categoryId;
	private Long authorId;
	private String name;
	private Date createdOn;
	private Date updatedOn;

}