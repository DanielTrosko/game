package com.sda.game.monster;

import com.sda.game.person.Person;
import com.sda.game.person.PersonType;
import com.sda.game.weapon.Weapon;

public class Monster extends Person {

    Monster(String name, PersonType personType, Integer level, Integer healthPoint, Integer manaPoint, Weapon weapon) {
        super(name, personType, level, healthPoint, manaPoint, weapon);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public PersonType getPersonType() {
        return super.getPersonType();
    }

    @Override
    public Integer getLevel() {
        return super.getLevel();
    }

    @Override
    public Integer getHealthPoint() {
        return super.getHealthPoint();
    }

    @Override
    public Integer getManaPoint() {
        return super.getManaPoint();
    }

    @Override
    public Weapon getWeapon() {
        return super.getWeapon();
    }

    @Override
    public void setLevel(Integer level) {
        super.setLevel(level);
    }

}
