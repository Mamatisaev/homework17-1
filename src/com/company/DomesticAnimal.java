package com.company;

public abstract class DomesticAnimal extends Animal {
    private String gender;
    private String nickName;

    public DomesticAnimal(int weight, int age, String gender, String nickName) {
        super(weight, age);
        this.gender = gender;
        this.nickName = nickName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "gender = " + gender +
                " nickName = " + nickName;
    }
}
