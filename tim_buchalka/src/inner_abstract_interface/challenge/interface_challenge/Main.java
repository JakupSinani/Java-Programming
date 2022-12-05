package inner_abstract_interface.challenge.interface_challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Player jakup = new Player("Jakup", 10, 15);
        System.out.println(jakup.toString());
        saveObject(jakup);

        jakup.setHitPoints(8);
        System.out.println(jakup);
        jakup.setWeapon("Stormbringer");
        saveObject(jakup);
        // loadObject(jakup);
        System.out.println(jakup);

        System.out.println();
        //  Monster
        ISaveable werewolf = new Monster("Werewolf", 20, 40);
        //werewolf.getStrength();
        System.out.println("Strength = " + ((Monster) werewolf).getStrength());
        //System.out.println(werewolf);
        saveObject(werewolf);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner in = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" + "1 to enter a string\n" + "0 to quit");
        while (!quit) {
            System.out.println("Choose an option");
            int choice = in.nextInt();
            in.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = in.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
