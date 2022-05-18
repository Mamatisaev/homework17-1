package com.company;

import java.util.Arrays;

public class Farm {
    private String address;
    private String ownerName;
    private Chicken[] chickens;
    private Goat[] goats;
    private Turkey[] turkeys;

    public Farm(String address, String ownerName, Chicken[] chickens, Goat[] goats, Turkey[] turkeys) {
        this.address = address;
        this.ownerName = ownerName;
        this.chickens = chickens;
        this.goats = goats;
        this.turkeys = turkeys;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Chicken[] getChickens() {
        return chickens;
    }

    public void setChickens(Chicken[] chickens) {
        this.chickens = chickens;
    }

    public Goat[] getGoats() {
        return goats;
    }

    public void setGoats(Goat[] goats) {
        this.goats = goats;
    }

    public Turkey[] getTurkeys() {
        return turkeys;
    }

    public void setTurkeys(Turkey[] turkeys) {
        this.turkeys = turkeys;
    }

    @Override
    public String toString() {
        return "address = " + address +
                " ownerName = " + ownerName +
                "\nchickens = " + Arrays.toString(chickens) +
                " \ngoats = " + Arrays.toString(goats) +
                " \nturkeys = " + Arrays.toString(turkeys);
    }
}
