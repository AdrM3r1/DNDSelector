package random_PJ_DND;

import java.util.Random;
import java.util.Scanner;

public class scanDND {

    public static void scannerDND() throws InterruptedException {
        System.out.println("Select class with numbers from 1 to "+ selector.classes.length + ", 0 for Random");
        Scanner scInt = new Scanner(System.in);
        while(scInt.hasNextInt()){
            int typing = scInt.nextInt();
            switch(typing){
                case (1) -> {
                    System.out.println("Paladin");
                    choose.election(typing);
                 }
                case (2) -> {
                    System.out.println("Artificier");
                    choose.election(typing);
                 }
                case (3) -> {
                    System.out.println("Sorcerer");
                    choose.election(typing);
                 }
                case (4) -> {
                    System.out.println("Barbarian");
                    choose.election(typing);
                 }
                case (5) -> {
                    System.out.println("Bard");
                    choose.election(typing);
                 }
                case (6) -> {
                    System.out.println("Monk");
                    choose.election(typing);
                 }
                case (7) -> {
                    System.out.println("Cleric");
                    choose.election(typing);
                 }
                case (8) -> {
                    System.out.println("Rogue");
                    choose.election(typing);
                 }
                case (9) -> {
                    System.out.println("Fighter");
                    choose.election(typing);
                }
                case (10) -> {
                    System.out.println("Wizard");
                    choose.election(typing);
                }
                case (11) -> {
                    System.out.println("Druid");
                    choose.election(typing);
                }
                case (12) -> {
                    System.out.println("Ranger");
                    choose.election(typing);
                }
                case (0) -> {
                    random();
                 }
            }
        }
    }

    public static void random() throws InterruptedException {
        Random random = new Random();
        int index = random.nextInt(selector.classes.length);
        System.out.println(selector.classes[index]);
        System.out.println("your random class is " + selector.classes[index]);
        choose.election(index +1);
    }

}
