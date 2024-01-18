package com.example.configuration.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calculator {
    @GetMapping("/")
    public String showCalculatorHome(){
        return "calculator";
    }

    @PostMapping("/calculate")
    public String calculatorResult(@RequestParam ("num1") int num1, @RequestParam ("num2") int num2 ,
                                   @RequestParam ("operator") String operator, Model model) {

        int result = 0;
        switch (operator){
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        model.addAttribute("result",result);
        return "result";
    }

}
