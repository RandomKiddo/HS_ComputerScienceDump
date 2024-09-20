import java.util.Scanner;
public class TriangleNumberTester{
  public static void main(String [] args){
    Scanner keyboard = new Scanner(System.in);
    int num;
    do{
      System.out.println("Enter A Positive Integer : ");
      num = keyboard.nextInt();
    } while (!(num > 0));
    System.out.println("Triangle Number Value : " + triangleNumber(num));
    keyboard.close();
  }
  public static int triangleNumber(int n){
    if (n == 1){ return 1; }
    return triangleNumber(n-1) + n;
  }
}