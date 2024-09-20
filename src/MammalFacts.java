public class MammalFacts{
  public static void main(String [] args){
    Mammal[] mammals = new Mammal[3];
    mammals[0] = new Mammal();
    mammals[1] = new Primate();
    mammals[2] = new Chimpanzee();
    for (int a = 0; a < mammals.length; a++){
      System.out.println(mammals[a].funFact());
      System.out.println();
    }
  }
}
class Mammal{
  public String funFact(){
    return "All Mammals Have Hair, Even Dolphins And Whales In The Ocean";
  }
}
class Primate extends Mammal{
  public String funFact(){
    return "There Are An Estimated 704 Species (And Subspecies) Of Primates In The World";
  }
}
class Chimpanzee extends Primate{
  public String funFact(){
    return "Full Grown Chimpanzees Can Be Up To 8 Times Stronger Than An Adult Male";
  }
}
