package com.satwik.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

    @GetMapping("/")
    public ModelAndView welcome() {

        ModelAndView mv = new ModelAndView("welcome");

        mv.addObject("name", "Satwik");
        mv.addObject("message", "Welcome to my Spring MVC application!");

        return mv;
    }

    @GetMapping("/about")
    public ModelAndView about() {

        ModelAndView mv = new ModelAndView("about");

        mv.addObject("title", "About Us");
        mv.addObject("message", "This is the About page of my Spring MVC application.");

        return mv;
    }
}