/* Programmer:
 Date:
 Project: Lab 2.9 StarDisplay
 File Name: StarDisplay.java
 Program Description: Print a display of stars
*/

import java.util.*;

public class StarDisplay{
  public static void main( String[] args ){
 Scanner keyboard = new Scanner(System.in);
 int inputR;
 int value = 1;
 do{
   System.out.println("Enter A Positive Integer For Rows : ");
   inputR = keyboard.nextInt();
 } while (!(inputR > 0));
 for (int row = 1; row <= inputR; row++){
   for (int column = 1; column <= value; column++){
     System.out.print("*");
   }
   value *= 2;
   System.out.println();
 }
  }
}