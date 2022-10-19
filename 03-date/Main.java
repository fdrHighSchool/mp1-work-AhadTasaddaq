
/**
 * Write a description of class Date here.
 *
 * @author (Ahad Tasaddaq)
 * @version (a version number or a date)
 */
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter The date: "); 
    String date= s.nextLine();
    System.out.print("Enter The day: "); 
    String day= s.nextLine();
    System.out.print("Enter The month: "); 
    String month= s.nextLine();
    System.out.print("Enter The Year: "); 
    String year= s.nextLine();
    System.out.println("Amercan Format: "+day+", "+month+", "+date+", "+year);     
    System.out.println("European Format: "+day+" "+date+" "+ month+" "+year);
         
  }
}


