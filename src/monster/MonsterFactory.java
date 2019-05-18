package monster;

import person.PersonType;
import weapon.WeaponFactory;

public class MonsterFactory {
    public static Monster bolb(){
        Monster monster = new Monster("Bolb", PersonType.MONSTER,1,10, 5,WeaponFactory.monsterFirst());
        return monster;
    }
    public static Monster snake(){
        Monster monster = new Monster("Snake",PersonType.MONSTER,2,20,10,WeaponFactory.monsterSecond());
        return monster;
    }

}
