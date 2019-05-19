package com.sda.game.spell;


import com.sda.game.weapon.WeaponType;

import java.math.BigDecimal;

public class SpellFactory {
    public static Spell start(){
        return new Spell("Stone", WeaponType.SPELL, 20,0,new BigDecimal(0),10);
    }
    public static Spell fire() {
        return new Spell("Fire,", WeaponType.SPELL, 80, 0, new BigDecimal(3000),10);
    }

    public static Spell water() {
        return new Spell("Water", WeaponType.SPELL, 100, 0, new BigDecimal(4000),10);
    }

    public static Spell earth() {
        return new Spell("Earth", WeaponType.SPELL, 120, 0, new BigDecimal(5000),10);
    }
}



