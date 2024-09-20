/* Programmer:
   Date:
   Project: DisplayTriangle
   File Name: DisplayTriangle.java
   Program Description: This program will print a pyramid of stars
*/


import java.util.*;


public class DisplayTriangle {

 public static void main(String [] args) {
  Scanner keyboard = new Scanner(System.in);
  int number;


  System.out.println("Enter a non-negative integer");
  number = keyboard.nextInt();

  /* Start code here - the variable number will contain an integer
     make sure it is non-negative. continually ask the user to enter
     an integer until they correctly enter a non-negative integer. */
  while (number <= 0){
    System.out.println("Enter a non-negative integer");
    number = keyboard.nextInt();
  }
  printStarTriangle(number);
  keyboard.close();
 } // end of main method


 public static void printStarTriangle ( int n ){
 // enter code to print a pyramid of stars containing n rows
   int v = 0;
   int v2 = n - 1;
 for(int a = 0; a < n; a++){
    for (int b = 1; b <= v2; b++){
      System.out.print(" ");
    }
    v2--;
    for (int c = 1; c > v; c--){
      System.out.print("*");
    }
    v -= 2;
    System.out.println();
  }

 } // end of sumDigits method
}