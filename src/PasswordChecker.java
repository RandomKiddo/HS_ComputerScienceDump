import java.util.*;
public class PasswordChecker{
  public static void main(String [] args){
  Scanner keyboard = new Scanner(System.in);
  boolean conditions = false;
  int length;
  char temp;
      System.out.println("Enter A Password : ");
  String input = keyboard.nextLine();
  boolean upper = false, lower = false, digit = false, start = false, whitespace = false, punctuation = true;
  while (conditions == false){
    length = input.length();
    for (int cnt = 0; cnt < length; cnt++){
      temp = input.charAt(cnt);
      if (Character.isUpperCase(temp)){
        upper = true;
      }
      if (Character.isLowerCase(temp)){
        lower = true;
      }
      if (Character.isDigit(temp)){
        digit = true;
      }
      if (!(Character.isWhitespace(temp))){
        whitespace = true;
      }
      if (Character.isLetterOrDigit(temp) == false && Character.isWhitespace(temp) == false){
        punctuation = false;
      } else {
        punctuation = true;
      }
    }
    if (Character.isLetter(input.charAt(0))){
      start = true;
    }
    if (start == true && whitespace == true && digit == true && lower == true && upper == true && length >= 7 && punctuation == true){
      conditions = true;
    } else {
      System.out.println("Password does not meet conditions, enter a new password : ");
      input = keyboard.nextLine();
      upper = false;
      lower = false;
      digit = false;
      start = false;
      whitespace = false;
      punctuation = false;
    }
  }
}
}