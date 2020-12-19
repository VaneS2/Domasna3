package com.example.demo.web;

import com.example.demo.Service.AptekaService;
import com.example.demo.Service.MapService;
import com.example.demo.model.Mapp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/home")
public class AptekaController {
    private final AptekaService aptekaService;
    private final MapService mapService;

    public AptekaController(AptekaService aptekaService, MapService mapService) {
        this.aptekaService = aptekaService;
        this.mapService = mapService;
    }




    @GetMapping
    public String addBallonPage(Model model,@RequestParam(required = false) String search,HttpSession session,HttpServletRequest req)
    {

        if(session.getAttribute("en")!=null)
        {
            return "redirect:/jazik/en";

    }
        else{
            return "redirect:/jazik/mk";

        }


        }




    @GetMapping("/apteki")
    public String SiteApteki(Model model, @RequestParam(required = false) String search, HttpSession request)
    {

            request.setAttribute("koj",null);

            model.addAttribute("apteki",aptekaService.findallPharmacy());


            return "SiteApteki";}


    }





