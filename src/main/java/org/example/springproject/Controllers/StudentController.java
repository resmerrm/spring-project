package org.example.springproject.Controllers;

import org.example.springproject.Entities.Student;
import org.example.springproject.Service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
//@RequestMapping("/")
public class StudentController {

    private StudentService studentService;
    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }
    @GetMapping("/students")
    public String listStudents(Model model)
    {
        model.addAttribute("students",studentService.GetAllStudents());
        return "students";
    }
    @GetMapping("/students/new")
    public String CreateStudentForm(Model model){
        Student student = new Student();
        model.addAttribute("student",student);
        return  "create_student";

    }
    @PostMapping("/students")
    public String SaveStudent(@ModelAttribute("student")Student student)
    {
        studentService.saveStudent(student);
        return "redirect:/students";
    }
}