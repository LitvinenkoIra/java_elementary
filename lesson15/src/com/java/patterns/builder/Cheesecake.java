package com.java.patterns.builder;

public class Cheesecake {

    private String name;
    private int weight;
    private int fat;
    private int carbohydrate;
    private int protein;
    private String vitamins;

    public static class Builder {
        private String name;
        private int weight;
        private int fat;
        private int carbohydrate;
        private int protein;
        private String vitamins;

        public Builder(String name, int weight) {
            this.name = name;
            this.weight = weight;
        }

        public Builder fat(int value) {
            this.fat = value;
            return this;
        }

        public Builder carbohydrate(int value) {
            this.carbohydrate = value;
            return this;
        }

        public Builder protein(int value) {
            this.protein = value;
            return this;
        }

        public Builder vitamins(String value) {
            this.vitamins = value;
            return this;
        }

        public Cheesecake build() {
            return new Cheesecake(this);
        }
    }

    private Cheesecake(Builder builder) {
        this.name = builder.name;
        this.weight = builder.weight;
        this.fat = builder.fat;
        this.carbohydrate = builder.carbohydrate;
        this.protein = builder.protein;
        this.vitamins = builder.vitamins;
    }
}
