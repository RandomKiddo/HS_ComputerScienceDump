/* Programmer: Neil Ghugare
 Date: 1/23/19
 Project: Lab 1.3 Madlib
 File Name: Madlib.java
 Program Description: Produces a Madlib using user input
*/

import java.util.*;

public class Madlib
{
 public static void main(String[] args)
 {
  //declare your variables here including this scanner declaration
  Scanner keyboard = new Scanner(System.in);

  //start your code here.
  String fullName, country, fakeName, date, favoriteFood; 
  int age, favoriteNumber; 
  System.out.print("Please enter your full name: ");
  fullName = keyboard.nextLine();
  System.out.print("\nPlease enter the date in the form of month/day/year: ");
  date = keyboard.nextLine();
  System.out.print("\nPlease enter a random country: ");
  country = keyboard.nextLine();
  System.out.print("\nPlease enter a fake name: ");
  fakeName = keyboard.nextLine();
  System.out.print("\nPlease enter your favorite food (in plural form): ");
  favoriteFood = keyboard.nextLine();
  System.out.print("\nPlease enter your age (no decimals please): ");
  age = keyboard.nextInt();
  System.out.print("\nPlease enter your favorite number (no decimals please): ");
  favoriteNumber = keyboard.nextInt();
  System.out.println("\n\nI, " + fakeName +", the king of " + country + ", give " + fullName + " the right to be exempt from all work on " + date + " due to eating too many " + favoriteFood + " on your " + age + "th/st birthday. This decree will last " + favoriteNumber + " days. Signed, King " + fakeName + ".");
 }
}
