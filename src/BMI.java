/* Programmer: Neil Ghugare
 Date: 1/29/19
 Project: Lab 1.5 BMI
 File Name: BMI.java
 Program Description: Calculates a user's BMI and Body Fat %.
*/

import java.util.*;

public class BMI
{
 public static void main(String[] args)
 {
  //declare your variables here including this scanner declaration
  Scanner keyboard = new Scanner(System.in);

  //start your code here.
  int age;
  double weight, height;
  System.out.print("Enter Your Weight In Pounds As An Integer: ");
  weight = keyboard.nextInt();
  System.out.print("Enter You Height In Inches As An Integer: ");
  height = keyboard.nextInt();
  System.out.print("Enter Your Age In Years As An Integer: ");
  age = keyboard.nextInt();
  weight = weight / 2.205;
  height = height / 39.37;
  double bodyMassIndex;
  bodyMassIndex = weight / (height * height);
  double bodyFat;
  bodyFat = (1.20 * bodyMassIndex) + (0.23 * age) - 16.2;
  System.out.println("Your BMI Is " + (int) bodyMassIndex + ".");
  System.out.println("Your Body Fat Percentage Is " + (int) bodyFat + "%.");
  
  
 }
}
