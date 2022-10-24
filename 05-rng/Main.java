
/**
 * Write a description of class rng here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

class Main {//Opening
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("What mode would you like to play: (easy,medium,hard): ");
    String mode = s.nextLine();
    
    int number;
    int maximum;
    if (mode.equals("easy")) {
        maximum = 5;
    }//Easy mode
    else if (mode.equals("medium")) {
        maximum = 25;
    }//medium mode
    else {
        maximum = 100;
    }  //Hard mode if the user enters something other than easy, or medium
    //User can select any mode to play
    number = (int)(Math.random() * maximum + 1);
    int userGuess;
    System.out.print("Please Enter your guess: ");
    int playerGuess = s.nextInt(); 
    if(playerGuess != number) {

      if(playerGuess < number) {
       System.out.println("You were off by " + (number - playerGuess));
      } 
      else {
        System.out.println("You were off by " + (playerGuess - number));
      } //The number user is off by
    } 
    else {
      System.out.println("You are correct congulalations !!!");
      } //User got the correct guess
   }

 
}    //closing 
