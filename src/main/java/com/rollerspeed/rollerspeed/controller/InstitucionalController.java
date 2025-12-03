package com.rollerspeed.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/institucional")
public class InstitucionalController {

    @GetMapping("/mision")
    public String mision() {
        return "institucional/mision";
    }

    @GetMapping("/vision")
    public String vision() {
        return "institucional/vision";
    }

    @GetMapping("/valores")
    public String valores() {
        return "institucional/valores";
    }

    @GetMapping("/servicios")
    public String servicios() {
        return "institucional/servicios";
    }

    @GetMapping("/eventos")
    public String eventos() {
        return "institucional/eventos";
    }
}
