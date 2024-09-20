/* Programmer:
   Date:
   Project: SumDigits
   File Name: SumDigits.java
   Program Description: This program will sum all the digits in a number.
*/


import java.util.*;


public class SumDigits {

 public static void main(String [] args) {
  Scanner keyboard = new Scanner(System.in);
  int number;

  
  System.out.println("Enter a non-negative integer");
  number = keyboard.nextInt();
  
  /* Start code here - the variable number will contain an integer
     make sure it is non-negative. continually ask the user to enter
     an integer until they correctly enter a non-negative integer. */

  while (number < 0){
  System.out.println("Enter a non-negative integer");
  number = keyboard.nextInt();
  }
  int total = sumDigits(number);
  System.out.println(total);
  keyboard.close();

 } // end of main method


 public static int sumDigits ( int n ){
  // enter code to calculate and return the sum of all digits in the number n
  // you may not convert n into a String
   int sum = 0;
   int temp;
   while (n > 0){
   temp = n % 10;
   n /= 10;
   sum += temp;
   }
   return sum;
 } // end of sumDigits method
}