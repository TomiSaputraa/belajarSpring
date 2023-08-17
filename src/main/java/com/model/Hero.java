package com.model;

public class Hero {

    // id sebagai uniqe identifier
    private int id;

    private String name;
    private int damage;

    public Hero(int id, String name, int damage) {
        this.id = id;
        this.name = name;
        this.damage = damage;
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

}
