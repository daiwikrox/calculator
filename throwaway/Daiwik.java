/////
/**
 * Write a description of class Daiwik here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Daiwik
{
    // instance variables - replace the example below with your own
    private int x;

    public static void main (String [] args) {
            /*Scanner sc = new Scanner (System.in);
            System.out.print("enter any number");
            int number1;
            int number2;
            number1 = sc.nextInt ();
            System.out.print("enter second number");
            number2 = sc.nextInt();
            int sum = number1+number2;
            System.out.print(sum);
            */
            String yesno = "y";
           while (yesno.equals("y") || yesno.equals("Y")) {
           Scanner b = new Scanner(System.in);
           System.out.print("what operation?(+  -   *   /   ) ");
           String s = b.nextLine();
           System.out.print ("what is your first number ");
           int number1 = b.nextInt();
           System.out.print ("what is your second number ");
           int number2 = b.nextInt ();
           if(s.equals("+")) {
               System.out.println("the required number is "+(number1+number2));
               
              
            }
           else if (s.equals("-")) {
               System.out.println("the required number is "+(number1-number2));
            }
           else if(s.equals("*")) {
              System.out.println("the required number is "+(number1*number2)); 
            }
           else if(s.equals("/")) {
               System.out.println("the required number is"+(number1/number2));
            }
           else {
               System.out.print("You idiot, type in the a valid sign!\n");
            }
            System.out.print("would you like to do another operation ? answer yes or no (y/n) ");
            
            yesno =  b.next();
            
            
        }
            
           
         
         
          System.out.print("Thanks for calculating!/n");
        
          System.out.print("check out github.com and daiwikrox to see the structure of the program");
           
          
           
           
           
            
            
        }
    }
