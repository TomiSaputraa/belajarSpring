package com.model;

public class Hero {

    // id sebagai uniqe identifier
    private int id;

    private String name;
    private int damage;

    private Boolean isNewHero;

    public Hero(int id, String name, int damage, Boolean isNewHero) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.isNewHero = isNewHero;
    }

    public Hero() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Boolean getIsNewHero() {
        return isNewHero;
    }

    public void setIsNewHero(Boolean isNewHero) {
        this.isNewHero = isNewHero;
    }

}
