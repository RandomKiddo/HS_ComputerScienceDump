/* Programmer:
 Date:
 Project: Bonus Lab 2.2 Hourglass
 File Name: Hourglass.java
 Program Description: Prints an hourglass of stars for a given width
*/

import java.util.*;
public class Hourglass {
  public static void main(String[] args){
    // Variable to accept the user's input
    Scanner keyboard = new Scanner(System.in);

    // Enter your code here
    int input;
    do{
           System.out.println("Enter A Positive Odd Integer");
           input = keyboard.nextInt();
        } while (!(input > 0 && input % 2 != 0));
       int value = input;
       int spacer = 0;
       int value2 = 0;
       int input2 = (input + 1) / 2 - 1;
       for (int row = 1; row <= (input + 1) / 2; row++){
           for (int spacing = 1; spacing <= spacer; spacing++){
               System.out.print(" ");
            }
           for (int width = 1; width <= value; width++){
               System.out.print("*");
            }
           value -= 2;
           System.out.println();
           spacer++;
        }
       for (int row2 = 1; row2 <= (input + 1) / 2; row2++){
           for (int spacing2 = 1; spacing2 <= input2; spacing2++){
               System.out.print(" ");
            }
           input2--;
           for (int width2 = 1; width2 > value2; width2--){
               System.out.print("*");
            }
           value2 -= 2;
           System.out.println();
        }

  }
}
