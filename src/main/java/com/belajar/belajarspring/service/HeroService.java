package com.belajar.belajarspring.service;

import java.util.List;

import com.belajar.belajarspring.model.Hero;

// Pertama kita bikin class interface lalu kita akan implementasikan 
// Class ini akan digunakan sebagai blue print di class yang akan meimplementasikan
public interface HeroService {
    List<Hero> daftarHero();

    Hero tambahDataHero(Hero request);

    boolean updateData(Hero request, Integer id);

    boolean ubahStatus(Integer id, boolean isNewHero);

    boolean hapusData(Integer id);
}
