package com.rollerspeed.rollerspeed.controller;

import com.rollerspeed.rollerspeed.model.ClassSchedule;
import com.rollerspeed.rollerspeed.service.ClassScheduleService;
import com.rollerspeed.rollerspeed.service.InstructorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/clases")
public class ClassScheduleController {

    private final ClassScheduleService scheduleService;
    private final InstructorService instructorService;

    public ClassScheduleController(ClassScheduleService scheduleService,
                                   InstructorService instructorService) {
        this.scheduleService = scheduleService;
        this.instructorService = instructorService;
    }

    @GetMapping("/registro")
    public String mostrarFormulario(Model model) {
        model.addAttribute("classSchedule", new ClassSchedule());
        model.addAttribute("instructors", instructorService.findAll());
        return "classes/registro";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute ClassSchedule schedule) {
        scheduleService.save(schedule);
        return "redirect:/clases/listar";
    }

    @GetMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("classes", scheduleService.findAll());
        return "classes/listar";
    }
}
