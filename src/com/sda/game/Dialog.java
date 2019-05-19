package com.sda.game;

import com.sda.game.monster.Monster;
import com.sda.game.monster.MonsterFactory;
import com.sda.game.person.PersonType;
import com.sda.game.place.PlaceFactory;
import com.sda.game.player.Player;
import com.sda.game.spell.SpellFactory;

import com.sda.game.weapon.WeaponFactory;

import java.math.BigDecimal;
import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

class Dialog {
    private static Scanner scanner = new Scanner(System.in);
    private static Player player;
    private static Monster monster;
    private static Random random = new SecureRandom();

    static void choise() {
        System.out.println("Podaj nick");
        String name = scanner.nextLine();
        System.out.println("Jaka postacia chcesz grac?\n1. dla Warrior\n2. dla Mage\n3. dla Paladin\n4. dla Knight");
        int person = scanner.nextInt();
        switch (person) {
            case 1:
                player = new Player(name, PersonType.WARRIOR, 2, 150, 50, WeaponFactory.mace(), new BigDecimal(500000), PlaceFactory.newbie(), SpellFactory.start());
                break;
            case 2:
                player = new Player(name, PersonType.MAGE, 2, 100, 150, WeaponFactory.rod(), new BigDecimal(5000), PlaceFactory.newbie(), SpellFactory.start());
                break;
            case 3:
                player = new Player(name, PersonType.PALADIN, 2, 100, 100, WeaponFactory.bow(), new BigDecimal(5000), PlaceFactory.newbie(), SpellFactory.start());
                break;
            case 4:
                player = new Player(name, PersonType.KNIGHT, 2, 150, 50, WeaponFactory.knife(), new BigDecimal(5000), PlaceFactory.newbie(), SpellFactory.start());
                break;
        }
    }

