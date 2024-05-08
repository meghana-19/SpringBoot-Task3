package com.example.studentManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.studentManagement.Model.Course;
import com.example.studentManagement.Model.Student;
import com.example.studentManagement.Service.CourseService;
import com.example.studentManagement.Service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
    
    @Autowired
    private StudentService service;
    
    @Autowired
    private CourseService services;
    
    @GetMapping("/addstudent")
    public String add(Model model)
    {
        List<Student> students = service.listAll();
        List<Course> course = services.listAll();
        
        model.addAttribute("liststudent", students);
        model.addAttribute("student", new Student());
        return "addstudent";
    }
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveStudent(@ModelAttribute("student") Student student)
    {
        service.save(student);
        return "student";
    }
    
    @RequestMapping("/edit/{id}")
    public ModelAndView showStudentPage(@PathVariable(name = "id") int id)
    {
        ModelAndView modelView = new ModelAndView("addstudent");
        List<Course> course = services.listAll();
        
        Student stud = service.get(id);
        modelView.addObject("student", stud);
        return modelView;
    }
    
    @RequestMapping("/delete/{id}")
    public String deleteStudentPage(@PathVariable(name = "id") int id)
    {
        service.delete(id);
        return "student";
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
