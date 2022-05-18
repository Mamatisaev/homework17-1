package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Chicken chicken1 = new Chicken(34, 4, "male", "Chick");
        Chicken chicken2 = new Chicken(25, 6, "female", "Duck");
        Chicken chicken3 = new Chicken(63, 3, "male", "Swan");
        Chicken chicken4 = new Chicken(35, 2, "female", "Birdy");

        Goat goat1 = new Goat(43, 1, "male", "Goaty", "red");
        Goat goat2 = new Goat(52, 4, "female", "Reedy", "white");
        Goat goat3 = new Goat(53, 5, "male", "Create", "black");
        Goat goat4 = new Goat(23, 2, "female", "Calm", "pink");
        Goat goat5 = new Goat(76, 6, "male", "Friend", "green");
        Goat goat6 = new Goat(63, 3, "female", "Messi", "blue");

        Turkey turkey1 = new Turkey(43, 5, "male", "Turkey");
        Turkey turkey2 = new Turkey(32, 2, "female", "Trolly");
        Turkey turkey3 = new Turkey(65, 1, "male", "Frog");

        Chicken[] farm1chicken = new Chicken[]{chicken1, chicken2, chicken3};
        Chicken[] farm2chicken = new Chicken[]{chicken4};

        Goat[] farm1goat = new Goat[]{goat1, goat2, goat3, goat4, goat5};
        Goat[] farm2goat = new Goat[]{goat6};

        Turkey[] farm1turkey = new Turkey[]{turkey1, turkey2};
        Turkey[] farm2turkey = new Turkey[]{turkey3};

        Farm farm1 = new Farm("Dordoi", "Tom", farm1chicken, farm1goat, farm1turkey);
        System.out.println("* - * - * - * FARM No: 1 * - * - * - *");
        System.out.println(farm1);
        Farm farm2 = new Farm("Archa", "Michael", farm2chicken, farm2goat, farm2turkey);
        System.out.println("* - * - * - * FARM No: 2 * - * - * - *");
        System.out.println(farm2);
    }
}
