package com.company;
//● Создать абстрактный класс Hero  с полями здоровье, урон и тип суперспособности
//и реализовать интерфейс HavingSuperAbility.
abstract class Hero implements HavingSuperAbility{
    @Override
    public void applySuperAbility(String superAbilityType){}
    private int damage;
    private String attackType;
    private int health;
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getAttackType() {
        return attackType;
    }

    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }
}
