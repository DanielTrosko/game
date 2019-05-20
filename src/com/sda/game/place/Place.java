package com.sda.game.place;

import com.sda.game.monster.Monster;
import com.sda.game.monster.MonsterFactory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Place {
    private String name;
    private BigDecimal priceForBoat;
    private ArrayList monsters;
    private Integer requiredLevel;

    Place(String name, BigDecimal priceForBoat, List<Monster> monsters, Integer requiredLevel) {
        this.name = name;
        this.priceForBoat = priceForBoat;
        this.monsters = new ArrayList<>(Arrays.asList(MonsterFactory.bolb(),MonsterFactory.snake()));
        this.requiredLevel = requiredLevel;

    }

    public String getName() {
        return name;
    }

    public BigDecimal getPriceForBoat() {
        return priceForBoat;
    }

    public ArrayList getMonsters() {
        return monsters;
    }

    public Integer getRequiredLevel() {
        return requiredLevel;
    }

    public void setRequiredLevel(Integer requiredLevel) {
        this.requiredLevel = requiredLevel;
    }

    @Override
    public String toString() {
        return "Place{" +
                "name='" + name + '\'' +
                ", priceForBoat=" + priceForBoat +
                ", monsters=" + monsters +
                '}';
    }
}
