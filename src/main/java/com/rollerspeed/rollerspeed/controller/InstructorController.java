package com.rollerspeed.rollerspeed.controller;

import com.rollerspeed.rollerspeed.model.Instructor;
import com.rollerspeed.rollerspeed.service.InstructorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/instructores")
public class InstructorController {

    private final InstructorService service;

    public InstructorController(InstructorService service) {
        this.service = service;
    }

    @GetMapping("/registro")
    public String mostrarFormulario(Model model) {
        model.addAttribute("instructor", new Instructor());
        return "instructors/registro";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Instructor instructor) {
        service.save(instructor);
        return "redirect:/instructores/listar";
    }

    @GetMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("instructors", service.findAll());
        return "instructors/listar";
    }
}
