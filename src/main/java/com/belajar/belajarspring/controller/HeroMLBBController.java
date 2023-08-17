package com.belajar.belajarspring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Hero;

@RestController
@RequestMapping("/hero")
public class HeroMLBBController {

    // menjadikan data model Hero menjadi list
    // lalu di tambahkan data listnya dalam function daftarHero
    public List<Hero> heroes = new ArrayList<>();
    public int counter = 1;

    @GetMapping("/daftar-hero")
    public List<Hero> daftarHero() {
        // heroes.add(new Hero(1, "balmond", 100));
        // heroes.add(new Hero(2, "miya", 200));
        // heroes.add(new Hero(3, "hanzo", 500));
        // heroes.add(new Hero(4, "tigreal", 500));
        // heroes.add(new Hero(5, "zilong", 300));
        return heroes;
    }

    @PostMapping(path = "tambah")
    public Hero tambahDataHero(@RequestBody Hero request) {
        request.setId(counter); // auto add id
        heroes.add(request);
        counter++; // auto add id
        return request;

    }
}