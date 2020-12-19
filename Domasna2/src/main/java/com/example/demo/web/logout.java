package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/logout")
public class logout {

    @GetMapping
    public String odjavi(HttpSession httpSession)
    {
        httpSession.setAttribute("user",null);

        return "redirect:/home";

    }
}
