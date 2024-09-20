import java.util.Scanner;
public class RemoveVowelTester{
  public static void main(String [] args){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter A String : ");
    String str = keyboard.next();
    System.out.println(removeVowels(str));
    keyboard.close();
  }
  public static String removeVowels(String str){
    if (str.length() == 0){ return str; } //base case
    char c = str.charAt(0);
    if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
      return removeVowels(str.substring(1));
    } else {
      return c + removeVowels(str.substring(1));
    }
  }
}