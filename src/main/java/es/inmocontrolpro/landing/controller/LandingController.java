package es.inmocontrolpro.landing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LandingController {

    @GetMapping("/")
    public String mostrarInicio() {
        // Esto le dice a Spring Boot que busque un archivo llamado "index.html"
        return "index";
    }
    @GetMapping("/guia-actualizacion-alquiler-2026")
    public String guiaActualizacionAlquiler() {
        return "guia-irav";
    }
}
