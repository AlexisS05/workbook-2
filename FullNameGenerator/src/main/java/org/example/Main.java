package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello World");
        String message = "Yikes Stripes";
        System.out.println(message);

        for (int i = 0; i < message.length(); i++) {
            System.out.println(message.charAt(i));
        }

        String first = getStringInput(scanner, "Enter your first name: ").trim();
        String middle = getStringInput(scanner, "Enter your middle name or initial: ").trim();
        String last = getStringInput(scanner, "Enter your last name: ").trim();
        String title = getStringInput(scanner, "Enter your title: ").trim();

        // Print out raw input without any spacing
        System.out.println(first + middle + last + title);

        first = first.replaceFirst( first.substring(0,1), first.substring(0,1).toUpperCase());

        if ( middle.length() == 1 ) middle = middle + ".";

        if ( ! title.isBlank() ) title = ", " + title;
        title = title.toUpperCase();

        System.out.println(first + " " + middle + " " + last + title);

    }

    public static String getStringInput(Scanner scanner, String prompt){
        System.out.println(prompt);
        String input = scanner.next();
        return input;
    }
}
