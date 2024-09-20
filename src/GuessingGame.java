/* Programmer:
 Date:
 Project: Lab 3.3 GuessingGame
 File Name: GuessingGame.java
 Program Description: Simple guessing game where user guesses random number between 1 and 15.
*/

import java.util.*;

public class GuessingGame{
  public static void main( String[] args ){

 // cut and paste the line below in the methods as needed
    Scanner keyboard = new Scanner(System.in);

    // enter your code here
    int input;
    int attempts = 0;
    int integer = (int)(15 * Math.random()) + 1;
    do{
      System.out.println("Guess A Number : ");
      input = keyboard.nextInt();
      attempts++;
      if (input >= 1 && input <= 15){
        if (attempts < 3){
          if (input > integer){
            System.out.println("Too High");
          } else if (input < integer){
            System.out.println("Too Low");
          }
          }
        if (input == integer){
          System.out.println("You Got It!");
          System.out.println("It Took You " + attempts + " Tries");
          break;
        }
        }


     
    } while (!(attempts == 3));
    if (input != integer){
    System.out.println("Oops, You're Out Of Tries");
    System.out.println("The Correct Number Was : " + integer);
  }
  }
}
