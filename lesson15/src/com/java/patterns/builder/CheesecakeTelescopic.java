package com.java.patterns.builder;

public class CheesecakeTelescopic {

    private String name;
    private int weight;
    private int fat;
    private int carbohydrate;
    private int protein;
    private String vitamins;

    public CheesecakeTelescopic(String name, int weight) {
        this(name, weight, 1);
    }

    public CheesecakeTelescopic(String name, int weight, int fat) {
        this(name, weight, fat, 5);
    }

    public CheesecakeTelescopic(String name, int weight, int fat, int carbohydrate) {
        this(name, weight, fat, carbohydrate, 3);
    }

    public CheesecakeTelescopic(String name, int weight, int fat, int carbohydrate, int protein) {
        this(name, weight, fat, carbohydrate, protein, "A, B, C");
    }

    public CheesecakeTelescopic(String name, int weight, int fat, int carbohydrate, int protein, String vitamins) {
        this.name = name;
        this.weight = weight;
        this.fat = fat;
        this.carbohydrate = carbohydrate;
        this.protein = protein;
        this.vitamins = vitamins;
    }
}
