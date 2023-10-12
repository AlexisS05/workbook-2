package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = {"Hello", "goodbye", "cruel", "world"};

        for (String string : strings) {
            System.out.println(string);
        }

        String fullName = getStringInput(scanner, "Enter your name: (first, last) OR (first, middle, last): ");
        String[] nameSplit = fullName.split(" ");
        String[] messages = {"First name: ", "Middle name: ", "Last name: "};

        if (nameSplit.length == 3) {
            for (int i = 0; i < nameSplit.length; i++) {
                System.out.println(messages[i] + nameSplit[i]);
            }
        } else if (nameSplit.length == 2) {
            messages[0] = "First name: " + nameSplit[0];
            messages[1] = "Middle name: (none)";
            messages[2] = "Last name: " + nameSplit[1];
            for (int i = 0; i < messages.length; i++) {
                System.out.println(messages[i]);
            }
        } else {
            System.out.println("Sorry, couldn't parse your information.");
        }
    }

    static String getStringInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
}