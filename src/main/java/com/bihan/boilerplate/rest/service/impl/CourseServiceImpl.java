package com.bihan.boilerplate.rest.service.impl;

import java.util.Optional;

import com.bihan.boilerplate.rest.dto.StudentCourse;
import com.bihan.boilerplate.rest.exception.ResourceNotFoundException;
import com.bihan.boilerplate.rest.model.Course;
import com.bihan.boilerplate.rest.repository.CourseRepository;
import com.bihan.boilerplate.rest.service.CourseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Course getCourseById(Long courseId) {
        Optional<Course> course = courseRepository.findById(courseId);
        if (!course.isPresent()) {
            throw new ResourceNotFoundException("Course", "id", courseId.toString());
        }
        return course.get();
    }

    @Override
    public Course createNewCourse(Course course) {
        try {
            return courseRepository.save(course);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Course enrollStudentToCourse(StudentCourse studentCourse) {
        try {
            courseRepository.enrollStudentInCourse(studentCourse.getStudentId(),
                    studentCourse.getCourseId());
            return courseRepository.findById(studentCourse.getCourseId()).get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}