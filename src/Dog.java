// external class to represent dogs
public class Dog {
 // instance fields (variables)
 private  String name;
 private  int size;

 // constructor
 public  Dog (String nm, int sz){
  // initialize instance fields to given parameters
  name = nm;
  size = sz;
 }

 // accessor method for name
 public  String getName(){
  return name;
 }

 // accessor method for size
 public  int getSize(){
  return  size ;
 }

 // method to get bark based on size of dog
 public String getBark(){
  if (size <= 3)
   return "yip";
  else if (size <= 15)
   return "wuf";
  else
   return "WOOOOOOF!";
 }

 // method to wag tail count number of times
 public  void wag(int count){
  for (int c = 1; c <= count; c++)
   System.out.println ("wag");
 }
}