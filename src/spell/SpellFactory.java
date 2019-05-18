package spell;

import java.math.BigDecimal;

public class SpellFactory {
    public static Spell fire(){
        return new Spell("Ogien", 25,45,new BigDecimal(2000));
    }
    public static Spell water(){
        return new Spell("Woda", 50,70, new BigDecimal(4000));
    }
    public static Spell earth(){
        return new Spell("Ziemia",75,100,new BigDecimal(6000));
    }
}
