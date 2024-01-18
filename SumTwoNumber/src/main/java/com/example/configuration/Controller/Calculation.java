package com.example.configuration.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home")
public class Calculation {
    @GetMapping()
    public String showHome() {
        return "home";
    }
    @GetMapping("/results")
    public String showResults(@RequestParam("number1") int number1, @RequestParam("number2") int number2, Model model) {
        int result = number1 + number2;
        model.addAttribute("results", result);
        return "results";

    }

}
