import java.util.*;
public class NumberGroupTester {
    public static void main(String[] args) {

  List<NumberGroup> g = new ArrayList<NumberGroup>();
  g.add(new Range(5,8));
  g.add(new Range(10,12));
  g.add(new Range(1,6));
  MultipleGroups multiple1 = new MultipleGroups(g);

  System.out.println("multiple1.contains(2): " + multiple1.contains(2));
  System.out.println("multiple1.contains(9): " + multiple1.contains(9));
  System.out.println("multiple1.contains(6): " + multiple1.contains(6));
 }
}



class MultipleGroups implements NumberGroup{
 private List<NumberGroup> groupList;

 public MultipleGroups(List<NumberGroup> g){
  groupList = g;
 }
 
 public boolean contains(int in){
   for (NumberGroup n : this.groupList){
     if (n.contains(in)){
       return true;
     }
   }
   return false;
 }
}

interface NumberGroup{
  boolean contains(int in);
}

class Range implements NumberGroup{
  private int min, max;
  private ArrayList<Integer> nums;
  public Range(int a, int b){
    min = a; max = b;
    nums = new ArrayList<Integer>();
    for (int c = 0; c <= max - min; c++){
      nums.add(c + min);
    }
  }
  public boolean contains(int in){
    if (this.nums.contains(in)){
      return true;
    }
    return false;
  }
}