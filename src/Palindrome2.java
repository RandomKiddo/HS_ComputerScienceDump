/* Programmer:
 Date:
 Project: Lab 3.4 Palindrome
 File Name: Palindrome.java
 Program Description: Determines if a given word is a palindrome.
*/

import java.util.*;

public class Palindrome{
  public static void main( String[] args ){

 // Copy and paste the line below where needed
    Scanner keyboard = new Scanner( System.in );
    System.out.println("Enter A Word : ");
    String input = keyboard.next();
    int length = input.length();
    String empty = "";
    for (int n = length - 1; n >= 0; n--){
      empty = empty + input.charAt(n);
    }
    if (input.equalsIgnoreCase(empty)){
      System.out.println("Is A Palindrome");
    } else {
      System.out.println("Not A Palindrome");
    }
    }


   }
