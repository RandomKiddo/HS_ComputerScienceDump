/* Programmer:
 Date:
 Project: Lab 2.6 LoopSum
 File Name: LoopSum.java
 Program Description: Uses a do while loop to trap the input between 1 and 99 (inclusive) and a while loop to sum all odd integers between 1 and the input number.
*/

import java.util.*;

public class LoopSum{
  public static void main(String[] args){
 // Variable to accept the user's input
 Scanner keyboard = new Scanner(System.in);

    // Enter your code here
 int number1;
 int number2;
 int total = 0;
 do{
   System.out.println("Enter A Positive Number Less Than 100");
   number1 = keyboard.nextInt();
 } while (!(number1 > 0 && number1 < 100));
 do{
   System.out.println("Enter A Even Number Greater Than Your Last Number");
   number2 = keyboard.nextInt();
 } while (!(number2 > number1 && number2 % 2 == 0));
 int number1Stored = number1;
 do{
   total = total + number1;
   number1++;
 } while (!(number1 > number2));
   System.out.println("The Sum Of All Integers Between " + number1Stored + " and " + number2 + " is " + total);
  





  }
}