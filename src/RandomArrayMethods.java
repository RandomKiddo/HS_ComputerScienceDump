/* Programmer:
 Date:
 Project: Lab 4.4 RandomArrayMethods
 File Name: RandomArrayMethods.java
 Program Description: Computes various statistics of elements in a random array
*/

import java.util.*;

public class RandomArrayMethods{
  public static void main( String[] args ){
    Scanner keyboard = new Scanner(System.in);
System.out.println("Enter An Integer : ");
int input = keyboard.nextInt();
int [] array = generateRandomArray(input);
printArray(array);
int max =getMax(array);
System.out.println("\nMax : " + max);
int min = getMin(array);
System.out.println("Min : " + min);
int sum = getSum(array);
System.out.println("Sum : " + sum);
double average = getAverage(array);
System.out.println("Average : " + average);
   }

   // Copy and paste the line below where needed
   public static int[] generateRandomArray(int a){
     int [] random = new int[a];
     for (int b = 0; b < a; b++){
       random[b] = (int)(Math.random() *25) + 1;
     }
     return random;
   }
   public static void printArray(int [] c){
     int d = 0;
     int length = c.length;
     do{
       System.out.print(c[d] + " ");
       d++;
     } while (!(d == length));
   }
   public static int getMax(int [] e){
     int length = e.length;
     int max = e[0];
     for (int f = 0; f < length; f++){
     if (max < e[f]){
       max = e[f];
     }
   }
     return max;
   }
   public static int getMin(int [] g){
     int length = g.length;
     int min = g[0];
      for (int h = 0; h < length; h++){
       if (min > g[h]){
         min = g[h];
       }
     }
      return min;
   }
   public static int getSum(int [] i){
     int sum = 0;
     int length = i.length;
     for (int j = 0; j < length; j++){
       sum = sum + i[j];
     }
     return sum;
   }
   public static double getAverage(int [] k){
     double average = getSum(k);
     average = average / (k.length);
     return average;
   }
}