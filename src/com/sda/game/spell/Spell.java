package com.sda.game.spell;

import com.sda.game.weapon.Weapon;
import com.sda.game.weapon.WeaponType;

import java.math.BigDecimal;

public class Spell extends Weapon {
    private Integer manaCost;

    public Spell(String name, WeaponType weaponType, Integer attack, Integer defence, BigDecimal price, Integer manaCost) {
        super(name, weaponType, attack, defence, price);
        this.manaCost = manaCost;
    }

    public Integer getManaCost() {
        return manaCost;
    }

    public void setManaCost(Integer manaCost) {
        this.manaCost = manaCost;
    }
}
