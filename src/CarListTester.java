/*
 * Programmer:    Kevin Streib
 * Date:          November 18, 2013
 * Assignment:    Lab 10.4 - CarList
 * File Name:     CarListTester.Java
 * Description:   This is a wrapper program to test the methods of CarList.java
 *
 */
import java.util.*;
public class CarListTester{
 public static void main(String[] args){
  CarList list = new CarList(2);

  System.out.println("Increase Inventory: ");
  list.increaseInventory();

  System.out.println("Print Inventory: ");
  list.printInventory();

  Car oldest = list.getOldestCar();
  Car leastDriven = list.getCarWithLowestMileage();
  Car mostExpensive = list.getMostExpensiveCar();

  System.out.println("\nOldest Car: " + oldest.toString());
  System.out.println("Least Driven Car: " + leastDriven.toString());
  System.out.println("Most Expensive Car: " + mostExpensive.toString());

  System.out.println("\nPurchase Least Driven Car:");
  list.purchaseCar(leastDriven.getVin());

  System.out.println("\nPrint Inventory: ");
  list.printInventory();

 }
}


class CarList{
  private ArrayList<Car> cars;
  public CarList(int amount){
    cars = new ArrayList<Car>(amount);
    for (int a = 1; a <= amount; a++){
      increaseInventory();
    }
  }
  public void increaseInventory(){
    Scanner keyboard = new Scanner(System.in);
    String make, vin;
    int mileage, price, modelYear;
    System.out.println("Model Year");
    modelYear = keyboard.nextInt();
    System.out.println("Make");
    make = keyboard.next();
    System.out.println("Price");
    price = keyboard.nextInt();
    System.out.println("Mileage");
    mileage = keyboard.nextInt();
    System.out.println("Vin");
    vin = keyboard.next();
    Car temp = new Car(vin, make, modelYear, mileage, price);
    cars.add(temp);
    keyboard.close();
  }
  public void printInventory(){
    for (Car car : cars){
      System.out.println(car);
    }
  }
  public Car getOldestCar(){
    Car temp = null;
    int old = 0;
    for (Car car : cars){
      if (2020 - car.getModelYear() > old){
        old = 2020-car.getModelYear();
        temp = car;
      }
    }
    return temp;
  }
  public Car getCarWithLowestMileage(){
    Car temp = null;
    int amt = cars.get(0).getMileage();
    for (Car car : cars){
      if (car.getMileage() < amt){
        amt = car.getMileage();
        temp = car;
      }
    }
    return temp;
  }
  public Car getMostExpensiveCar(){
    Car temp = null;
    int amt = 0;
    for (Car car : cars){
      if (car.getPrice() > amt){
        amt = car.getPrice();
        temp = car;
      }
    }
    return temp;
  }
  public void purchaseCar(String vin){
    Car temp = null;
    for (Car car : cars){
      if (car.getVin().equalsIgnoreCase(vin)){
        temp = car;
      }
    }
    if (temp != null){
      int index = cars.indexOf(temp);
      cars.remove(index);
      System.out.println("Purchased Car Successfully (" + temp + ")");
    } else {
      System.out.println("Car Not In Inventory: Sorry About That");
    }
  }
}




class Car{
  // initialize fields
  private int modelYear;
  private String make;
  private int price;
  private int mileage;
  private String vin;

  // construct Car object with specified values
  public Car (String v, String type, int year, int miles, int cost){
    vin = v;
    modelYear = year;
    make = type;
    price = cost;
    mileage = miles;
  }

  // accessor methods
  public String getVin(){
   return vin;
  }

  public int getModelYear() {
    return modelYear;
  }

  public String getMake(){
    return make;
  }

  public int getPrice(){
    return price;
  }

  public int getMileage(){
      return mileage;
  }

  // toString method
  public String toString(){
   return "Vin# " + vin + ": " + modelYear + " Make: " + make + " with " + mileage + " miles: $" + price;
  }

}
