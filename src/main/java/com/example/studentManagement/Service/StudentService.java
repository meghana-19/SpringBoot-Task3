package com.example.studentManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentManagement.Model.Student;
import com.example.studentManagement.Repository.StudentRepository;

@Service
public class StudentService {
    
    @Autowired
    private StudentRepository repo;

    public List<Student> listAll() {
        
       System.out.println(repo.findAll());
       return repo.findAll();
    }
    
    public void save(Student student)
    {
        repo.save(student);
    }
    
    public Student get(long id)
    {
        return repo.findById(id).get();
    }
    
    public void delete(long id)
    {
        repo.deleteById(id);
    }
    

}
