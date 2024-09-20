public class CarDriver{
  public static void main(String[] args){
    Car honda = new Car(2011,"Honda");
    System.out.println("Car Info : " + honda.getModelYear() + " " + honda.getMake());
    System.out.println();
    for (int a = 0; a < 5; a++){
      honda.accelerate();
      System.out.println("Current Speed : " + honda.getSpeed());
    }
    for (int b = 0; b < 5; b++){
      honda.brake();
      System.out.println("Current Speed : " + honda.getSpeed());
    }
  }
}