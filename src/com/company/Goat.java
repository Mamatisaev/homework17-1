package com.company;

public class Goat extends DomesticAnimal {
    private String color;

    public Goat(int weight, int age, String gender, String nickName, String color) {
        super(weight, age, gender, nickName);
        this.color = color;
    }

    @Override
    public String toString() {
        return "color = " + color +
                " " + super.toString();
    }
}
