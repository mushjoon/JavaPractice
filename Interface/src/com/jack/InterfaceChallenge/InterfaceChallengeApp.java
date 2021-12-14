package com.jack.InterfaceChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class InterfaceChallengeApp {

    public static void main(String[] args) {

        Player jack = new Player("Jack",10,15);
        System.out.println(jack.toString());
        saveObject(jack);

        jack.setHitPoints(8);
        System.out.println(jack);
        jack.setWeapon("Stormbringer");
        saveObject(jack);
        //loadObject(jack);
        System.out.println(jack);

        System.out.println("=========================================");
        ISaveable werewolf = new Monster("Werewolf", 20,40);
        System.out.println("Monster strength = " + ((Monster) werewolf).getStrength());
        System.out.println(werewolf);
        saveObject(werewolf);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 - to enter a string\n" +
                "0 - to quit");

        while (!quit) {
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave) {
        for (int i=0; i<objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
