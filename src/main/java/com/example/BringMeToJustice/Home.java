package com.example.BringMeToJustice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Home {
    @GetMapping("/home")
    public String home(@RequestParam(name = "name", required = true, defaultValue = "Unknown") String name, Model model){
        model.addAttribute("name", name);
        return "home";
    }
}
