public class HW3{
  public static void main(String [] args){
    String filename = "C:\\dictionaries\\words.txt";
    String ccNumber = "1234 5678 1234 5678";
    String last4 = ccNumber.substring(15);
    System.out.println(last4);
    String last5 = ccNumber.substring(13);
    System.out.println(last5);
    String pre = "prefix";
    String notPre = "not";
    System.out.println(pre.startsWith("pre"));
    System.out.println(notPre.startsWith("pre"));
  }
  public boolean startsWith(String prefix){
    int length = prefix.length();
    
    String test = .substring(0,length);
    if (test.equalsIgnoreCase(prefix)){
      return true;
    } else {
      return false;
    }
  }
}