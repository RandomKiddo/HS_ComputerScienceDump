/* Programmer: Neil Ghugare 
 Date: 2/19/19
 Project: Lab 2.3 AmIFree
 File Name: AmIFree.java
 Program Description: Determines if you are free to meet
*/

import java.util.*;
public class AmIFree{
  public static void main(String[] args){
    // Variable to accept the user's input
    Scanner keyboard = new Scanner(System.in);

    // Enter your code here
    System.out.print("What day would you like to meet? ");
    String day = keyboard.nextLine();
    System.out.print("What time would you like to meet? ");
    int time = keyboard.nextInt();
    if (day.equalsIgnoreCase("Monday")){
      if (time >= 1700 && time <= 2100) {
        System.out.println("That would be great!!! I will see you then.");
      } else {
        System.out.println("Sorry, I am busy then.");
      }
    } else if (day.equalsIgnoreCase("Tuesday")){
      if (time >= 2000 && time <= 2200) {
        System.out.println("That would be great!!! I will see you then.");
      } else {
        System.out.println("Sorry, I am busy then.");
      }
    } else if (day.equalsIgnoreCase("Wednesday")){
      System.out.println("Sorry, I am busy then.");
    } else if (day.equalsIgnoreCase("Thursday")){
      System.out.println("Sorry, I am busy then.");
    } else if (day.equalsIgnoreCase("Friday")){
      if (time >= 1700 && time <= 2300) {
        System.out.println("That would be great!!! I will see you then.");
      } else {
        System.out.println("Sorry, I am busy then.");
      }
    } else if (day.equalsIgnoreCase("Saturday")){
      if ((time >= 1000 && time <= 1400) || (time >= 2000 && time <= 2330)) {
        System.out.println("That would be great!!! I will see you then.");
      } else {
        System.out.println("Sorry, I am busy then.");
      }
    } else {
      if ((time >= 1200 && time <= 1600) || (time >= 1800 && time <= 2000)) {
        System.out.println("That would be great!!! I will see you then.");
      } else {
        System.out.println("Sorry, I am busy then.");
      }
    }
  }
}
  
