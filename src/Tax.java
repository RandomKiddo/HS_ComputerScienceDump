/* Programmer:
 Date:
 Project: Lab 2.4 Tax
 File Name: Tax.java
 Program Description: Determines the taxes a person owes
*/

import java.util.*;

public class Tax{
  public static void main(String[] args){
    // Variable to accept the user's input
 Scanner keyboard = new Scanner(System.in);

    // Enter your code here
    System.out.print("Enter Filing Status : ");
    String filingStatus = keyboard.nextLine();
    System.out.print("Enter Income : ");
    double income = keyboard.nextDouble();
    double taxableIncome, taxes;
    if (filingStatus.equalsIgnoreCase("Married Joint")){
      taxableIncome = income - 24000;
      if (taxableIncome <= 19050){
        taxes = taxableIncome * 0.1;
      } else if (taxableIncome > 19050 && taxableIncome <= 77400){
        taxes = ((taxableIncome - 19050) * 0.12) + 1905;
      } else if (taxableIncome > 77400 && taxableIncome <= 165000){
        taxes = ((taxableIncome - 77400) * 0.22) + 8907;
      } else if (taxableIncome > 165000 && taxableIncome <= 315000){
        taxes = ((taxableIncome - 165000) * 0.24) + 28179;
      } else if (taxableIncome > 315000 && taxableIncome <= 400000){
        taxes = ((taxableIncome - 315000) * 0.32) + 64179;
      } else if (taxableIncome > 400000 && taxableIncome <= 600000){
        taxes = ((taxableIncome - 400000) * 0.35) + 91379;
      } else {
        taxes = ((taxableIncome - 600000) * 0.37) + 161379;
      }
    } else if (filingStatus.equalsIgnoreCase("Head of Household")){
      taxableIncome = income - 18000;
      if (taxableIncome <= 13600){
        taxes = taxableIncome * 0.1;
      } else if (taxableIncome > 13600 && taxableIncome <= 51800){
        taxes = ((taxableIncome - 13600) * 0.12) + 1360;
      } else if (taxableIncome > 51800 && taxableIncome <= 82500){
        taxes = ((taxableIncome - 51800) * 0.22) + 5944;
      } else if (taxableIncome > 82500 && taxableIncome <= 157500){
        taxes = ((taxableIncome - 82500) * 0.24) + 12698;
      } else if (taxableIncome > 157500 && taxableIncome <= 200000){
        taxes = ((taxableIncome - 157500) * 0.32) + 30698;
      } else if (taxableIncome > 200000 && taxableIncome <= 500000){
        taxes = ((taxableIncome - 200000) * 0.35) + 44298;
      } else {
        taxes = ((taxableIncome - 500000) * 0.37) + 149298;
      }
    } else if (filingStatus.equalsIgnoreCase("Single")){
      taxableIncome = income - 12000;
      if (taxableIncome <= 9525){
        taxes = taxableIncome * 0.1;
      } else if (taxableIncome > 9525 && taxableIncome <= 38700){
        taxes = ((taxableIncome - 9525) * 0.12) + 952.50;
      } else if (taxableIncome > 38700 && taxableIncome <= 82500){
        taxes = ((taxableIncome - 38700) * 0.22) + 4453.50;
      } else if (taxableIncome > 82500 && taxableIncome <= 157500){
        taxes = ((taxableIncome - 82500) * 0.24) + 14089.50;
      } else if (taxableIncome > 157500 && taxableIncome <= 200000){
        taxes = ((taxableIncome - 157500) * 0.32) + 32089.50;
      } else if (taxableIncome > 200000 && taxableIncome <= 500000){
        taxes = ((taxableIncome - 200000) * 0.35) + 45689.50;
      } else {
        taxes = ((taxableIncome - 500000) * 0.37) + 150689.50;
      }
    } else {
      taxableIncome = income - 12000;
       if (taxableIncome <= 9525){
        taxes = taxableIncome * 0.1;
      } else if (taxableIncome > 9525 && taxableIncome <= 38700){
        taxes = ((taxableIncome - 9525) * 0.12) + 952.50;
      } else if (taxableIncome > 38700 && taxableIncome <= 82500){
        taxes = ((taxableIncome - 38700) * 0.22) + 4453.50;
      } else if (taxableIncome > 82500 && taxableIncome <= 157500){
        taxes = ((taxableIncome - 82500) * 0.24) + 14089.50;
      } else if (taxableIncome > 157500 && taxableIncome <= 200000){
        taxes = ((taxableIncome - 157500) * 0.32) + 32089.50;
      } else if (taxableIncome > 200000 && taxableIncome <= 300000){
        taxes = ((taxableIncome - 200000) * 0.35) + 45689.50;
      } else {
        taxes = ((taxableIncome - 300000) * 0.37) + 80689.50;
      }
     
    }
    System.out.print("You owe $" + taxes + " in taxes.");
  }
}