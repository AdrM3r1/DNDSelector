package random_PJ_DND;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class selector {

    // vars
    public static final String[] classes = {"Paladin", "Artificer", "Sorcerer", "Barbarian", "Bard", "Monk", "Cleric",
            "Rogue", "Fighter", "Wizard", "Druid", "Ranger"};

    //////////////////////////////////////////////////////
    public static void main(String[] args) throws InterruptedException, IOException, URISyntaxException {

        Start();
        scanDND.scannerDND();
        races.scanRace();

    }

    public static void Start() throws InterruptedException {
        System.out.println("Welcome to the program");
        System.out.println(
                "There is " + "#=> " + classes.length + " <=#" + " classes of selectable classes");
        TimeUnit.SECONDS.sleep(2);
        lister();
    }

    public static void lister() {
        int index = 1;
        for (String s : classes) {
            System.out.println(index++ + " " + s);
        }
    }

}