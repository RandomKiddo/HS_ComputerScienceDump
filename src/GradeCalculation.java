/* Programmer: Neil Ghugare
 Date: 2/13/19
 Project: Lab 2.2 GradeCalculation
 File Name: GradeCalculation.java
 Program Description: Determine someone's grade.
*/
import java.util.*;

public class GradeCalculation {
 public static void main( String[] args ){

 // Variable to accept the user's input
 Scanner keyboard = new Scanner(System.in);

    // Enter your code here
    System.out.print("Enter Your Test Percentage : ");
    double tests = keyboard.nextDouble();
    System.out.print("Enter Your Lab Percentage : ");
    double labs = keyboard.nextDouble();
    System.out.print("Enter Your Homework Percentage : ");
    double homework = keyboard.nextDouble();
    System.out.print("Enter Your Quiz Percentage : ");
    double quiz = keyboard.nextDouble();
    double finalGrade = (0.5 * tests) + (0.3 * labs) + (0.1 * homework) + (0.1 * quiz);
    String letterGrade;
    if (finalGrade >= 92.5) {
      letterGrade = "A";
    } else if (finalGrade >= 89.5 && finalGrade < 92.5) {
      letterGrade = "A-";
    } else if (finalGrade >= 86.5 && finalGrade < 89.5) {
      letterGrade = "B+";
    } else if (finalGrade >= 82.5 && finalGrade < 86.5) {
      letterGrade = "B";
    } else if (finalGrade >= 79.5 && finalGrade < 82.5) {
      letterGrade = "B-";
    } else if (finalGrade >= 76.5 && finalGrade < 79.5) {
      letterGrade = "C+";
    } else if (finalGrade >= 72.5 && finalGrade < 76.5) {
      letterGrade = "C";
    } else if (finalGrade >= 69.5 && finalGrade < 72.5) {
      letterGrade = "C-";
    } else if (finalGrade >= 66.5 && finalGrade < 69.5) {
      letterGrade = "D+";
    } else if (finalGrade >= 62.5 && finalGrade < 66.5) {
      letterGrade = "D";
    } else if (finalGrade >= 59.5 && finalGrade < 62.5) {
      letterGrade = "D-";
    } else {
      letterGrade = "F";
    }
    System.out.println("Your Grade is a " + finalGrade + "%, or a " + letterGrade);
      

 }
}