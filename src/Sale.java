/* Programmer:
 Date:
 Project: Lab 4.3 Sale
 File Name: Sale.java
 Program Description: Determines the total payment for an order.
*/

import java.util.*;
public class Sale{
 public static void main (String [] args){
  double original, rate, discount, salePrice;

  original = getPrice();
  rate = getDiscount();
  discount = calculateDiscount(original, rate);
  salePrice = calculateSalePrice(original, discount);
  output(original, rate, discount, salePrice);
 }

 // cut and paste the line below in the methods as needed
 // Add getPrice method here
    public static double getPrice(){
      Scanner input = new Scanner(System.in);
      System.out.println("Enter The Original Price : ");
      return input.nextDouble();
    }
 // Add getDiscount method here
    public static double getDiscount(){
      Scanner input2 = new Scanner(System.in);
      System.out.println("Enter The Discount Percentage : ");
      return input2.nextDouble();
    }
 // Add calculateDiscount method here
    public static double calculateDiscount(double a, double b){
      return a*(b/100.0);
    }
 // Add calculateSalePrice method here
    public static double calculateSalePrice(double c, double d){
      return c-d;
    }
 // Add output method here
    public static void output(double e, double f, double g, double h){
      System.out.println("Original Price : " + e);
      System.out.println("Discount Percentage : " + f);
      System.out.println("Discount Amount : " + g);
      System.out.println("Sale Price : " + h);
    }
}