package weapon;

import java.math.BigDecimal;

public class Weapon {
    private String name;
    private WeaponType weaponType;
    private Integer attack;
    private Integer defence;
    private BigDecimal price;

    public Weapon(String name, WeaponType weaponType, Integer attack, Integer defence, BigDecimal price) {
        this.name = name;
        this.weaponType = weaponType;
        this.attack = attack;
        this.defence = defence;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public Integer getAttack() {
        return attack;
    }

    public Integer getDefence() {
        return defence;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Bron " + name + " atak: " + attack + " obrona: " + defence + " cena: " + price;
    }
}
