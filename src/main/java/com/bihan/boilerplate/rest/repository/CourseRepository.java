package com.bihan.boilerplate.rest.repository;

import com.bihan.boilerplate.rest.model.Course;
import com.bihan.boilerplate.rest.repository.custom.CustomCourseRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface CourseRepository extends JpaRepository<Course, Long>, CustomCourseRepository {

    @Modifying
    @Query(nativeQuery = true, value = "INSERT INTO student_courses (student_id, course_id) VALUES (?1, ?2)")
    void enrollStudentInCourse(Long studentId, Long courseId);

}
