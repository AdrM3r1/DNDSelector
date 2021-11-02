package random_PJ_DND;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class choose {

    public static void election(int choice) throws InterruptedException {
        switch (choice) {
            case (1) -> classSelected.paladin();
            case (2) -> classSelected.artificier();
            case (3) -> classSelected.sorcerer();
            case (4) -> classSelected.barbarian();
            case (5) -> classSelected.bard();
            case (6) -> classSelected.monk();
            case (7) -> classSelected.cleric();
            case (8) -> classSelected.rogue();
            case (9) -> classSelected.fighter();
        }
    }

    public static void acceptCancel() throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(1500);
        System.out.println("It's what you want?, type yes or no to continue ");
        Scanner sc = new Scanner(System.in);
        boolean nope = sc.hasNext("no");
        if (nope) {
            TimeUnit.MILLISECONDS.sleep(1);
            System.out.println(" ");
            System.out.println("Rebooting the program");
            System.out.println(" ");
            TimeUnit.MILLISECONDS.sleep(1500);
            selector.lister();
            scanDND.scannerDND();
        } else {
            System.out.println("let's continue");
        }
    }

}