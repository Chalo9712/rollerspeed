package com.rollerspeed.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/institucional/mision")
    public String mision() {
        return "institucional/mision";
    }

    @GetMapping("/institucional/vision")
    public String vision() {
        return "institucional/vision";
    }

    @GetMapping("/institucional/valores")
    public String valores() {
        return "institucional/valores";
    }

    @GetMapping("/institucional/servicios")
    public String servicios() {
        return "institucional/servicios";
    }

    @GetMapping("/institucional/eventos")
    public String eventos() {
        return "institucional/eventos";
    }
}
