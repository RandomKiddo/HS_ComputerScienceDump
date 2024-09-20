import java.util.*;
public class RandomStringChooserTester {
    public static void main(String[] args) {
  String [] wordArray = {"wheels","on","the","bus"};
  RandomStringChooser sChooser = new RandomStringChooser(wordArray);
  for (int k = 0; k < 6; k++)
   System.out.println(sChooser.getNext() + " ");


  RandomLetterChooser letterChooser = new RandomLetterChooser("cat");
  for (int k = 0; k < 4; k++)
   System.out.println(letterChooser.getNext() + " ");

 }
}

class RandomLetterChooser extends RandomStringChooser{
  public RandomLetterChooser(String str){
    super(getSingleLetters(str));
  }
 public static String[] getSingleLetters(String str){
  String[] out = new String[str.length()];
  for (int i = 0; i < str.length(); i++)
   out[i] = str.charAt(i) + "";
  return out;
 }
}

class RandomStringChooser{
  private String[] words;
  private ArrayList<String> sent;
  public RandomStringChooser(String [] w){
    words = w;
    sent = new ArrayList<String>();
  }
  public String getNext(){
    if (sent.size() == words.length){
      return "NONE";
    }
    int rand = (int)(Math.random() * words.length);
    while (sent.contains(words[rand])){
      rand = (int)(Math.random() * words.length);
    }
    sent.add(words[rand]);
    return words[rand];
  }
}