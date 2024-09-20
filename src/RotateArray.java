/*
 * Programmer:
 * Assignment:    Lab 6.4 - RotateArray
 * File Name:     RotateArray.Java
 * Description:   This program rotates a given array forward or backward.
 *
 */

public class RotateArray{
 // rotate the array to the right if d is positive and to the left if d is negative
 public static int[] rotate( int[] a, int d ){
   int[] rotated = new int[a.length];
   if (d > 0 && d <= a.length){
     int temp;
       temp = a.length;
       temp -= d;
     for (int cnt = 0; cnt < d; cnt++){
       rotated[cnt] = a[temp];
       temp++;
     }
     temp = 0;
     for (int cnt = d; cnt < a.length; cnt++){
       rotated[cnt] = a[temp];
       temp++;
     }
     return rotated;
   } else if (d < 0 && d * -1 <= a.length){
     int temp = d * -1;
     for (int cnt = 0; cnt < a.length + d; cnt++){
       rotated[cnt] = a[temp];
       temp++;
     }
     temp = 0;
     for(int cnt = a.length + d; cnt < a.length; cnt++){
       rotated[cnt] = a[temp];
       temp++;
     }
     return rotated;
   } else if (d==0) {
     return a;
   } else if (d > a.length) {
     while (d >= 0){
       d-=a.length;
     }
     d+=a.length;
     int temp = a.length - d;
     for (int cnt = 0; cnt < d; cnt++){
       rotated[cnt] = a[temp];
       temp++;
     }
     temp = 0;
     for (int cnt = d; cnt < a.length; cnt++){
       rotated[cnt] = a[temp];
       temp++;
     }
     return rotated;
   } else {
     d *= -1;
     while (d >= 0){
       d-=a.length;
     }
     d+=a.length;
     int temp = d;
     for (int cnt = 0; cnt < a.length + d; cnt++){
       rotated[cnt] = a[temp];
       temp++;
     }
     temp = 0;
     for(int cnt = a.length + d; cnt < a.length; cnt++){
       rotated[cnt] = a[temp];
       temp++;
     }
     return rotated;
   }
 }

 public static String toString( int[] a ){
  String b = "";
  for (int i = 0; i < a.length; i++)
   b += a[i] + " ";
  return b;
 }

 public static void main( String[] args ){
  int[] a = {1, 2, 3, 4, 5, 6, 7, 8};

  System.out.println(toString(a));
  System.out.println("rotate(a, 3) = " + toString(rotate(a,3)));
  System.out.println("rotate(a, -6) = " + toString(rotate(a,-6)));
  System.out.println("rotate(a, 0) = " + toString(rotate(a,0)));
  System.out.println("rotate(a,10) = " + toString(rotate(a,10)));
 }
}