package com.example.demo.web;

import com.example.demo.Service.AptekaService;
import com.example.demo.Service.MapService;
import com.example.demo.model.Apteka;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/lokator")
public class Lokator {
    private final MapService mapService;
    private final AptekaService aptekaService;

    public Lokator(MapService mapService, AptekaService aptekaService) {
        this.mapService = mapService;
        this.aptekaService = aptekaService;
    }


    @GetMapping
    public String lokator(HttpSession httpSession,Model model)
    {
        model.addAttribute("lokacii",aptekaService.findallPharmacy());

        return "primer";
    }

    @GetMapping("/search")
    public String search(HttpServletRequest httpServletRequest, Model model, @RequestParam  String search)
    {


        List<Apteka> lista=aptekaService.findbyC(search);
        if(lista.size()==0)
        {
            String [] niza=search.split("");
            niza[0]= niza[0].toUpperCase();
            String cc="";
            for(int i=0;i<niza.length;i++)
            {
                cc+=niza[i];
            }

            lista=aptekaService.findbyC(cc);

        }
        model.addAttribute("lokacii",lista);


        model.addAttribute("prebarano",search);
        System.out.println(aptekaService.findbyC(search));

        return "primer";
    }

}
