package com.example.demo.web;

import com.example.demo.Service.AptekaService;
import com.example.demo.model.Apteka;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/search")
public class search {
    private final AptekaService aptekaService;

    public search(AptekaService aptekaService) {
        this.aptekaService = aptekaService;
    }


    @GetMapping
    public String pokategorija(Model model,HttpServletRequest request)
    {

        String d=request.getParameter("search");
        request.setAttribute("koj",d);


       List<Apteka> lista= aptekaService.findbyC(d);

       if(lista.size()==0)
       {
           String [] niza=d.split("");
          niza[0]= niza[0].toUpperCase();
          String cc="";
           for(int i=0;i<niza.length;i++)
           {
              cc+=niza[i];
           }

           lista=aptekaService.findbyC(cc);

       }

        model.addAttribute("apteki",lista);
        model.addAttribute("tekst",d);

        return "SiteApteki";
    }
}
