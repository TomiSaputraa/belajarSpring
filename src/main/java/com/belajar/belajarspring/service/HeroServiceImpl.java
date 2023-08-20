package com.belajar.belajarspring.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.belajar.belajarspring.model.Hero;

// Service digunakan sebagai penanda bahwa ini adalah class service
// Service ini di gunakan juga untuk depedency injection/DI
@Service
// Untuk menggunakan autowire @Service harus sudah terpasang
public class HeroServiceImpl implements HeroService {

    public List<Hero> heroes = new ArrayList<>();
    public int counter = 1;

    // function return data dari controller di pindahkan
    // ke class implements ini
    @Override
    public List<Hero> daftarHero() {
        return heroes;
    }

    @Override
    public Hero tambahDataHero(Hero request) {
        request.setId(counter); // auto add id
        heroes.add(request);
        counter++; // auto add id
        return request;
    }

    @Override
    public boolean updateData(Hero request, Integer id) {
        final Optional<Hero> result = heroes.stream().filter(hero -> hero.getId() == id).findFirst();
        if (result.isPresent()) {
            result.get().setName(request.getName());
            result.get().setDamage(request.getDamage());
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean ubahStatus(Integer id, boolean isNewHero) {
        Optional<Hero> result = heroes.stream().filter(hero -> hero.getId() == id).findFirst();
        if (result.isPresent()) {
            result.get().setIsNewHero(isNewHero);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean hapusData(Integer id) {
        Optional<Hero> result = heroes.stream().filter(hero -> hero.getId() == id).findFirst();
        if (result.isPresent()) {
            heroes.remove(result.get());
            return true;
        } else {
            return false;
        }
    }

}
