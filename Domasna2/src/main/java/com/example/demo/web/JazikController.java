package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/jazik")
public class JazikController {

    @GetMapping("/en")
    public String smenijazik(HttpServletRequest httpServletRequest)
    {
        httpServletRequest.setAttribute("en",1);

        return "home";

    }

    @GetMapping("/mk")
    public String smenijaziks(HttpServletRequest httpServletRequest)
    {
        httpServletRequest.setAttribute("en",null);

        return "home";

    }


}
