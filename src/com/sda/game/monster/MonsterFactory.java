package com.sda.game.monster;

import com.sda.game.person.PersonType;
import com.sda.game.weapon.WeaponFactory;

public class MonsterFactory {
    public static Monster bolb(){
        return new Monster("Bolb", PersonType.MONSTER,1,10, 5,WeaponFactory.monsterFirst());
    }
    public static Monster snake(){
        return new Monster("Snake",PersonType.MONSTER,2,20,10,WeaponFactory.monsterSecond());
    }

}
