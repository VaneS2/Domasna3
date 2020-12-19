package com.example.demo.Service;

import com.example.demo.Repository.JPA.MapRepository;
import com.example.demo.model.Mapp;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MappServiceImpl implements MapService {

   private final MapRepository mapRepository;

    public MappServiceImpl(MapRepository mapRepository) {
        this.mapRepository = mapRepository;
    }


    @Override
    public List<Mapp> findall() {
      return  this.mapRepository.findAll();
    }
}
