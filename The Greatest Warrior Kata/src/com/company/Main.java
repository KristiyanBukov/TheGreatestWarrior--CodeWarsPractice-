package com.company;

public class Main {

    public static void main(String[] args) {

        Warrior bruce_lee = new Warrior();

        System.out.println(bruce_lee.rank());
        System.out.println(bruce_lee.achievements());
        System.out.println(bruce_lee.training("Defeated Chuck Norris", 11000, 1));
        System.out.println(bruce_lee.experience());
        System.out.println(bruce_lee.level());
        System.out.println(bruce_lee.rank());
        System.out.println(bruce_lee.battle(90));
        System.out.println(bruce_lee.experience());
        System.out.println(bruce_lee.achievements());


    }
}
