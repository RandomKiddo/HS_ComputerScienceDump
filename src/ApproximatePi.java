
import java.util.Scanner;

public class ApproximatePi{
  public static void main(String[] args){

    Scanner keyboard = new Scanner(System.in);

    // start your code here
    int integer;
    double denominator = 1;
    double pi = 0;
    double sign = 1;
    do{
      System.out.println("Enter A Positive Integer To Represent Pi : ");
      integer = keyboard.nextInt();
    } while (!(integer > 0));
    for (int count = integer; count > 0; count--){
      pi = pi + (4 * (sign * (1/denominator)));
      denominator += 2;
      sign *= -1;
  }
    System.out.println("Pi To " + integer + " Digits Is Approximately " + pi);
}
}