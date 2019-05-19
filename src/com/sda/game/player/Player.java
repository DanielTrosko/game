package com.sda.game.player;

import com.sda.game.person.Person;
import com.sda.game.person.PersonType;
import com.sda.game.place.Place;
import com.sda.game.spell.Spell;
import com.sda.game.weapon.Weapon;

import java.math.BigDecimal;

public class Player extends Person {
private BigDecimal wallet;
private Spell spells;
private Place place;

    public Player(String name, PersonType personType, Integer level, Integer healthPoint, Integer manaPoint, Weapon weapon, BigDecimal wallet, Place place, Spell spells) {
        super(name, personType, level, healthPoint, manaPoint, weapon);

        this.wallet = wallet;
        this.spells = spells;
        this.place = place;
    }

    public BigDecimal getWallet() {
        return wallet;
    }

    public Spell getSpells() {
        return spells;
    }

    public void setSpells(Spell spells) {
        this.spells = spells;
    }

    public void setWallet(BigDecimal wallet) {
        this.wallet = wallet;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

}
