package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner xObj = new Scanner(System.in);
        System.out.println("You are in a land full of dragons. In front of you,");
        System.out.println("you see two caves. In one cave, the dragon is friendly");
        System.out.println("and will share his treasure with you. The other dragon");
        System.out.println("is hungry and will eat you on sight.");
        String x = null;

        System.out.println("Which cave will you go into? (1 or 2)");

        try {
            x = xObj.nextLine();
        } catch (Exception e){
            System.out.println("This is NOT good!");
        }

        if (x.equals("1")) {
            System.out.println("you approach the cave...");
            System.out.println("It is dark and spooky...");
            System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
            System.out.println("Gobbles you down in one bite!");

        } else if (x.equals("2")) {
            System.out.println("you approach the cave...");
            System.out.println("It is dark and spooky...");
            System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
            System.out.println("asks if you've ever been to Schenectady.");

        } else {
            System.out.println("Please enter valid number");
            {
            }
        }
    }
}