package spell;

import java.math.BigDecimal;

public class Spell {
    private String name;
    private Integer usedMana;
    private Integer valueSpell;
    private BigDecimal cost;

    public Spell(String name, Integer usedMana, Integer valueSpell, BigDecimal cost) {
        this.name = name;
        this.usedMana = usedMana;
        this.valueSpell = valueSpell;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public Integer getUsedMana() {
        return usedMana;
    }

    public Integer getValueSpell() {
        return valueSpell;
    }

    public BigDecimal getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Czar " + name + " uzycie many: " + usedMana + " cena: " + cost;
    }
}
