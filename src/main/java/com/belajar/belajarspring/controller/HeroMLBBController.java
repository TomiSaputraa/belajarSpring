package com.belajar.belajarspring.controller;

import java.util.List;

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

import com.belajar.belajarspring.model.Hero;

@RestController
@RequestMapping("/hero")
public class HeroMLBBController {

    // menjadikan data model Hero menjadi list
    // lalu di tambahkan data listnya dalam function daftarHero

    // Read
    @GetMapping("/daftar-hero")
    public List<Hero> daftarHero() {

    }

    // Create
    @PostMapping(path = "tambah")
    public Hero tambahDataHero(@RequestBody Hero request) {

    }

    // update
    @PutMapping(path = "/ubah/{id}")
    public Boolean updateData(@RequestBody Hero request, @PathVariable Integer id) {

    }

    // update partial data
    @PatchMapping(path = "/ubah-status/{id}")
    public boolean ubahStatus(@PathVariable Integer id, @RequestParam Boolean isNewHero) {

    }

    // delete
    @DeleteMapping(path = "/hapus/{id}")
    public Boolean hapusData(@PathVariable Integer id) {

    }
}
