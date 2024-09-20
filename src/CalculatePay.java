/* Programmer: Neil Ghugare
 Date: 2/11/19
 Project: Lab 2.1 CalculatePay
 File Name: CalculatePay.java
 Program Description: Determines the regular, overtime, and total pay for an employee.
*/

import java.util.*;
public class CalculatePay {
  public static void main(String[] args){
    // Variable to accept the user's input
    Scanner keyboard = new Scanner(System.in);

    // Enter your code here
        System.out.print("Enter Your Hourly Wage : ");
        int hourlyWage = keyboard.nextInt();
        System.out.print("Enter Total Hours Worked : ");
        int hoursWorked = keyboard.nextInt();
        int overtimeHours;
        if (hoursWorked > 40) {
            overtimeHours = hoursWorked - 40;
        } else {
            overtimeHours = 0;
        }
        int regularHours = hoursWorked - overtimeHours;
        double regularPay = regularHours * hourlyWage;
        double overtimePay =  overtimeHours * (hourlyWage * 1.5);
        double totalPay = overtimePay + regularPay;
        System.out.println("Regular Pay = $" + regularPay);
        System.out.println("Overtime Pay = $" + overtimePay);
        System.out.println("Total Pay = $" + totalPay);

  }
}