/*
 * Programmer:
 * Assignment:    Lab 6.1 - ArrayStats
 * File Name:     ArrayStats.Java
 * Description:   This program outputs various statistics about an array of integers.
 *
 */


public class ArrayStats{

 // return minimum value in array
 public static int min( int[] input ){
   int min = input[0];
   for (int cnt = 0; cnt < input.length; cnt++){
     if (input[cnt] < min){
       min = input[cnt];
     }
   }
   return min;
 }

 // return maximum value in array
 public static int max( int[] input ){
   int max = 0;
   for (int cnt = 0; cnt < input.length; cnt++){
     if (input[cnt] > max){
       max = input[cnt];
     }
   }
   return max;
 }

 // return the range of the data (max - min)
 public static int range( int[] input ){
   return max(input) - min(input);
 }

 // return the average of the data
 public static double mean( int[] input ){
   int sum = 0, count = 0;
   for (int s : input){
     sum += s;
     count++;
   }
   return (double)sum/(double)count;
 }

 // return the variance of the data (the average square difference between the data and the mean)
 public static double variance( int[] input ){
   double mean = mean(input);
   double sum = 0.0;
   int count = 0;
   for (int s : input){
     sum += Math.pow(s-mean,2);
     count++;
   }
   return sum / (double)count;
 }

 // return the standard deviation of the data (the square root of the average square difference between the data and the mean)
 public static double standardDeviation( int[] input ){
   return Math.sqrt(variance(input));
 }

 public static void main( String[] args ){
  int [] data = {1, 3, 5, 2, 4, 2, 1, 5, 6, 3, 2, -1, -5, -6, 10, 1, 4, 6, 2};

  // test stats algorithms
  System.out.println("Min: " + min(data));
  System.out.println("Max: " + max(data));
  System.out.println("Range: " + range(data));
  System.out.println("Mean: " + mean(data));
  System.out.println("Variance: " + variance(data));
  System.out.println("Standard Deviation: " + standardDeviation(data));

 }

}