/* Programmer: Neil Ghugare
 Date: 2/5/19
 Project: Lab 1.6 ConvertTime
 File Name: ConvertTime.java
 Program Description: Converts total years into milleniums, centuries, scores, decades, and remaining years
*/

import java.util.*;

public class ConvertTime
{
 public static void main(String[] args)
 {
  //declare your variables here including this scanner declaration
  Scanner keyboard = new Scanner(System.in);

  //start your code here.
  System.out.println("Type in a measure in total years: ");
  int totalYears = keyboard.nextInt(); 
  int millenniums = totalYears/1000; //1000 years in a millennium
  totalYears = totalYears%1000; 
  int centuries = totalYears/100; //100 years in a century
  totalYears = totalYears%100; 
  int scores = totalYears/20; //20 years in a score
  totalYears = totalYears%20;  
  int decades = totalYears/10; //10 years in a decade
  totalYears = totalYears%10; 
  System.out.println("Millenniums = " + millenniums);
  System.out.println("Centuries = " + centuries);
  System.out.println("Scores = " + scores);
  System.out.println("Decades = " + decades);
  System.out.println("Years = " + totalYears);
  /* 
   * All modular division (%) is to update the amount of years left
  */
 }
}
