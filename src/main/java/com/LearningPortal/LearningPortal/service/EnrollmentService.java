package com.LearningPortal.LearningPortal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LearningPortal.LearningPortal.dto.Enrollmentdto;
import com.LearningPortal.LearningPortal.entity.EnrollmentEntity;
import com.LearningPortal.LearningPortal.mapper.EnrollmentMapper;
import com.LearningPortal.LearningPortal.repository.EnrollmentRepository;

@Service
public class EnrollmentService {
	@Autowired
	EnrollmentRepository enrollmentRepository;

	@Autowired
	EnrollmentMapper enrollmentmapper;

	public List<Enrollmentdto> findAllEnrollment() {
		List<EnrollmentEntity> user = enrollmentRepository.findAll();
		return enrollmentmapper.toDto(user);
	}

	public Enrollmentdto findById(Long id) {
		Optional<EnrollmentEntity> user = enrollmentRepository.findById(id);
		if (user.isPresent()) {
			EnrollmentEntity entity = user.get();
			return enrollmentmapper.toDto(entity);
		}
		return null;
	}

	public void deleteUserCourseEnrollment(Long id) {
		enrollmentRepository.deleteById(id);
	}

	public Enrollmentdto saveUserCourseEnrollment(Enrollmentdto enrollmententityrequest) {
		EnrollmentEntity userEntity = enrollmentmapper.toEntity(enrollmententityrequest);
		enrollmentRepository.save(userEntity);
		return enrollmentmapper.toDto(userEntity);
	}
}
