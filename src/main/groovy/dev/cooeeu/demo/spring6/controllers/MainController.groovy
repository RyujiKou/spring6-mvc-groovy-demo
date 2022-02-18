package dev.cooeeu.demo.spring6.controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MainController {
    @GetMapping('/')
    String index(Model model) {
        model.addAttribute("title", "Spring MVC 6 Groovyデモ")
        'index'
    }
}
