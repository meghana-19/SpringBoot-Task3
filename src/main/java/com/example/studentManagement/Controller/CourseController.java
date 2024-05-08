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
import com.example.studentManagement.Service.CourseService;

@Controller
@RequestMapping("/course")
public class CourseController {
    
    @Autowired
    private CourseService service;
    
    @GetMapping("/addcourse")
    public String add(Model model)
    {
        List<Course> courses = service.listAll();
        model.addAttribute("listcourse", courses);
        model.addAttribute("course", new Course());
        return "addcourse";
    }
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
        public String saveCourse(@ModelAttribute("course") Course course)
        {
        service.save(course);
        return "course";
        }
    
    @RequestMapping("/edit/{id}")
    public ModelAndView showCoursePage(@PathVariable(name = "id") int id)
    {
        ModelAndView modelView =  new ModelAndView("addcourse");
        Course course = service.get(id);
        modelView.addObject("course", course);
        return modelView;
    }
    
    @RequestMapping("/delete/{id}")
    public String deleteCoursePage(@PathVariable(name = "id") int id)
    {
        service.delete(id);
        return "course";
    }
    

}
