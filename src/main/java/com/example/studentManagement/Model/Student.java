package com.example.studentManagement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String studentName;
    private int studentFees;
    
//    public Long getStudentId() {
//        return studentId;
//    }
//    public void setStudentId(Long studentId) {
//        this.studentId = studentId;
//    }
//    public String getStudentName() {
//        return studentName;
//    }
//    public void setStudentName(String studentName) {
//        this.studentName = studentName;
//    }
//    public int getStudentFees() {
//        return studentFees;
//    }
//    public void setStudentFees(int studentFees) {
//        this.studentFees = studentFees;
//    }
//    
    

}
