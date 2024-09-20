import java.util.*;
public class Abecedarian{
  //Fields
  private boolean determine;
  //Constructors
  public Abecedarian(){
  }
  //Accessor Methods
  public String getWord(){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter A Word : ");
    String input = keyboard.next();
    return input;
  }
  //Mutator Methods
  public boolean isAbecedarian(String b){
    for (int c = 0; c < b.length() - 1; c++){
      String empty1 = "";
      String empty2 = "";
      empty1 += b.charAt(c);
      empty2 += b.charAt(c + 1);
      if ((empty1.compareTo(empty2))<0){
        determine = true;
      } else {
        determine = false;
        break;
      }
    }
    return determine;
  }
}