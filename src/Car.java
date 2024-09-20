public class Car{
  //Fields
  private int modelYear;
  private String make;
  private int speed;
  //Constructors
  public Car(int a, String b){
    modelYear = a;
    make = b;
    speed = 0;
  }
  //Accessor Methods
  public int getModelYear(){
    return modelYear;
  }
  public String getMake(){
    return make;
  }
  public int getSpeed(){
    return speed;
  }
  //Mutator Methods
  public void accelerate(){
    speed += 5;
  }
  public void brake(){
    speed -= 5;
  }
}