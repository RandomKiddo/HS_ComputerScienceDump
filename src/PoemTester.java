public class PoemTester{
  public static void main(String [] args){
    Poem p = new Haiku();
    p.printRhythm();
    System.out.println();
    
    p = new Limerick();
    p.printRhythm();
    System.out.println();
  }
}
abstract class Poem{
  public abstract int getNumLines();
  public abstract int getSyllables(int k);
  public void printRhythm(){
    String toPrint = "";
    int syllables = 0;
    for (int a = 0; a < this.getNumLines(); a++){
      syllables = this.getSyllables(a+1);
      for (int b = 0; b < syllables; b++){
        if (b != syllables - 1){
          toPrint += "ta-";
        }
      }
      if (a != this.getNumLines() - 1){
        toPrint += "ta\n";
      } else {
        toPrint += "ta";
      }
    }
    System.out.println(toPrint);
  }
}
class Haiku extends Poem{
  public int getNumLines(){ return 3; }
  public int getSyllables(int k){
    int[] lines = {5,7,5};
    return lines[k-1];
  }
}
class Limerick extends Poem{
  public int getNumLines(){ return 5; }
  public int getSyllables(int k){
    int[] lines = {9,9,6,6,9};
    return lines[k-1];
  }
}