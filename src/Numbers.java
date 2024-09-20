/* Programmer:
 Date:
 Project: Lab 3.1 Numbers
 File Name: Numbers.java
 Program Description: Performs a series of methods from the Math class.
*/

import java.util.*;

public class Numbers{
  public static void main( String[] args ){
    Scanner keyboard = new Scanner(System.in);

    // enter your code here
    int step1;
    do{
      System.out.println("Enter A Negative Integer : ");
      step1 = keyboard.nextInt();
    } while (!(step1 < 0));
    double step2 = Math.pow(step1,3);
    System.out.println(step2 + " (Cubing Input)");
    double step3 = Math.abs(step2);
    System.out.println(step3 + " (Absolute Value Of Previous)");
    double step4 = Math.sqrt(step3);
    System.out.println(step4 + " (Square Root Of Previous)");
    double step5 = Math.round(step4 * 1000) / 1000.0;
    System.out.println(step5 + " (Final Answer Rounded To 3 Places)");
  }
}