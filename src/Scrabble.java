import java.util.Scanner;
public class Scrabble{
  private final String alphabet = "abcdefghijklmnopqrstuvwxyz";
  private final int [] points = {1,3,3,2,1,4,2,4,1,8,5,1,3,1,3,3,10,1,1,1,1,4,4,8,4,10};
  public int computeScore(String word){
    int sum = 0;
    int index;
    for (int cnt = 0; cnt < word.length(); cnt++){
      index = alphabet.indexOf(Character.toLowerCase(word.charAt(cnt)));
      sum += points[index];
    }
    return sum;
  }
  public static void main(String [] args){
    Scanner keyboard = new Scanner(System.in);
    String input = keyboard.next();
    Scrabble word = new Scrabble();
    System.out.println("The word " + input + " is worth " + word.computeScore(input) + " points");
  }
}