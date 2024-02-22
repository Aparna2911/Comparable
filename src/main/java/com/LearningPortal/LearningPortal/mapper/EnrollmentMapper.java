package com.LearningPortal.LearningPortal.mapper;

import java.util.List;
import java.util.Optional;

import org.mapstruct.Mapper;

import com.LearningPortal.LearningPortal.dto.Enrollmentdto;
import com.LearningPortal.LearningPortal.entity.EnrollmentEntity;

@Mapper(componentModel = "spring")
public interface EnrollmentMapper extends EntityMapper<Enrollmentdto, EnrollmentEntity> {
	Enrollmentdto toDto(Optional<EnrollmentEntity> user);

	Enrollmentdto toDto(EnrollmentEntity user);

	EnrollmentEntity toEntity(Enrollmentdto d);

	List<Enrollmentdto> toDto(List<EnrollmentEntity> elist);

	List<EnrollmentEntity> toEntity(List<Enrollmentdto> dlist);
}