import javax.swing.JFrame;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Polygon;
import java.awt.Graphics;
import javax.swing.JComponent;

public class GraphicsViewer{
 public static void main(String[] args){
  // make a frame
  JFrame frame = new JFrame();

  // set the size of the frame
  frame.setSize(1000,600);

  // give the frame a title
  frame.setTitle("Bullseye");

  // exit frame when x is clicked
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  // create a new CarComponent object
  GraphicsComponent component = new GraphicsComponent();

  // add CarComponent to frame
  frame.add(component);

  // set frame to be visible
  frame.setVisible(true);

 }
}


class GraphicsComponent extends JComponent{
 public void paintComponent(Graphics g){

  // create Graphics2D object
  Graphics2D g2d = (Graphics2D) g;


  //Start your code here
  // g2d is the Graphics2D object you should be passing into all of the draw methods
  House a = new House(320,50,100);
  a.drawFrame(g2d);
  a.drawDoor(g2d);
  a.drawWindows(g2d);
  a.drawRoof(g2d);
  House b = new House(75,240,75);
  b.drawFrame(g2d);
  b.drawDoor(g2d);
  b.drawWindows(g2d);
  b.drawRoof(g2d);
  Bullseye c = new Bullseye(7,10,700,35);
  c.drawLayer(g2d, 1, c.getLayerColor(1));
  c.drawLayer(g2d, 2, c.getLayerColor(2));
  c.drawLayer(g2d, 3, c.getLayerColor(3));
  c.drawLayer(g2d, 4, c.getLayerColor(4));
  c.drawLayer(g2d, 5, c.getLayerColor(5));
  c.drawLayer(g2d, 6, c.getLayerColor(6));
  c.drawLayer(g2d, 7, c.getLayerColor(7));
  Bullseye d = new Bullseye(11,15,645,190);
  d.drawLayer(g2d, 1, d.getLayerColor(1));
  d.drawLayer(g2d, 2, d.getLayerColor(2));
  d.drawLayer(g2d, 3, d.getLayerColor(3));
  d.drawLayer(g2d, 4, d.getLayerColor(4));
  d.drawLayer(g2d, 5, d.getLayerColor(5));
  d.drawLayer(g2d, 6, d.getLayerColor(6));
  d.drawLayer(g2d, 7, d.getLayerColor(7));
  d.drawLayer(g2d, 8, d.getLayerColor(8));
  d.drawLayer(g2d, 9, d.getLayerColor(9));
  d.drawLayer(g2d, 10, d.getLayerColor(10));
  d.drawLayer(g2d, 11, d.getLayerColor(11));
 }
}

class House{
 private int leftmost, topmost, scale, hheight, hwidth, rheight;
 private final int HOUSE_HEIGHT = 200;
 private final int HOUSE_WIDTH = 300;
 private final int ROOF_HEIGHT = 100;

 /*  x = leftmost pixel
  y = topmost pixel
  s = scale - 100 = full size, 50 = half size
 */

 public House(int x, int y, int s){
  leftmost = x;
  topmost = y;
  scale = s;
  hheight = (int)((scale/100.0)*HOUSE_HEIGHT);
  hwidth = (int)((scale/100.0)*HOUSE_WIDTH);
  rheight = (int)((scale/100.0)*ROOF_HEIGHT);
 }

 public void drawRoof(Graphics2D g){

  int[] x = {leftmost, leftmost+hwidth/2,leftmost+hwidth};
  int[] y = {topmost + rheight, topmost, topmost + rheight};

  Polygon p = new Polygon(x,y,x.length);
  g.setColor(Color.BLACK);
  g.drawPolygon(p);
  g.fillPolygon(p);
 }

 public void drawWindows(Graphics2D g){
  int w = (int)(0.25*hheight), h = w, hg = (int)(0.1*hwidth), vg = (int)(0.2*hheight);
  Rectangle window = new Rectangle(leftmost+hg, topmost+rheight+vg, w,h);
  g.setColor(Color.BLACK);
  g.draw(window);
  g.setColor(Color.WHITE);
  g.fill(window);


  window = new Rectangle(leftmost+hwidth-hg-w, topmost+rheight+vg, w,h);
  g.setColor(Color.BLACK);
  g.draw(window);
  g.setColor(Color.WHITE);
  g.fill(window);

 }

 public void drawDoor(Graphics2D g){
  int w = (int)(0.25*hheight), h = (int)(0.5*hheight);
  Rectangle door = new Rectangle(leftmost+hwidth/2-w/2, topmost+rheight+hheight-h, w,h);
  g.setColor(Color.BLACK);
  g.draw(door);
  g.setColor(Color.GRAY);
  g.fill(door);

 }

 public void drawFrame(Graphics2D g){
  Rectangle house = new Rectangle(leftmost, topmost+rheight, hwidth, hheight);
  g.setColor(Color.BLACK);
  g.draw(house);
  g.setColor(Color.RED);
  g.fill(house);
 }

}

class Bullseye{
 private int nLevels, width, xoffset, yoffset, lastix;
 private Color[] colors = {Color.BLACK, Color.BLUE, Color.RED, Color.YELLOW, Color.ORANGE};

 /*
  n = numbers of layers in bullseye
  w = width of bullseye
  x = leftmost coordinate of bullseye
  y = topmost coordinate of bullseye
 */

 public Bullseye(int n, int w, int x, int y){
  nLevels = n;
  width = w;
  xoffset = x;
  yoffset = y;
  lastix = -1;
 }

 // level = level of the bullseye, 1 is the outermost level
 public Color getLayerColor(int level){
  if (level % 2 == 1){
   int ix;
   do{
    ix = (int)(colors.length*Math.random());
   } while (ix == lastix);
   lastix = ix;
   return colors[ix];
  }
  return Color.WHITE;
 }

 // level = layer of the bullseye
 // c = color of the layer
 public void drawLayer(Graphics2D g, int level, Color c){

  int x = (level - 1)*width;
  int diameter = 2*width*(nLevels-(level-1));
  Ellipse2D.Double circle = new Ellipse2D.Double(xoffset+x, yoffset+x, diameter, diameter);
  g.setColor(c);
  g.draw(circle);
  g.fill(circle);
 }



}