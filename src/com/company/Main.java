package com.company;

public class Main {
    private static Object HavingSuperAbility;

    //● В классе Main создать массив из 3х разных героев, затем через цикл применить
//суперспособность каждого героя.
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Magic magic = new Magic();
        Medic medic = new  Medic();

        Hero hero[] = {warrior, magic, medic};
        for (int i = 0; i < hero.length; i++) {
            hero[i].applySuperAbility(" ");
        }
    }
}
