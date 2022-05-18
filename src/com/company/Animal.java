package com.company;

public abstract class Animal {
    private int weight;
    private int age;

    public Animal(int weight, int age) {
        this.weight = weight;
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "weight = " + weight +
                " age = " + age;
    }
}
