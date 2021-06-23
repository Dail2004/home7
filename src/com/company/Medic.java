package com.company;
//● Создать 3 класса героев Magic, Medic, Warrior и наследовать их от класса Hero. В
//каждом классе по своему реализовать метод applySuperAbility(String
//superAbilityType) следующим образом - просто распечатать что то вроде того
//“Warrior применил суперспособность CRITICAL DAMAGE”.
public class Medic extends Hero {
    @Override
    public void applySuperAbility(String superAbilityType) {
        super.applySuperAbility("HolyPower");
        System.out.println("Medic применил суперспособность CRITICAL DAMAGE");
    }
}
