package com.niit.moonwalkfrontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController{
    @RequestMapping("/")
     public String printHello(ModelMap model) {
        
      return "index";
     }
}
