/* Programmer:
   Date:
   Project: DigitComparison
   File Name: DigitComparison.java
   Program Description: This program will print the larger of the ones and tens digits for a given number.
*/


import java.util.*;


public class DigitComparison {

 public static void main(String [] args) {
  int number;
  int ones = 0;
  int tens = 0;

  while (true) {
   Scanner keyboard = new Scanner(System.in);
   System.out.println("Enter an integer");
   number = keyboard.nextInt();

   // Start code here - the variable number will contain an integer
   
   int n = number;
   if(n < 0){
     n *= -1;
     if (n < 10){
       tens = 0;
       ones = 0;
     }
     ones = n % 10;
     n /= 10;
     tens = n % 10;
   } else if (n < 10){
     tens = 0;
   } else {
     ones = n % 10;
     n /= 10;
     tens = n % 10;
   }
   if (ones < tens){
   System.out.println("The larger number between tens and ones is : " + tens);
   } else if (tens < ones){
     System.out.println("The larger number between tens and ones is : " + ones);
   } else {
     System.out.println("Both tens and ones digits are : " + ones);
   }
   keyboard.close();
 }
  }
 }
