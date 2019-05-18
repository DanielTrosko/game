import monster.MonsterFactory;
import person.PersonType;
import place.PlaceFactory;
import player.Player;
import spell.SpellFactory;

import weapon.WeaponFactory;

import java.math.BigDecimal;
import java.util.Scanner;

public class Dialog {
    private static Scanner scanner = new Scanner(System.in);

    public static Player choise() {
        System.out.println("Podaj nick");
        String name = scanner.nextLine();
        System.out.println("Jaka postacia chcesz grac?\n1. dla Warrior\n2. dla Mage\n3. dla Paladin\n4. dla Knight");
        int person = scanner.nextInt();
        Player player = new Player(name, PersonType.WARRIOR, 2, 150, 50, WeaponFactory.mace(), new BigDecimal(2000));
        switch (person) {
            case 1:
                player = new Player(name, PersonType.WARRIOR, 2, 150, 50, WeaponFactory.mace(), new BigDecimal(2000));
                break;
            case 2:
                player = new Player(name, PersonType.MAGE, 2, 100, 150, WeaponFactory.rod(), new BigDecimal(2000));
                break;
            case 3:
                player = new Player(name, PersonType.PALADIN, 2, 100, 100, WeaponFactory.bow(), new BigDecimal(2000));
                break;
            case 4:
                player = new Player(name, PersonType.KNIGHT, 2, 150, 50, WeaponFactory.knife(), new BigDecimal(2000));
        }
        return player;
    }

    public void start() {
        System.out.println("1. Lista miejsc\n2. Lista potworow\n3. Lista broni\n4. Lista  czarow\n");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                placeList();
                break;
            case 2:
                monsterList();
                break;
            case 3:
                weaponList();
                break;
            case 4:
                spellList();
                break;
        }

    }

    public static void placeList() {
        System.out.println(PlaceFactory.newbie().getName());
        System.out.println(PlaceFactory.sunBay().getName());
    }

    public static void monsterList() {
        System.out.println(MonsterFactory.bolb().getName());
        System.out.println(MonsterFactory.snake().getName());
    }

    public static void weaponList() {
        System.out.println(WeaponFactory.mace());
        System.out.println(WeaponFactory.bow());
        System.out.println(WeaponFactory.knife());
        System.out.println(WeaponFactory.rod());
        System.out.println(WeaponFactory.magicRod());
    }

    public static void spellList() {
        System.out.println(SpellFactory.earth());
        System.out.println(SpellFactory.fire());
        System.out.println(SpellFactory.water());
    }
}

