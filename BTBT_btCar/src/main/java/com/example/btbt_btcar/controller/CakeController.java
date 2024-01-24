package com.example.btbt_btcar.controller;

import com.example.btbt_btcar.model.Cake;
import com.example.btbt_btcar.service.CakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


@Controller
@RequestMapping("/cake")
public class CakeController {
    @Autowired
    private CakeService cakeService;

    @GetMapping()
    public String showhome ( Model model ) {
        List<Cake> listcake = cakeService.getCakeList ( );
        System.out.println ( listcake );
        model.addAttribute ( "list", listcake );
        return "/homeCake";
    }


    @GetMapping("/add")
    public String add ( Model model ) {
        Cake cake = new Cake( );
        model.addAttribute ( "cake", cake );

        return "/createCake";
    }


    @PostMapping("/createCake")
    public String createProduct ( @ModelAttribute("cake") Cake cake, RedirectAttributes redirectAttributes ) {

        cakeService.createCake ( cake );

        System.out.println (cake );
        redirectAttributes.addFlashAttribute ( "message", "Create successfully" );

        return "redirect:/cake";
    }
}
