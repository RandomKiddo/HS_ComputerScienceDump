/* Programmer:
   Date:
   Project: PhonePlan
   File Name: PhonePlan.java
   Program Description: This program will compute a person's phone plan cost given their number of minutes.
*/

import java.util.*;


public class PhonePlan {
 public static void main(String [] args) {

  while (true) {
   Scanner keyboard = new Scanner(System.in);
   // minutes will hold the user's number of minutes
   System.out.println("Enter the number of minutes you used your phone: ");
   int minutes = keyboard.nextInt();
   
   // Start code to determine cost of phone plan here
   double plan1, plan2, plan3;
   int current;
   if (minutes <= 450){
     plan1 = 39.99;
   } else {
     current = minutes - 450;
     plan1 = 39.99 + (0.45 * current);
   }
   System.out.println("Plan 1 = $" + plan1);
   if  (minutes <= 900){
     plan2 = 59.99;
   } else {
     current = minutes - 900;
     plan2 = 59.99 + (0.40 * current);
   }
   System.out.println("Plan 2 = $" + plan2);
   if (minutes <= 1350){
     plan3 = 79.99;
   } else {
     current = minutes - 1350;
     plan3 = 79.99 + (0.30 * current);
   }
   System.out.println("Plan 3 = $" + plan3);
   if(plan1 < plan2 && plan1 < plan3){
     System.out.println("Plan 1 Is The Best");
   } else if (plan2 < plan1 && plan2 < plan3){
     System.out.println("Plan 2 Is The Best");
   } else if (plan3 < plan1 && plan3 < plan2){
     System.out.println("Plan 3 Is The Best");
   } else if (plan1 == plan2){
     System.out.println("Plan 1 or Plan 2 Is The Best");
   } else if (plan2 == plan3){
     System.out.println("Plan 2 or Plan 3 Is The Best");
   } else if (plan1 == plan3){
     System.out.println("Plan 1 or Plan 3 Is The Best");
   } else {
     System.out.println("Any Plan Works");
   }






   keyboard.close();
  } // end while loop
 }
}