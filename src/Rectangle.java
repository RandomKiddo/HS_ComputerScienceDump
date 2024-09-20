public class Rectangle{
  //Fields
  private int width;
  private int height;
  //Constructors
  public Rectangle(int w, int h){
    width = w;
    height = h;
  }
  public Rectangle(int w){
    width = w;
    height = w;
  }
  public Rectangle(){
    width = 1;
    height = 1;
  }
  //Methods
  public boolean isSquare(){
    if (width == height){
      return true;
    } else {
      return false;
    }
  }
  public void quadratize(){
    int area = height * width;
    int difference = area;
    int a = 1;
    while (a * a <= area){
      if (area - a * a < difference){
        width = a;
        height = a;
        difference = area - a * a;
      }
      a++;
    }
    if (a * a - area < difference){
      width = a;
      height = a;
    }
    }
  public int getWidth(){
    return width;
  }
  public int getHeight(){
    return height;
  }
}