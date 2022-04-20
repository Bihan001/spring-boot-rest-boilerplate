package com.bihan.boilerplate.rest.service.impl;

import java.util.Optional;

import com.bihan.boilerplate.rest.dto.StudentLocation;
import com.bihan.boilerplate.rest.exception.ResourceNotFoundException;
import com.bihan.boilerplate.rest.model.Student;
import com.bihan.boilerplate.rest.repository.StudentRepository;
import com.bihan.boilerplate.rest.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public StudentLocation getStudentLocation(Long id) {
        Optional<StudentLocation> studentLocation = studentRepository.findStudentLocationById(id);
        if (!studentLocation.isPresent()) {
            throw new ResourceNotFoundException("Student Location", "id", id.toString());
        }
        return studentLocation.get();
    }

    @Override
    public Student getStudentById(Long id) {
        Optional<Student> student = studentRepository.findById(id);
        if (!student.isPresent()) {
            throw new ResourceNotFoundException("Student", "id", id.toString());
        }
        return student.get();
    }

    @Override
    public Student createNewStudent(Student student) {
        try {
            return studentRepository.save(student);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
