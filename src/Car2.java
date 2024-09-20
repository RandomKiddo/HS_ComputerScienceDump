public class Car2{
  
  private int xcoord;
  private int ycoord;
  private Color carColor;
  
  public Car2(int x, int y, Color c){
    xcoord = x;
    ycoord = y;
    carColor = c;
  }
  
  public void drawTires(Graphics2D g){
    car1.Ellipse2D(xcoord + 10, ycoord + 20);
    car2.Ellipse2D(xcoord + 40, ycoord + 20);
  }
}