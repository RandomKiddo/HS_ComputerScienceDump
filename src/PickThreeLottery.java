/* Programmer:
 Date:
 Project: Lab 3.2 PickThreeLottery
 File Name: PickThreeLottery.java
 Program Description: Determine how long it takes to win a pick 3 lottery straight up.
*/

import java.util.*;

public class PickThreeLottery{
  public static void main( String[] args ){

 // cut and paste the line below in the methods as needed
    Scanner keyboard = new Scanner(System.in);

    // enter your code here
    int digit1, digit2, digit3;
    int rand1, rand2, rand3;
    int drawingCounter = 0;
    int money = 0;
    do{
      System.out.println("Enter A Digit Between 0 and 9 : ");
      digit1 = keyboard.nextInt();
    } while (!(digit1 >= 0 && digit1 <= 9));
    do{
      System.out.println("Enter A Digit Between 0 and 9 : ");
      digit2 = keyboard.nextInt();
    } while (!(digit2 >= 0 && digit2 <= 9));
    do{
      System.out.println("Enter A Digit Between 0 and 9 : ");
      digit3 = keyboard.nextInt();
    } while (!(digit3 >= 0 && digit3 <= 9));
    do{
      rand1 = (int)(10 * Math.random());
      rand2 = (int)(10 * Math.random());
      rand3 = (int)(10 * Math.random());
      money--;
      drawingCounter++;
    } while (!(rand1 == digit1 && rand2 == digit2 && rand3 == digit3));
    money += 500;
    if (money > 0){
      System.out.println("It Took You " + drawingCounter + " To Win");
      System.out.println("You Won $" + money);
    } else if (money < 0){
      money = Math.abs(money);
      System.out.println("It Took You " + drawingCounter + " To Win");
      System.out.println("You Lost $" + money);
    } else {
      System.out.println("It Took You " + drawingCounter + " To Win");
      System.out.println("You Had No Change In Money");
    }
  }
}