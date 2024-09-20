public class SkyViewTester{
 public static void main(String[] args){
  double[] s1 = {0.3, 0.7, 0.8, 0.4, 1.4, 1.1, 0.2, 0.5, 0.1, 1.6, 0.6, 0.9};
  SkyView v1 = new SkyView(4,3,s1);
  System.out.println(v1 + "\n\n");

  double[] s2 = {0.3, 0.7, 0.8, 0.4, 1.4, 1.1};
  SkyView v2 = new SkyView(3,2,s2);
  System.out.println(v2 + "\n\n");

  System.out.println("Calling getAverage: " + v1.getAverage(1,2,0,1));
 }
}

class SkyView{
 private double[][] view;
 public SkyView(int numRows, int numCols, double[] scanned){
   view = new double[numRows][numCols];
   int tracker = -1;
   int y;
   int cnt = 0;
   for (int x = 0; x < numRows; x++){
     tracker *= -1;
     if (tracker == 1){
       y = 0;
       while (y < numCols){
         view[x][y] = scanned[cnt];
         cnt++;
         y++;
       }
     } else {
       y = numCols - 1;
       while (y >= 0){
         view[x][y] = scanned[cnt];
         cnt++;
         y--;
       }
     }
   }
 }
 public double getAverage(int startRow, int endRow, int startCol, int endCol){
   double sum = 0.0;
   int counter = 0;
   int x = startRow, y = startCol;
   while (x <= endRow){
     y = startCol;
     while (y <= endCol){
       sum += view[x][y];
       y++;
       counter++;
     }
     x++;
     //y = startCol;
   }
   return sum/(double)counter;
 }

 public String toString( ){
  String out = "";
  for (int r = 0; r < view.length; r++){
   for (int c = 0; c < view[0].length; c++){
    out += view[r][c] + "\t";
   }
   out += "\n";
  }
  return out;
 }
}