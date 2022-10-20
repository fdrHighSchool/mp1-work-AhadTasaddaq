
/**
 * Write a description of class Lanterfly1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


import java.util.Scanner;

public class Lanternfly
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("The lanternfly is an invasive species and ");
        System.out.println("is a danger to our trees and plants.");
        
        System.out.print("How many did you squash this summer? ");
        int num = input.nextInt();
        
        if (num < 15) {
            System.out.println("You should keep trying");
        } // end of if statement
        else {
            System.out.println("Thank you for your Help ");
        } // end of else statement
        
        } // end of main method
 
}  // end of class

