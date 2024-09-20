/* Programmer:
   Date:
   Project: PerfectNumbers
   File Name: PerfectNumbers.java
   Program Description: This program will print the first seven PerfectNumbers
*/



public class PerfectNumbers {

 public static void main(String [] args) {

  // start code to search for first seven Mersenne prime numbers here
   long a = 3,b,c,d,e,f,g;
        while (isPrime(a) != true){
            a = a * 2 + 1;
        }
        b = a * 2 + 1;
        while (isPrime(b) != true){
            b = b * 2 + 1;
        }
        c = b * 2 + 1;
        while (isPrime(c) != true){
            c = c * 2 + 1;
        }
        d = c * 2 + 1;
        while (isPrime(d) != true){
            d = d * 2 + 1;
        }
        e = d * 2 + 1;
        while (isPrime(e) != true){
            e = e * 2 + 1;
        }
        f = e * 2 + 1;
        while (isPrime(f) != true){
            f = f * 2 + 1;
        }
        g = f * 2 + 1;
        while (isPrime(g) != true){
            g = g * 2 + 1;
        }
        System.out.println("Mersenne Primes : " + a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g);
        long a2 = a, b2 = b, c2 = c, d2 = d, e2 = e, f2 = f, g2 = g;
        a2 = a2 * (int)((double)a/2+0.5);
        b2 = b2 * (int)((double)b/2+0.5);
        c2 = c2 * (int)((double)c/2+0.5);
        d2 = d2 * (int)((double)d/2+0.5);
        e2 = e2 * (int)((double)e/2+0.5);
        f2 = f2 * (int)((double)f/2+0.5);
        g2 = g2 * (int)((double)g/2+0.5);
        System.out.println("Perfect Numbers : " + a2 + " " + b2 + " " + c2 + " " + d2 + " " + e2 + " " + f2 + " " + g2);

  // then print their corresponding perfect numbers
  // be sure to use the long data type for both the mersenne and perfect numbers




 } // end of main method


 public static boolean isPrime ( long n ){
 // enter code to print a pyramid of stars containing n rows
 int b = (int)((double)n / 2 + 0.5);
        boolean forloop = true;
        for (int a = 2; a <= b; a++){
            if (n % a == 0){
                forloop = false;
                break;
            }
        }
        return forloop;
 } // end of sumDigits method
}