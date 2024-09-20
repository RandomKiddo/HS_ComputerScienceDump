// Name: Neil Ghugare


import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import javax.swing.JComponent;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;


public class CarViewer{
 public static void main(String[] args){
  // make a frame
  JFrame frame = new JFrame();

  // set the size of the frame
  frame.setSize(300,400);

  // give the frame a title
  frame.setTitle("Two Cars");

  // exit frame when x is clicked
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  // create a new CarComponent object
  CarComponent component = new CarComponent();

  // add CarComponent to frame
  frame.add(component);

  // set frame to be visible
  frame.setVisible(true);

 }
}


class Car{
 // enter the code for you car class here
  private int xcoord;
    private int ycoord;
    private Color color;
    
    public Car(int x, int y, Color c){
        xcoord = x;
        ycoord = y;
        color = c;
    }
    
    public void drawTires(Graphics2D g){
        Ellipse2D.Double wheel1 = new Ellipse2D.Double(xcoord + 10, ycoord + 20, 10, 10);
        Ellipse2D.Double wheel2 = new Ellipse2D.Double(xcoord + 40, ycoord + 20, 10, 10);
        g.setColor(Color.BLACK);
        g.draw(wheel1);
        g.draw(wheel2);
        g.fill(wheel1);
        g.fill(wheel2);
    }
    public void drawBody(Graphics2D g){
        Rectangle body = new Rectangle(xcoord, ycoord + 10, 60, 10);
        g.setColor(color);
        g.draw(body);
        g.fill(body);
    }
    public void drawFrontWindshield(Graphics2D g){
        Line2D.Double frontW = new Line2D.Double(xcoord + 10, ycoord + 10, xcoord + 20, ycoord);
        g.setColor(Color.BLACK);
        g.draw(frontW);
    }
    public void drawRoof(Graphics2D g){
        Line2D.Double roof = new Line2D.Double(xcoord + 20, ycoord, xcoord + 40, ycoord);
        g.setColor(Color.BLACK);
        g.draw(roof);
    }
    public void drawRearWindshield(Graphics2D g){
        Line2D.Double rearW = new Line2D.Double(xcoord + 40, ycoord, xcoord + 50, ycoord + 10);
        g.setColor(Color.BLACK);
        g.draw(rearW);
    }
    public void draw(Graphics2D g){
        drawTires(g);
        drawBody(g);
        drawFrontWindshield(g);
        drawRoof(g);
        drawRearWindshield(g);
    }
  }




class CarComponent extends JComponent{
 public void paintComponent(Graphics g){

  // create Graphics2D object
  Graphics2D g2d = (Graphics2D) g;

  // create Car object
  Car car1 = new Car(10,10,Color.BLUE);

  // initial position of second car
  int x = getWidth() - 100;
  int y = getHeight() - 100;

  // create second car object
  Car car2 = new Car(x,y,Color.RED);

  // draw objects on frame
  car1.draw(g2d);
  car2.draw(g2d);
 }
}
