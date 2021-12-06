package random_PJ_DND;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class races {
    // vars

    public static final String[] commonRaces = {"Dragonborn", "Dwarf", "Elf", "Gnome", "Half-Elf", "Halfling", "Half-Orc", "Human", "Tiefling"};
    public static final List<String> commonRacesList = Arrays.asList(commonRaces);

    public static final String[] monstrousRace = {"Bugbear", "Centaur", "Goblin", "Grung", "Hobgoblin", "Kobold", "Lizardfolk", "Minotaur", "Orc", "Yuan-Ti Pureblood"};
    public static final List<String> monstrousRaceList = Arrays.asList(monstrousRace);

    public static final String[] exoticRaces = {"Aarakocra", "Aasimar", "Fairy", "Firbolg", "Genasi", "Gith", "Goliath", "Harengon", "Kenku", "Locathah", "Tabaxi", "Tortle", "Triton"};
    public static final List<String> exoticRacesList = Arrays.asList(exoticRaces);

    public static final String[] eberronRace = {"Changeling", "Kalashtar", "Shifter", "Warforged"};
    public static final List<String> eberronRaceList = Arrays.asList(eberronRace);

    public static final String[] arcanaRace = {"Autognome", "Dhamphir", "Giff", "Hadozee", "Hexblood", "Fairy", "Owlfolk", "Plasmoid", "Rabbitfolk", "Reborn", "Revenant", "Thri-Kreen"};
    public static final List<String> arcanaRaceList = Arrays.asList(arcanaRace);


    ////////////////////////////////////////////////////////////////////////////

    public static void scanRace() throws InterruptedException {
        System.out.println("There is 5 tipes os Races for your character");
        System.out.println("1->Common,2->Monstruous,3->Exotic,4->Eberron, 5->Arcana");
        //System.out.println("Type 0 or 6 to go to the wikidot url for more info");
        Scanner scInt = new Scanner(System.in);
        while (scInt.hasNextInt()) {
            int number = scInt.nextInt();
            switch (number) {
                case (1) -> {
                    System.out.println("Common Races");
                    setCommonRacesList();
                    raceChoose.commonRaceElection(number);
                }
                case (2) -> {
                    System.out.println("Monstruous");
                    setMonstrousRaceList();
                    raceChoose.monstruousRaceElection(number);
                }
                case (3) -> {
                    System.out.println("Exotic");
                    setExoticRacesList();
                    raceChoose.exoticRaceElection(number);
                }
                case (4) -> {
                    System.out.println("Eberron");
                    setEberronRaceList();
                    raceChoose.eberronRaceElection(number);
                }
                case (5) -> {
                    System.out.println("Arcana");
                    setArcanaRaceList();
                    raceChoose.arcanaRaceElection(number);
                }
            }
        }
    }


    public static void setCommonRacesList() {
        int index = 1;
        for (String s : commonRaces) {
            System.out.println(index++ + " " + s);
        }
    }

    public static void setMonstrousRaceList() {
        int index = 1;
        for (String s : monstrousRace) {
            System.out.println(index++ + " " + s);
        }
    }

    public static void setExoticRacesList() {
        int index = 1;
        for (String s : exoticRaces) {
            System.out.println(index++ + " " + s);
        }
    }

    public static void setEberronRaceList() {
        int index = 1;
        for (String s : eberronRace) {
            System.out.println(index++ + " " + s);
        }
    }

    public static void setArcanaRaceList() {
        int index = 1;
        for (String s : arcanaRace) {
            System.out.println(index++ + " " + s);
        }
    }
    
}


