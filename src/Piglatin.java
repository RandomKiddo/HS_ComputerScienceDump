/* Programmer:
 Date:
 Project: Lab 3.6 Piglatin
 File Name: Piglatin.java
 Program Description: Converts a given word into piglatin.
*/

import java.util.*;

public class Piglatin{
  public static void main( String[] args ){

 Scanner keyboard = new Scanner( System.in );
 System.out.println("Enter A Word : ");
 String input = keyboard.next();
 String start = "" + input.charAt(0);
 int count = 1;
 char vowel;
 String empty = "";
 int length = input.length();
 String ay = "ay";
 do{
   vowel = input.charAt(count);
   if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u'){
     break;
   }
   count++;
 } while (!(count == length));
 int index = input.indexOf(vowel);
 String way = "way";
 if (start.equalsIgnoreCase("a") || start.equalsIgnoreCase("e") || start.equalsIgnoreCase("i") || start.equalsIgnoreCase("o") || start.equalsIgnoreCase("u")){
   input = input + way;
   System.out.println(input);
 } else {
   empty = input.substring(0,index);
   input = input.substring(index, length);
   input = input + empty;
   input = input + ay;
   System.out.println(input);
 }
   
 }

   }
