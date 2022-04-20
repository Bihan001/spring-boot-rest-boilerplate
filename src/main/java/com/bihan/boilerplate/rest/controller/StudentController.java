package com.bihan.boilerplate.rest.controller;

import com.bihan.boilerplate.rest.dto.StudentLocation;
import com.bihan.boilerplate.rest.model.Student;
import com.bihan.boilerplate.rest.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@Validated
@RequestMapping(value = "/api/v1/student", produces = "application/json")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping(value = "/new")
    public ResponseEntity<Student> createNewStudent(@RequestBody Student student) {
        return new ResponseEntity<>(studentService.createNewStudent(student), HttpStatus.OK);
    }

    @GetMapping(value = "/{studentId}")
    public ResponseEntity<Student> getStudentById(@PathVariable("studentId") Long studentId) {
        return new ResponseEntity<>(studentService.getStudentById(studentId), HttpStatus.OK);
    }

    @PostMapping(value = "/{studentId}/location")
    public ResponseEntity<StudentLocation> getStudentLocation(@PathVariable("studentId") Long studentId) {
        return new ResponseEntity<>(new StudentLocation(), HttpStatus.OK);
    }

}