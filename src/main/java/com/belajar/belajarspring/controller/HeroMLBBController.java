package com.belajar.belajarspring.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model.Hero;

@RestController
@RequestMapping("/hero")
public class HeroMLBBController {

    // menjadikan data model Hero menjadi list
    // lalu di tambahkan data listnya dalam function daftarHero
    public List<Hero> heroes = new ArrayList<>();
    public int counter = 1;

    // Read
    @GetMapping("/daftar-hero")
    public List<Hero> daftarHero() {
        // menambah data secara manual
        // heroes.add(new Hero(1, "balmond", 100));
        // heroes.add(new Hero(2, "miya", 200));
        // heroes.add(new Hero(3, "hanzo", 500));
        // heroes.add(new Hero(4, "tigreal", 500));
        // heroes.add(new Hero(5, "zilong", 300));
        return heroes;
    }

    // Create
    @PostMapping(path = "tambah")
    public Hero tambahDataHero(@RequestBody Hero request) {
        request.setId(counter); // auto add id
        heroes.add(request);
        counter++; // auto add id
        return request;

    }

    // update
    @PutMapping(path = "/ubah/{id}")
    public Boolean updateData(@RequestBody Hero request, @PathVariable Integer id) {
        final Optional<Hero> result = heroes.stream().filter(hero -> hero.getId() == id).findFirst();
        if (result.isPresent()) {
            result.get().setName(request.getName());
            result.get().setDamage(request.getDamage());
            return true;
        } else {
            return false;
        }
    }

    // update partial data
    @PatchMapping(path = "/ubah-status/{id}")
    public boolean ubahStatus(@PathVariable Integer id, @RequestParam Boolean isNewHero) {
        Optional<Hero> result = heroes.stream().filter(hero -> hero.getId() == id).findFirst();
        if (result.isPresent()) {
            result.get().setIsNewHero(isNewHero);
            return true;
        } else {
            return false;
        }
    }

    // delete
    @DeleteMapping(path = "/hapus/{id}")
    public Boolean hapusData(@PathVariable Integer id) {
        Optional<Hero> result = heroes.stream().filter(hero -> hero.getId() == id).findFirst();
        if (result.isPresent()) {
            heroes.remove(result.get());
            return true;
        } else {
            return false;
        }
    }
}
