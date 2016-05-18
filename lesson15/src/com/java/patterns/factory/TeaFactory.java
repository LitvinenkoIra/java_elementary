package com.java.patterns.factory;

public class TeaFactory {

    public Tea makeTea(String type) {
        Tea tea;

        switch (type) {
            case "green":
                tea = new GreenTea("Green Tea", 100, "in packets");
                break;
            case "black":
                tea = new BlackTea("Black Tea", 50, "without packets");
                break;
            case "fruit":
                tea = new FruitTea("Fruit Tea", 100, "in packets");
                break;
            default:
                tea = null;
        }

        return tea;
    }
}
