package com.example.demo.Repository.JPA;

import com.example.demo.model.Apteka;
import com.example.demo.model.Mapp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SiteApteki extends JpaRepository<Apteka,Long> {


    @Query("select u from Apteka u where u.ime like %?1% or u.adresa like %?1% or u.lokacija like %?1%" +
            "or u.dejnosti like %?1% ")
    List<Apteka> find(String text);



}
