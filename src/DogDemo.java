// driver class to test dog external class
public class DogDemo {
 // main method where program will start
 public static void main(String[] args){

  // instantiate an instance of the Dog class with a variable name rover
  Dog rover = new Dog("Rover", 25);

  // print dog info using accessor methods
  System.out.println("My Dog Info:");
  System.out.println("Name: " + rover.getName());
  System.out.println("Size: " + rover.getSize()+ " pounds");
  System.out.println();
  System.out.println();

  // make dog bark and wag tail
  System.out.println("Listen to " + rover.getName() + " speak:");
  for (int cnt = 1; cnt <= 5; cnt++)
   System.out.println(rover.getBark());

  System.out.println();
  System.out.println();
  System.out.println("See how happy " + rover.getName() + " is:");
  rover.wag(10);

  System.out.println();
  System.out.println();


  // instantiate an instance of the Dog class with a variable name mitzi
  Dog mitzi = new Dog("Mitzi", 3);

  // print dog info using accessor methods
  System.out.println("My Dog Info:");
  System.out.println("Name: " + mitzi.getName());
  System.out.println("Size: " + mitzi.getSize()+ " pounds");
  System.out.println();
  System.out.println();

  // make dog bark and wag tail
  System.out.println("Listen to " + mitzi.getName() + " speak:");
  for (int cnt = 1; cnt <= 5; cnt++)
   System.out.println(mitzi.getBark());


  System.out.println();
  System.out.println();
  System.out.println("See how happy " + mitzi.getName() + " is:");
  mitzi.wag(6);

  System.out.println();
  System.out.println();


  // instantiate an instance of the Dog class with a variable name spot
  Dog spot= new Dog("Spot", 10);

  // print dog info using accessor methods
  System.out.println("My Dog Info:");
  System.out.println("Name: " + spot.getName());
  System.out.println("Size: " + spot.getSize()+ " pounds");
  System.out.println();
  System.out.println();

  // make dog bark and wag tail
  System.out.println("Listen to " + spot.getName() + " speak:");
  for (int cnt = 1; cnt <= 3; cnt++)
   System.out.println(spot.getBark());

  System.out.println();
  System.out.println();
  System.out.println("See how happy " + spot.getName() + " is:");
  mitzi.wag(8);


  System.out.println("Thank you for demo-ing the Dog class!!");

 }
}