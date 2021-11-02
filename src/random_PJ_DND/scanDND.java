package random_PJ_DND;

import java.util.Random;
import java.util.Scanner;

public class scanDND {


    public static void scannerDND() throws InterruptedException {
        System.out.println("Select class with numbers from 1 to 9, 0 for Random");
        Scanner bepis = new Scanner(System.in);
        int choice = bepis.nextInt();
        for (int i = 0; i < selector.classes.length; i++) {
            switch (choice) {
                case (1) -> {
                    System.out.println("Paladin");
                    choose.election(choice);
                    System.exit(0);
                }
                case (2) -> {
                    System.out.println("Artificier");
                    choose.election(choice);
                    System.exit(0);
                }
                case (3) -> {
                    System.out.println("Sorcerer");
                    choose.election(choice);
                    System.exit(0);
                }
                case (4) -> {
                    System.out.println("Barbarian");
                    choose.election(choice);
                    System.exit(0);
                }
                case (5) -> {
                    System.out.println("Bard");
                    choose.election(choice);
                    System.exit(0);
                }
                case (6) -> {
                    System.out.println("Monk");
                    choose.election(choice);
                    System.exit(0);
                }
                case (7) -> {
                    System.out.println("Cleric");
                    choose.election(choice);
                    System.exit(0);
                }
                case (8) -> {
                    System.out.println("Rogue");
                    choose.election(choice);
                    System.exit(0);
                }
                case (9) -> {
                    System.out.println("Fighter");
                    choose.election(choice);
                    System.exit(0);
                }
                case (0) -> {
                    random();
                    choose.election(choice);
                    System.exit(0);
                }
            }
        }
    }

    public static void random() {
        Random random = new Random();
        int index = random.nextInt(selector.classes.length);
        System.out.println(selector.classes[index]);
    }

}
