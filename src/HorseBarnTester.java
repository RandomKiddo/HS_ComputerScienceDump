public class HorseBarnTester {
    public static void main(String[] args) {
  Horse[] h = new Horse[7];
  h[0] = new ActualHorse("Trigger",1340);
  h[2] = new ActualHorse("Silver",1210);
  h[5] = new ActualHorse("Patches",1350);
  h[6] = new ActualHorse("Duke",1410);
  HorseBarn sweetHome = new HorseBarn(h);

  System.out.println("\n\n" + sweetHome + "\n\n");

  System.out.println(sweetHome.findHorseSpace("Trigger"));
  System.out.println(sweetHome.findHorseSpace("Silver"));
  System.out.println(sweetHome.findHorseSpace("Coco"));


  sweetHome.consolidate();
  System.out.println("\n\n" + sweetHome);

 }
}

class ActualHorse implements Horse{
 String name;
 int weight;

 public ActualHorse(String n, int w){
  name = n;
  weight = w;
 }

 public String getName(){ return name; }
 public int getWeight() { return weight; }
}

interface Horse{
 String getName();
 int getWeight();
}

class HorseBarn{
 private Horse[] spaces;

 public HorseBarn(Horse[] h){
  spaces = h;
 }

 public int findHorseSpace(String name){
   for (int a = 0; a < spaces.length; a++){
     if (spaces[a] != null && spaces[a].getName().equals(name)){
       return a;
     }
   }
   return -1;
 }

 public void consolidate(){
   int start = 0;
   Horse[] temp = new Horse[spaces.length];
   for (int a = 0; a < spaces.length; a++){
     if (spaces[a] != null){
       temp[start] = spaces[a];
       start++;
     }
   }
   for (int b = start; b < spaces.length; b++){
     temp[b] = null;
   }
   spaces = temp;
 }

 public String toString(){
  String out = "";
  for (Horse h:spaces){
   if (h == null)
    out += "null\n";
   else
    out += "\"" + h.getName() + "\" - " + h.getWeight() + "\n";
  }
  return out;
 }
}