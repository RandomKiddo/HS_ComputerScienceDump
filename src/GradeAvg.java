/* Programmer:
   Date:
   Project: GradeAvg
   File Name: GradeAvg.java
   Program Description: This program will average all the grades in a file.
*/


import java.io.*;
import java.util.Scanner;

public class GradeAvg
{
  public static void main(String[] args)
  {
    Scanner input = null;

 // make sure to put the scores.dat file in the same folder as your GradeAvg.java file
    try{
      input = new Scanner(new File("empty.dat"));
    }
    catch (FileNotFoundException e){
      System.out.println("***  Can't open scores.dat ***");
      System.exit(1);
    }

    // enter code to average scores here
 // the command input.hasNextInt( ) determines if a file contains any more ints (returns true if it does false if it does not)
 // the command input.nextInt( ) actually returns the next int in the file
    boolean check = input.hasNextInt();
    int sum = 0, count = 0, temp;
    while (check == true){
      temp = input.nextInt();
      sum += temp;
      count++;
      check = input.hasNextInt();
    }
    if (sum == 0 && count == 0){
      System.out.println("No Data In File");
    } else {
      double avg = (double)sum / (double)count;
      System.out.println("Average = " + avg);
    }
 input.close();
  }
}
