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
                return; //end program!
}

        System.out.println("Enter your favorite color (Either red, blue, or green):");
        String color = scanner.nextLine().toLowerCase();
        if (!color.equals("red") && !color.equals("blue") && !color.equals("green")) {
                System.out.println("please enter a real color!");
                return;
        }

        System.out.println("Enter your favorite season (winter, spring, summer, fall):");
        String season = scanner.nextLine().toLowerCase();
        if (!season.equals("winter") && !season.equals("spring") && !season.equals("summer") && !season.equals("fall")) {
                System.out.println("please enter a real season!");
                return;
        }
        
        String pet;
        if (color.equals( "blue") && (season.equals("fall")) {
                
                pet="alligator";
            }
            
        

    }
}

