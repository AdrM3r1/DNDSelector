package random_PJ_DND;

import java.util.Arrays;
import java.util.List;

public class selector {

    // vars
    public static final String[] classes = {"Paladin", "Artificer", "Sorcerer", "Barbarian", "Bard", "Monk", "Cleric",
            "Rogue", "Fighter"};
    public static final List<String> classList = Arrays.asList(classes);

    //////////////////////////////////////////////////////
    public static void main(String[] args) throws InterruptedException {

        
        mont();
        scanDND.scannerDND();

    }

    public static void mont() {
        System.out.println("Welcome to the program");
        System.out.println(
                "There is " + "#=> " + classes.length + " <=#" + " classes of selectable classes");
        lister();
    }

    public static void lister() {
        int index = 1;
        for (String s : classList) {
            System.out.println(index++ + " " + s);
        }
    }

}