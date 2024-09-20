/*
 Name: Neil Ghugare
 FileName: DebugMe.java
 Assignment: Bonus Lab 1.1
 Description: Correct the syntax errors in this program so that it will compile and run.
  Place a line comment above or to the right of each line containing an error
  describing what the error was and how it was fixed. For example, missing quotation added or misspelled word corrected.
*/

import java.util.*;

public class DebugMe{ //Forgot Curly Bracket After Name
  public static void main(String [] args){ //Forgot To Add Void And Square Brackets
        Scanner input = new Scanner(System.in);

        // Declare and initialize variables for age and name
        System.out.println("Enter your name");
        String name = input.nextLine( ); //Forgot To Capitalize String And Next Command Should Be A Line Command

        System.out.println("Enter your age: "); //Forgot Quotation Marks
        int age = input.nextInt( ); //Next Command Should Be Int Not Line And Keyboard Scanner Should Be Input

        System.out.println("\n\nYour name is " + name + " and you are " + age + " years old."); //Capitalization, Spelling And Quotation Errors
        System.out.println("If you are reading this, then you have found all of the errors in this program"); //Forgot To Capitalize System, Print Misspelled
        System.out.println("and the last character on this line should be a backslash \\"); //Forgot To Add A Second Backslash



    } //Forgot Closed Curly Bracket
}