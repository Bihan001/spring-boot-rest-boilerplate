package com.bihan.boilerplate.rest.repository;

import java.util.Optional;

import com.bihan.boilerplate.rest.dto.StudentLocation;
import com.bihan.boilerplate.rest.model.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("SELECT new com.bihan.boilerplate.rest.dto.StudentLocation(s.id, s.address, s.city, s.state, s.zip, s.country) FROM Student s WHERE s.id = ?1")
    Optional<StudentLocation> findStudentLocationById(Long id);

}