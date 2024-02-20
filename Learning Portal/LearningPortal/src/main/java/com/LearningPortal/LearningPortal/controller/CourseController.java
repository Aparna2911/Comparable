package com.LearningPortal.LearningPortal.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LearningPortal.LearningPortal.entity.CourseEntity;
import com.LearningPortal.LearningPortal.service.CourseService;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public List<CourseEntity> findAllCourses() {
        return courseService.findAllCourses();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CourseEntity> findCourseById(@PathVariable("id") Long id) {
        CourseEntity course = courseService.findCourseById(id);
        return ResponseEntity.ok(course);
    }

    @PostMapping
    public CourseEntity saveCourse(@RequestBody CourseEntity courseEntity) {
        return courseService.saveCourse(courseEntity);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CourseEntity> updateCourse(@PathVariable("id") Long id, @RequestBody CourseEntity courseEntity) {
        courseEntity.setCourse_id(id);
        CourseEntity updatedCourse = courseService.updateCourse(courseEntity);
        return ResponseEntity.ok(updatedCourse);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCourse(@PathVariable("id") Long id) {
        courseService.deleteCourse(id);
        return ResponseEntity.noContent().build();
    }
}

