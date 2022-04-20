package com.bihan.boilerplate.rest.service;

import com.bihan.boilerplate.rest.dto.StudentLocation;
import com.bihan.boilerplate.rest.model.Student;

public interface StudentService {

    StudentLocation getStudentLocation(Long id);

    Student getStudentById(Long id);

    Student createNewStudent(Student student);
}
