package com.example.studentManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentManagement.Model.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
