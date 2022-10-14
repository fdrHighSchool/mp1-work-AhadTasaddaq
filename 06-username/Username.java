
/**
 * Write a description of class Username here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Username{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstname = s.nextLine();
        System.out.print("Enter your last name: ");
        String lastname = s.nextLine();
        // System.out.println("Hello " + initialize(firstname) + "," + initialize(lastname)+".");
        s.close();
        
    }

}