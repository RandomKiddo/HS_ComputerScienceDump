/* Programmer:
 Date:
 Project: Lab 3.5 RemovePhrase
 File Name: RemovePhrase.java
 Program Description: Removes a given phrase every time it is appears in a sentence.
*/

import java.util.*;

public class RemovePhrase{
  public static void main( String[] args ){

  Scanner keyboard = new Scanner( System.in );
  System.out.println("Enter A Sentence : ");
  String input1 = keyboard.nextLine();
  System.out.println("Choose A Phrase To Remove : ");
  String input2 = keyboard.nextLine();
  int length1 = input1.length();
  int length2 = input2.length();
  int end = 0;
  int index = 0;
  int count = 0;
  do{
    index = input1.indexOf(input2, index);
    if (index == -1){
      break;
    }
    end = index + length2;
    input1 = input1.substring(0,index) + input1.substring(end,length1);
    length1 = input1.length();
    count++;
  } while (!(count < 0));
  System.out.println(input1);
  }
}