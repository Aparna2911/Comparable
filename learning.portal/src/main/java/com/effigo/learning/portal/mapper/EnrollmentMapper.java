package com.effigo.learning.portal.mapper;

import java.util.List;
import java.util.Optional;

import org.mapstruct.Mapper;

import com.effigo.learning.portal.dto.Enrollmentdto;
import com.effigo.learning.portal.entity.EnrollmentEntity;

@Mapper(componentModel = "spring")
public interface EnrollmentMapper extends EntityMapper<Enrollmentdto, EnrollmentEntity> {
	Enrollmentdto toDto(Optional<EnrollmentEntity> user);

	Enrollmentdto toDto(EnrollmentEntity user);

	EnrollmentEntity toEntity(Enrollmentdto d);

	List<Enrollmentdto> toDto(List<EnrollmentEntity> elist);

	List<EnrollmentEntity> toEntity(List<Enrollmentdto> dlist);
}
