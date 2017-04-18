
/**
 * Write a description of class Discard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
public class Discard
{
    // instance variables - replace the example below with your own
    private int x;

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in); //creates a scanner class. This is the object necessary for user input.
        System.out.print("Please enter a string! "); //Tells the user what to do. System.out.print("xxxx") is how you ask for user input.
        String s = sc.nextLine(); //This is how you get user input. sc.nextLine() takes whatever the user types in, and stores it the variable 's'
        String [] myArray; //Just an array
        myArray = s.split(""); //Makes the string into an array
        for (int x = 0; x < myArray.length; x++) { //For loop. The first number tells you where to start. The second part tells you how much to go. The last part tells you how much to increment by.
            if (myArray[x].equals("4")) {//Checks to see if the object in the location matches with "4"
                System.out.print("4!");//Prints the number
                break;//breaks as soon as it finds it, so it doesn't do the for loop anymore
            }
            
        }
    }
    
    public static void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What operation? (+,-,/,*)");
        String s = scanner.nextLine();
        System.out.print("What is your first number? ");
        int number1 = scanner.nextInt();
        System.out.print("What is your second number? ");
        int number2 = scanner.nextInt();
        if (s.equals("+")) {
            System.out.print("Your number is: "+(number1+number2));
        }
        
        /* if (5==6) {
            code  
        }
        */
    }
}