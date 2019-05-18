package player;

import person.Person;
import person.PersonType;
import weapon.Weapon;

import java.math.BigDecimal;

public class Player extends Person {
private BigDecimal wallet;

    public Player(String name, PersonType personType, Integer level, Integer healthPoint, Integer manaPoint, Weapon weapon, BigDecimal wallet) {
        super(name, personType, level, healthPoint, manaPoint, weapon);
    }



}
