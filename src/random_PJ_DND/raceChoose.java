package random_PJ_DND;

import java.util.Scanner;

public class raceChoose {

    //COMMON RACES
    public static void commonRaceElection() throws InterruptedException {
        Scanner scInt = new Scanner(System.in);
        while (scInt.hasNextInt()) {
            int selection = scInt.nextInt();
            switch (selection) {
            case (1) -> racesSelected.dragonborn();
            case (2) -> racesSelected.dwarf();
            case (3) -> racesSelected.gnome();
            case (4) -> racesSelected.halfElf();
            case (5) -> racesSelected.halfing();
            case (6) -> racesSelected.halfOrc();
            case (8) -> racesSelected.human();
            case (9) -> racesSelected.tiefling();
            case (0) -> races.scanRace();
            }
        }
    }

    //MONTRUOUS RACES
    public static void  monstruousRaceElection() throws InterruptedException {
        Scanner scInt = new Scanner(System.in);
        while (scInt.hasNextInt()) {
            int selection = scInt.nextInt();
            switch (selection) {
                case (1) -> racesSelected.bugbear();
                case (2) -> racesSelected.centaur();
                case (3) -> racesSelected.goblin();
                case (4) -> racesSelected.grung();
                case (5) -> racesSelected.hobgoblin();
                case (6) -> racesSelected.kobold();
                case (8) -> racesSelected.lizardfolk();
                case (9) -> racesSelected.minotaur();
                case (10) -> racesSelected.orc();
                case (11) -> racesSelected.yuanti();
                case (0) -> races.scanRace();
            }
        }
    }

    //EXOTIC RACES
    public static void exoticRaceElection() throws InterruptedException {
        Scanner scInt = new Scanner(System.in);
        while (scInt.hasNextInt()) {
            int selection = scInt.nextInt();
            switch (selection) {
                case (1) -> racesSelected.dragonborn();
                case (2) -> racesSelected.dwarf();
                case (3) -> racesSelected.gnome();
                case (4) -> racesSelected.halfElf();
                case (5) -> racesSelected.halfing();
                case (6) -> racesSelected.halfOrc();
                case (8) -> racesSelected.human();
                case (9) -> racesSelected.tiefling();
                case (0) -> races.scanRace();
            }
        }
    }
    //EBERRON RACES
    public static void eberronRaceElection() throws InterruptedException {
        Scanner scInt = new Scanner(System.in);
        while (scInt.hasNextInt()) {
            int selection = scInt.nextInt();
            switch (selection) {
                case (1) -> racesSelected.dragonborn();
                case (2) -> racesSelected.dwarf();
                case (3) -> racesSelected.gnome();
                case (4) -> racesSelected.halfElf();
                case (5) -> racesSelected.halfing();
                case (6) -> racesSelected.halfOrc();
                case (8) -> racesSelected.human();
                case (9) -> racesSelected.tiefling();
                case (0) -> races.scanRace();
            }
        }
    }
    //ARCANA RACES
    public static void arcanaRaceElection() throws InterruptedException {
        Scanner scInt = new Scanner(System.in);
        while (scInt.hasNextInt()) {
            int selection = scInt.nextInt();
            switch (selection) {
                case (1) -> racesSelected.dragonborn();
                case (2) -> racesSelected.dwarf();
                case (3) -> racesSelected.gnome();
                case (4) -> racesSelected.halfElf();
                case (5) -> racesSelected.halfing();
                case (6) -> racesSelected.halfOrc();
                case (8) -> racesSelected.human();
                case (9) -> racesSelected.tiefling();
                case (0) -> races.scanRace();
            }
        }
    }
}
