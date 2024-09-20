import java.util.Scanner;
public class Scrub{
  public static void main(String [] args){
    Scanner keyboard = new Scanner(System.in);
    String name = "";
    Scrub test;
    do{
      name = keyboard.nextLine();
      test = new Scrub();
      System.out.println(name + " " + test);
    } while (name.equalsIgnoreCase("quit") == false);
  }
  private final boolean scrub;
  public Scrub(){
    int rand = (int)(Math.random() * 2);
    if (rand == 0){
      scrub = true;
    } else {
      scrub = false;
    }
  }
  public String toString(){
    String tos;
    if (scrub == true){
      tos = "Is A Scrub";
    } else {
      tos = "Is Not A Scrub";
    }
    return tos;
  }
}