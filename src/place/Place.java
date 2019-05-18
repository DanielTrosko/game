package place;

import monster.Monster;
import monster.MonsterFactory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Place {
    private String name;
    private BigDecimal priceForBoat;
    private ArrayList monsters;

    public Place(String name, BigDecimal priceForBoat, List<Monster> monsters) {
        this.name = name;
        this.priceForBoat = priceForBoat;
        this.monsters = new ArrayList<>(Arrays.asList(MonsterFactory.bolb(),MonsterFactory.snake()));
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPriceForBoat() {
        return priceForBoat;
    }

    public List<Monster> getMonsters() {
        return monsters;
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
