package com.bihan.boilerplate.rest.controller;

import com.bihan.boilerplate.rest.dto.StudentCourse;
import com.bihan.boilerplate.rest.model.Course;
import com.bihan.boilerplate.rest.service.CourseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@RequestMapping("/api/v1/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping(value = "/{courseId}")
    public ResponseEntity<Course> getCourseById(@PathVariable("courseId") Long courseId) {
        return new ResponseEntity<>(courseService.getCourseById(courseId), HttpStatus.OK);
    }

    @PostMapping(value = "/new")
    public ResponseEntity<Course> createNewCourse(@RequestBody Course course) {
        return new ResponseEntity<>(courseService.createNewCourse(course), HttpStatus.OK);
    }

    @PostMapping(value = "/enroll")
    public ResponseEntity<Course> enrollStudentToCourse(@RequestBody StudentCourse studentCourse) {
        return new ResponseEntity<>(courseService.enrollStudentToCourse(studentCourse), HttpStatus.OK);
    }

}
