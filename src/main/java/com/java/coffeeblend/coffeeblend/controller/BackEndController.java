package com.java.coffeeblend.coffeeblend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/backend")
public class BackEndController {
    public String dashboard(){
        return "backend/dashboard";
    }
    public String profile(){
        return "backend/profile";
    }
    public String signin(){
        return "backend/sign-in";
    }
    public String signup(){
        return "backend/sign-up";
    }
    public String tables(){
        return "backend/tables";
    }
}
