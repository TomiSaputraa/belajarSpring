package com.belajar.belajarspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.belajar.belajarspring.service.HeroService;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/hero")
@Api(value = "Hero Controller")
public class HeroMLBBController {

    // auto wired digunakan sebagai automatic dependency injection.
    // autowired bisa digunakan seperti ini
    @Autowired
    HeroService heroService;

    // atau bisa digunakan dengan constructor seperti ini
    // @Autowired
    // public HeroMLBBController(HeroService heroService) {
    // this.heroService = heroService;
    // }

    // Read
    @GetMapping("/daftar-hero")
    // @Operation digunakan untuk menampilkan deskripsi api di web swagger
    @Operation(description = "API untuk melihat daftar hero")
    public List<Hero> daftarHero() {
        // cara pemanggilan class service tadi disini
        return heroService.daftarHero();
    }

    // Create
    @PostMapping(path = "tambah")
    @Operation(description = "API untuk tambah daftar hero")
    public Hero tambahDataHero(@RequestBody Hero request) {
        return heroService.tambahDataHero(request);
    }

    // update
    @PutMapping(path = "/ubah/{id}")
    @Operation(description = "API untuk ubah daftar hero")
    public Boolean updateData(@RequestBody Hero request, @PathVariable Integer id) {
        return heroService.updateData(request, id);
    }

    // update partial data
    @PatchMapping(path = "/ubah-status/{id}")
    @Operation(description = "API untuk ubah status daftar hero")
    public boolean ubahStatus(@PathVariable Integer id, @RequestParam Boolean isNewHero) {
        return heroService.ubahStatus(id, isNewHero);
    }

    // delete
    @DeleteMapping(path = "/hapus/{id}")
    @Operation(description = "API untuk hapus daftar hero")
    public Boolean hapusData(@PathVariable Integer id) {
        return heroService.hapusData(id);
    }
}
