package com.example.demo.Service;


import com.example.demo.Repository.JPA.SiteApteki;
import com.example.demo.model.Apteka;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AptekaServiceImpl  implements AptekaService{
    private final SiteApteki siteApteki;

    public AptekaServiceImpl( SiteApteki siteApteki) {
        this.siteApteki = siteApteki;

    }

    @Override
    public List<Apteka> findallPharmacy() {
     return  siteApteki.findAll();
    }

    @Override
    public List<Apteka> findbyC(String text) {
       return siteApteki.find(text);
    }

    @Override
    public Apteka findbyId(Long id) {
        Apteka a= new Apteka();
       return siteApteki.findById(id).orElse(a);

    }
}
