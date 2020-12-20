package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Mapp {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    float lon;
    float lat;
    String name;

    public Mapp(Long id, float lon, float lat,String name) {
        this.name=name;
        this.lon = lon;
        this.lat = lat;
    }

    public Mapp() {
    }
}
