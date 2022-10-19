
/**
 * Write a description of class Lanterfly here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Lanterfly
{
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        
        System.out.print("The Lanternfly is an invasion species and ");
        System.out.println("is a threat to our trees and plants. ");
        
        System.out.print("How many did you squash this summer?  ");
        int num =input.nextLine();
        
        if (num < 10){
            System.out.println("You can do better than that!");
        }
         else{
             System.out.println("Thanks for doing your part");
        }
}
}