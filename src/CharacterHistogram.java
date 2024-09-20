public class CharacterHistogram{
  public static void generateHistogram(String input){
    String scan = "abcdefghijklmnopqrstuvwxyz0123456789";
    input = input.toLowerCase();
    char temp;
    int amount = 0;
    int index = input.indexOf(scan.charAt(0));
    for (int cnt = 0; cnt < scan.length(); cnt++){
      temp = scan.charAt(cnt);
      index = input.indexOf(temp);
      amount = 0;
      while (index != -1){
        amount++;
        index = input.indexOf(temp, index + 1);
      }
      System.out.println(temp + " " + amount);
    }
  }
}