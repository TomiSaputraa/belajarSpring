package com.belajar.belajarspring.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// dibawah ini adalah contoh getter setter dengan lombok
@Getter
@Setter
// contoh cunstructor dengan lombok
@AllArgsConstructor
@NoArgsConstructor // ini adalah cunstructor tanpa parameter

public class Hero {

    // id sebagai uniqe identifier
    private int id;
    private String name;
    private int damage;
    private Boolean isNewHero;
}
