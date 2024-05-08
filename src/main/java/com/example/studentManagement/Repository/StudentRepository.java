package com.example.studentManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentManagement.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

    
    
}
