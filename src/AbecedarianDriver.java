public class AbecedarianDriver{
  public static void main(String [] args){
    Abecedarian fake = new Abecedarian();
    String input = fake.getWord();
    boolean decider = fake.isAbecedarian(input);
    System.out.println("Word : " + input);
    if (decider == true){
      System.out.println("Determination : Is Abecedarian");
    } else {
      System.out.println("Determination : Not Abecedarian");
    }
  }
}