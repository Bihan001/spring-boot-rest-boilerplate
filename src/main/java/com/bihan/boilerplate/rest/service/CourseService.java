package com.bihan.boilerplate.rest.service;

import com.bihan.boilerplate.rest.dto.StudentCourse;
import com.bihan.boilerplate.rest.model.Course;

public interface CourseService {

    Course getCourseById(Long courseId);

    Course createNewCourse(Course course);

    Course enrollStudentToCourse(StudentCourse studentCourse);

}
