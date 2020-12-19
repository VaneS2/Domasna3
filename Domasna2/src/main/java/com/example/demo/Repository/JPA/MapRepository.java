package com.example.demo.Repository.JPA;

import com.example.demo.model.Apteka;
import com.example.demo.model.Mapp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface MapRepository extends JpaRepository<Mapp,Long> {


}
