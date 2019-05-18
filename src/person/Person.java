package person;

import weapon.Weapon;

public class Person {
    private String name;
    private PersonType personType;
    private Integer level;
    private Integer healthPoint;
    private Integer manaPoint;
    private Weapon weapon;

    public Person(String name, PersonType personType, Integer level, Integer healthPoint, Integer manaPoint, Weapon weapon) {
        this.name = name;
        this.personType = personType;
        this.level = level;
        this.healthPoint = healthPoint;
        this.manaPoint = manaPoint;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public PersonType getPersonType() {
        return personType;
    }

    public Integer getLevel() {
        return level;
    }

    public Integer getHealthPoint() {
        return healthPoint;
    }

    public Integer getManaPoint() {
        return manaPoint;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personType=" + personType +
                ", level=" + level +
                ", healthPoint=" + healthPoint +
                ", manaPoint=" + manaPoint +
                ", weapon=" + weapon +
                '}';
    }
}