    private static void shop() {
        System.out.println("Co chcesz kupic?");
        System.out.println("1. Bron\n2. Czar");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Ktoraj bron chcesz kupic?");
            System.out.println("1. rod\n2. Magic rod\n3. Mace\n4. Bow\n5. Knife");
            int choiseWeapon = scanner.nextInt();
            switch (choiseWeapon) {
                case 1:
                    if (player.getWallet().compareTo(WeaponFactory.rod().getPrice()) > 0) {
                        player.setWeapon(WeaponFactory.rod());
                    } else {
                        System.out.println("Niewystarczajaca ilosc srodkow na koncie");
                    }
                    break;
                case 2:
                    if (player.getWallet().compareTo(WeaponFactory.magicRod().getPrice()) > 0) {
                        player.setWeapon(WeaponFactory.magicRod());
                    } else System.out.println("Niewystarczajaca ilosc srodkow na koncie");
                    break;
                case 3:
                    if (player.getWallet().compareTo(WeaponFactory.mace().getPrice()) > 0) {
                        player.setWeapon(WeaponFactory.mace());
                    } else {
                        System.out.println("Niewystarczajaca ilosc srodkow na koncie");
                    }
                    break;
                case 4:
                    if (player.getWallet().compareTo(WeaponFactory.bow().getPrice()) > 0) {
                        player.setWeapon(WeaponFactory.bow());
                    } else {
                        System.out.println("Niewystarczajaca ilosc srodkow na koncie");
                    }
                    break;
                case 5:
                    if (player.getWallet().compareTo(WeaponFactory.knife().getPrice()) > 0) {
                        player.setWeapon(WeaponFactory.knife());
                    } else {
                        System.out.println("Niewystarczajaca ilosc srodkow na koncie");
                    }
                    break;
            }
        } else if (choice == 2) {
            System.out.println("Ktory czar chcesz kupic?");
            System.out.println("1. Fire\n2. Water\n3. Earth");
            int choiseSpell = scanner.nextInt();
            switch (choiseSpell) {
                case 1:
                    if (player.getWallet().compareTo(SpellFactory.fire().getPrice()) > 0) {
                        player.setSpells(SpellFactory.start());
                    } else {
                        System.out.println("Niewystarczajaca ilosc srodkow na koncie");
                    }
                case 2:
                    if (player.getWallet().compareTo(SpellFactory.water().getPrice()) > 0) {
                        player.setSpells(SpellFactory.start());
                    } else {
                        System.out.println("Niewystarczajaca ilosc srodkow na koncie");
                    }
                case 3:
                    if (player.getWallet().compareTo(SpellFactory.earth().getPrice()) > 0) {
                        player.setSpells(SpellFactory.start());
                    } else {
                        System.out.println("Niewystarczajaca ilosc srodkow na koncie");
                    }
            }
        }

    }

    private static int monsterHit() {
        return monster.getLevel() * monster.getWeapon().getAttack() + random.nextInt(50) + 1;
    }

    private static int playerHit() {
        return player.getLevel() * player.getWeapon().getAttack() + random.nextInt(50) + 1;
    }

    private static int playerSpellHit() {
        return player.getLevel() * player.getWeapon().getAttack() + random.nextInt(50) + 1;
    }

    private static void choiseMonster() {
        System.out.println("Z ktorym potworem chcesz sie zmierzyc?");
        System.out.println("1. Bolb\n2. Snake");
        int mon = scanner.nextInt();
        switch (mon) {
            case 1:
                monster = MonsterFactory.bolb();
                break;
            case 2:
                monster = MonsterFactory.snake();
                break;
        }
    }

    private static void fightWithMonster() {
        int monsterHit = monsterHit();

        boolean alive = true;
        while (alive) {
            player.setHealthPoint(player.getHealthPoint() - monsterHit);
            if (player.getHealthPoint() >= 0) {
                System.out.println("Potwór zabral Ci " + monsterHit + "pkt zycia zostało Ci " + player.getHealthPoint());
                System.out.println("Chcesz uzyc broni czy czaru?");
                System.out.println("1. Bron\n2. czar");
                int choise = scanner.nextInt();
                switch (choise) {
                    case 1:
                        int playerHit = playerHit();
                        monster.setHealthPoint(monster.getHealthPoint() - playerHit);
                        if (monster.getHealthPoint() <= 0) {
                            System.out.println("Zabiles potwora!!! Twoj poziom zwieksza sie o " + monster.getLevel());
                            player.setLevel(player.getLevel() + monster.getLevel());
                        }
                        break;
                    case 2:
                        if (player.getManaPoint() >= player.getSpells().getManaCost()) {
                            monster.setHealthPoint(monster.getHealthPoint() - playerSpellHit());
                        } else if (monster.getHealthPoint() <= 0) {
                            System.out.println("Zabiles potwora!!! Twoj poziom zwieksza sie o " + monster.getLevel());
                            player.setLevel(player.getLevel() + monster.getLevel());
                        }
                        break;
                }
            } else if (player.getHealthPoint() <= 0) {
                System.out.println("Przegrałes idz do sklepu");
                alive = false;
                player.setHealthPoint(1);
            }
        }

    }

    private static void show() {
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

    static void menu() {
        System.out.println("Co chcesz zrobic?");
        System.out.println("1. Sklep\n2. Walka\n3. Wyswietl liste");
        int choise = scanner.nextInt();
        switch (choise) {
            case 1:
                shop();
                break;
            case 2:
                choiseMonster();
                fightWithMonster();
                break;
            case 3:
                show();
                break;
        }
    }

    private static void placeList() {
        System.out.println(PlaceFactory.newbie().getName());
        System.out.println(PlaceFactory.sunBay().getName());
    }

    private static void monsterList() {
        System.out.println(MonsterFactory.bolb().getName());
        System.out.println(MonsterFactory.snake().getName());
    }

    private static void weaponList() {
        System.out.println(WeaponFactory.mace());
        System.out.println(WeaponFactory.bow());
        System.out.println(WeaponFactory.knife());
        System.out.println(WeaponFactory.rod());
        System.out.println(WeaponFactory.magicRod());
    }

    private static void spellList() {
        System.out.println(SpellFactory.earth());
        System.out.println(SpellFactory.fire());
        System.out.println(SpellFactory.water());
    }
}

