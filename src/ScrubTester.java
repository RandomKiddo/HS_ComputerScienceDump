import java.util.Scanner;
public class ScrubTester{
  public static void main(String [] args){
    String in = "";
    Scanner keyboard = new Scanner(System.in);
    while (in.equalsIgnoreCase("quit") == false){
      in = keyboard.nextLine();
      ScrubTester.statement(in);
    }
    keyboard.close();
  }
  public static void statement(String in){
    if (in.equalsIgnoreCase("Josh")){System.out.println("");}
    else if (in.equalsIgnoreCase("Suchi")){System.out.println("");}
    else if (in.equalsIgnoreCase("Pranav")){System.out.println("SCRUB LEVEL OVER 9000, OMG I AM BIG SCRUB ON THE FLAT-EARTH!!!");}
    else if (in.equalsIgnoreCase("Nithil")){System.out.println("YOU ARE A TRY-HARD CALC BOI. I LOVE SYSTEM.OUT.PRITNLN()");}
    else if (in.equalsIgnoreCase("Aryaman")){System.out.println("");}
    else if (in.equalsIgnoreCase("quit")){/*Do Nothing*/}                                                   
    else{System.out.println("I HATE YOU SCRUB");}
  }
}