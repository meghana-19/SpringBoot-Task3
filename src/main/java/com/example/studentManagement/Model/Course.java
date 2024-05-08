package com.example.studentManagement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="course")
public class Course {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;
    private String courseName;
    private int courseDuration;
    
    
//    public Long getCourseId() {
//        return courseId;
//    }
//    public void setCourseId(Long courseId) {
//        this.courseId = courseId;
//    }
//    public String getCourseName() {
//        return courseName;
//    }
//    public void setCourseName(String courseName) {
//        this.courseName = courseName;
//    }
//    public int getCourseDuration() {
//        return courseDuration;
//    }
//    public void setCourseDuration(int courseDuration) {
//        this.courseDuration = courseDuration;
//    }
    
    

}
