package com.naresh.WebMvc.controller;

import com.naresh.WebMvc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {

  @RequestMapping(value = "/home", method = RequestMethod.GET)
  public String home() {
    return "home";
  }

  @RequestMapping(value = "/about", method = RequestMethod.GET)
  public String profile() {
    return "about";
  }


  @RequestMapping(value = "/register",method = RequestMethod.GET)
  public String registerPage() {
    return "user-form";
  }

  @RequestMapping(value = "/register",method = RequestMethod.POST)
  public String register(@ModelAttribute("user")User user, BindingResult result) {
    if(result.hasErrors()){
      return "user-form";
    }
    return "success";
  }
}
