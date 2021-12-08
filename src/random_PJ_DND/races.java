package random_PJ_DND;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class races {
    // vars

    public static final String[] commonRaces = {"Dragonborn", "Dwarf", "Elf", "Gnome", "Half-Elf", "Halfling", "Half-Orc", "Human",
            "Tiefling"};

    public static final String[] monstrousRace = {"Bugbear", "Centaur", "Goblin", "Grung", "Hobgoblin", "Kobold", "Lizardfolk",
            "Minotaur", "Orc", "Yuan-Ti Pureblood"};

    public static final String[] exoticRaces = {"Aarakocra", "Aasimar", "Fairy", "Firbolg", "Genasi", "Gith", "Goliath", "Harengon",
            "Kenku", "Locathah", "Tabaxi", "Tortle", "Triton"};

    public static final String[] eberronRace = {"Changeling", "Kalashtar", "Shifter", "Warforged"};

    public static final String[] arcanaRace = {"Autognome", "Dhamphir", "Giff", "Hadozee", "Hexblood", "Fairy", "Owlfolk", "Plasmoid",
            "Rabbitfolk", "Reborn", "Revenant", "Thri-Kreen"};

    ////////////////////////////////////////////////////////////////////////////

    public static void scanRace() throws InterruptedException {
        System.out.println("There is 5 tipes os Races for your character");
        System.out.println("1->Common,2->Monstrous,3->Exotic,4->Eberron, 5->Arcana");
        Scanner scInt = new Scanner(System.in);
        while (scInt.hasNextInt()) {
            int selection = scInt.nextInt();
            switch (selection) {
                case (1) -> {
                    System.out.println("Common Races");
                    setCommonRacesList();
                    System.out.print("Number selected: ");
                    raceChoose.commonRaceElection();
                }
                case (2) -> {
                    System.out.println("Monstrous");
                    setMonstrousRaceList();
                    System.out.print("Number selected: ");
                    raceChoose.monstruousRaceElection();
                }
                case (3) -> {
                    System.out.println("Exotic");
                    setExoticRacesList();
                    System.out.print("Number selected: ");
                    raceChoose.exoticRaceElection();
                }
                case (4) -> {
                    System.out.println("Eberron");
                    setEberronRaceList();
                    System.out.print("Number selected: ");
                    raceChoose.eberronRaceElection();
                }
                case (5) -> {
                    System.out.println("Arcana");
                    setArcanaRaceList();
                    System.out.print("Number selected: ");
                    raceChoose.arcanaRaceElection();
                }
            }
        }
    }

    //////////////////////////////////////////////////
    /// Listing of the arrays

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


