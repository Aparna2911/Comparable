package com.LearningPortal.LearningPortal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LearningPortal.LearningPortal.dto.Userdto;
import com.LearningPortal.LearningPortal.entity.UserEntity;
import com.LearningPortal.LearningPortal.mapper.CourseMapper;
import com.LearningPortal.LearningPortal.mapper.UserMapper;
import com.LearningPortal.LearningPortal.repository.CourseRepository;
import com.LearningPortal.LearningPortal.repository.EnrollmentRepository;
import com.LearningPortal.LearningPortal.repository.FavoriteRepository;
import com.LearningPortal.LearningPortal.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private CourseRepository courseRepository;
	@Autowired
	private EnrollmentRepository enrollmentRepository;
	@Autowired
	private FavoriteRepository favouriteRepository;
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private CourseMapper courseMapper;

	public Userdto saveUser(Userdto dto) {
		UserEntity entity = userMapper.toEntity(dto);
		userRepository.save(entity);
		return userMapper.toDto(entity);

	}

	public Userdto findUserById(Long userId) {
		Optional<UserEntity> userOptional = userRepository.findById(userId);
		UserEntity user = userOptional.get();
		return userMapper.toDto(user);

	}

	public List<Userdto> findAllUsers() {
		List<UserEntity> entitylist = userRepository.findAll();
		return userMapper.toDto(entitylist);
	}

	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}

	public Userdto updateUser(Userdto dto, Long id) {
		Optional<UserEntity> checkExistinguser = userRepository.findById(id);
		if (!checkExistinguser.isPresent())
			log.error("User Id " + id + " Not Found!");

		UserEntity entity = userMapper.toEntity(dto);
		userRepository.save(entity);
		return userMapper.toDto(entity);
	}
}