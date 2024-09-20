
public class CharToInt{
  public static void main(String [] args){
    String what = "Nithil";
    char a = what.charAt(2);
    int b = what.indexOf(2);
    int c = 0;
    while (c<5){
    if (a == b){
      System.out.println("Right");
    } else {
      System.out.println("Wrong");
    }
    c++;
    }
  }
}