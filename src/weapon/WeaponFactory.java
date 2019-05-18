package weapon;

import java.math.BigDecimal;

public class WeaponFactory {
    public static Weapon rod(){
        return new Weapon("Rod",WeaponType.ROD,20,5,new BigDecimal(2000));
    }
    public static Weapon magicRod(){
        return new Weapon("Magic Rod",WeaponType.ROD,40,10,new BigDecimal(4000));
    }
    public static Weapon monsterFirst(){
        return new Weapon("Monster",WeaponType.HAND,20,2,new BigDecimal(1000));
    }
    public static Weapon monsterSecond(){
        return new Weapon("Monster 2",WeaponType.HAND,30,4,new BigDecimal(2000));
    }
    public static Weapon mace(){
        return new Weapon("Obuch",WeaponType.MACE,30,15,new BigDecimal(2000));
    }
    public static Weapon bow(){
        return new Weapon("Luk",WeaponType.BOW,25,15,new BigDecimal(2000));
    }
    public static Weapon knife(){
        return new Weapon("Noz",WeaponType.SWORD,30,15,new BigDecimal(2000));
    }
}
