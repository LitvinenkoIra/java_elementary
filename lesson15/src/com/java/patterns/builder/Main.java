package com.java.patterns.builder;

public class Main {

    public static void main(String[] args) {

        CheesecakeTelescopic cheesecake = new CheesecakeTelescopic("Lemon cheese", 100);
        CheesecakeTelescopic cheesecake1 = new CheesecakeTelescopic("Berry cheese", 100, 34, 45, 67, "A, D");

        CheesecakeBean cheesecakeBean = new CheesecakeBean();
        cheesecakeBean.setName("Lemon cheese");
        cheesecakeBean.setWeight(100);

        Cheesecake.Builder builder = new Cheesecake.Builder("Lemon cheese", 100);
        builder.fat(5);
        builder.protein(3);
        builder.vitamins("A,B,C");
        Cheesecake chees2 = builder.build();

        Cheesecake cheese = new Cheesecake.Builder("Lemon cheese", 100).fat(5).protein(3).vitamins("A,B,C").build();

        //Cheesecake cheese3 = new Cheesecake(); //can't create from private constructor
    }
}
