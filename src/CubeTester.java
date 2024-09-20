import java.util.Scanner;
public class CubeTester{
  public static void main(String [] args){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter A Number To Cube : ");
    int n = keyboard.nextInt();
    System.out.println(cube(n));
    keyboard.close();
  }
  public static int cube(int n){
    if (n == 0){ return 0; }
    if (n > 0){
      return cube(n-1) + 3 * (square(n)) - 3 * n + 1;
    } else {
      return cube(n+1) - 3 * (square(n)) - 3 * n - 1;
    }
  }
  public static int square(int n){
    if (n == 0){ return 0; }
    if (n > 0){
      return square(n-1) + 2 * n - 1;
    } else {
      return square(n+1) - 2 * n - 1;
    }
  }
}