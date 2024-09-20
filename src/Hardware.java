/* Programmer: Neil Ghugare
 Date: 2/25/19
 Project: Bonus Lab 2.1 Hardware
 File Name: Hardware.java
 Program Description: Determines the price of an order from a hardware store.
*/

import java.util.*;
public class Hardware {
  public static void main(String[] args){
    // Variable to accept the user's input
    Scanner keyboard = new Scanner(System.in);

    // Enter your code here
    System.out.print("Enter # Of Bolts : ");
    int bolts = keyboard.nextInt();
    System.out.print("Enter # Of Nuts : ");
    int nuts = keyboard.nextInt();
    System.out.print("Enter # Of Washers : ");
    int totalPrice = 0;
    int washers = keyboard.nextInt();
    if (nuts >= bolts && washers >= 2 * bolts){
     totalPrice = (bolts * 5) + (nuts * 3) + (washers * 1);
     System.out.println("Order Is OK");
     System.out.println("Total Cost : " + totalPrice + " Cents");
    } else {
      if (!(nuts >= bolts)){
        totalPrice = (bolts * 5) + (nuts * 3) + (washers * 1);
        System.out.println("Check The Order : Too Few Nuts");
      }
      if (!(washers >= 2 * bolts)){
        totalPrice = (bolts * 5) + (nuts * 3) + (washers * 1);
        System.out.println("Check The Order : Too Few Washers ");
      }
      System.out.println("Total Cost : " + totalPrice + " Cents");
    }
  }
}