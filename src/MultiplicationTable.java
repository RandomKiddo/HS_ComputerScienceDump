/* Programmer:
 Date:
 Project: Lab 2.7 MultiplicationTable
 File Name: MultiplicationTable.java
 Program Description: Print a multiplication table of given dimension
*/

import java.util.*;

public class MultiplicationTable{
  public static void main( String[] args ){
 Scanner keyboard = new Scanner(System.in);

 int inputR, inputC;
 do{
   System.out.println("Enter Positive Integer For Rows : ");
   inputR = keyboard.nextInt();
 } while (!(inputR > 0));
 do{
   System.out.println("Enter Positive Integer For Columns : ");
   inputC = keyboard.nextInt();
 } while (!(inputC > 0));
 for (int row = 1; row <= inputR; row++){
   for (int column = 1; column <= inputC; column++){
     System.out.print((row * column) + " ");
   }
   System.out.println();
 }
  }
}