package com.rollerspeed.rollerspeed.controller;

import com.rollerspeed.rollerspeed.model.Student;
import com.rollerspeed.rollerspeed.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/students")   // prefijo para todas las rutas
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // ✔ Mostrar lista de estudiantes
    @GetMapping
    public String listStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "students/list";   // templates/students/list.html
    }

    // ✔ Mostrar formulario de registro
    @GetMapping("/new")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "students/form";   // templates/students/form.html
    }

    // ✔ Guardar estudiante
    @PostMapping
    public String saveStudent(@ModelAttribute Student student) {
        studentService.saveStudent(student);
        return "redirect:/students"; // volver al listado
    }
}
