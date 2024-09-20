/* Programmer:
 Date:
 Project: Lab 4.1 RandomArray
 File Name: RandomArray.java
 Program Description: Computes various statistics of elements in a random array
*/

import java.util.*;

public class RandomArray{
  public static void main( String[] args ){

 // Copy and paste the line below where needed
   Scanner keyboard = new Scanner( System.in );
   int length;
   do{
   System.out.println("Enter A Length For An Array : ");
   length = keyboard.nextInt();
   } while (!(length > 0));
   int [] array = new int [length];
   double sum = 0;
   double avg = 0.0;
   for (int i = 0; i < length; i++){
     array[i] = (int)(Math.random() * 25) + 1;
   }
   int max = array[0];
   int min = array[0];
   for (int j = 0; j < length; j++){
     System.out.print(array[j] + " ");
   }
   for (int k = 0; k < length; k++){
     if (max < array[k]){
       max = array[k];
     }
   }
     for (int k = 0; k < length; k++){
       if (min > array[k]){
         min = array[k];
       }
     }
     for (int o = 0; o < length; o++){
    sum += array[o];
  }
  avg = sum / length;
  System.out.println();
  System.out.println("Max : " + max);
  System.out.println("Min : " + min);
  System.out.println("Sum : " + (int)sum);
  System.out.println("Avg : " + avg);
   }
   }
