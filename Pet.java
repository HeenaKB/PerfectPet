//Name: Heena KB
//Date: 10/07/26
//This program assigns a pet to fit a person's favorite things! In other words, their perfect pet.  

import java.util.*;

public class Pet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("tell me your name!");
        String name = scanner.nextLine().toLowerCase();
         if ("abcdefghijklmnopqrstuvwxyz".indexOf(name.substring(0, 1)) == -1) {
                System.out.println("please give me your real name!");
                scanner.close();
                return; //end program!
}

        System.out.println("Enter your favorite color (Either red, blue, or green):");
        String color = scanner.nextLine().toLowerCase();
        if (!color.equals("red") && !color.equals("blue") && !color.equals("green")) {
                System.out.println("please enter a real color!");
                scanner.close();
                return;
        }

        System.out.println("Enter your favorite season (winter, spring, summer, fall):");
        String season = scanner.nextLine().toLowerCase();
        if (!season.equals("winter") && !season.equals("spring") && !season.equals("summer") && !season.equals("fall")) {
                System.out.println("please enter a real season!");
                scanner.close();
                return;
        }
        
        String pet;

        boolean vowel = "aeiou".indexOf(name.charAt(0)) >= 0;
        boolean consonant = !vowel;


        if (color.equals( "blue") && season.equals("fall")) {
                
                pet="alligator";
            } else if (color.equals("blue") && season.equals("spring")) {
                pet = "ostrich";
            } else if (color.equals("green") && consonant && season.equals("winter")) {
                pet = "giraffe";
            } else if (color.equals("green") && !season.equals("fall")) {
                pet = "dog";
            } else if (color.equals("red") && vowel) {
                pet = "porcupine";
            } else if (color.equals("red")) {
                pet = "panda";
            } else if (season.equals("summer") && !color.equals("green") && !color.equals("red")) {
                pet = "pony";
            } else if (color.equals("blue") && consonant && !season.equals("summer") && !season.equals("spring")) {
                pet = "axolotl";
            } else {
                pet = "pet rock";
            }

            System.out.println("Your perfect pet is a " + pet + "!");
            scanner.close();
    }
}

