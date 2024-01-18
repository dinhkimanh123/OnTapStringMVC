package com.example.configuration.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/threeNumber")
public class SumThreeNumber {
    @GetMapping()
    public String showHome() {
        return "threeNumber";
    }
    @GetMapping("/results")
    public String showResults(@RequestParam("number1") int number1, @RequestParam("number2") int number2,@RequestParam("number3") int number3, Model model) {
        int result = number1 + number2 + number3;
        model.addAttribute("results", result);
        return "results";

    }

}