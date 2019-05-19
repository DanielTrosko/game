package com.sda.game.place;

import com.sda.game.monster.MonsterFactory;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;

public class PlaceFactory {
    public static Place newbie(){
        return new Place("Newbie",new BigDecimal(1500), Collections.singletonList(MonsterFactory.bolb()));
    }
    public static Place sunBay(){
        return new Place("Sun Bay",new BigDecimal(2500),Arrays.asList(MonsterFactory.snake(),MonsterFactory.bolb()));
    }
}
