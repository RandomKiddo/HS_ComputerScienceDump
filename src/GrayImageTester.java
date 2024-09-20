public class GrayImageTester{
 public static void main(String[] args){
  int[][] p1 = {{255,184,178,84,129},{84,255,255,130,84},{78,255,0,0,78},{84,130,255,130,84}};

  GrayImage a = new GrayImage(p1);
  System.out.println(a + "\nCall to count white pixels: " + a.countWhitePixels()+"\n\n");

  int[][] p2 = {{221,184,178,84,135},{84,255,255,130,84},{78,255,0,0,78},{84,130,255,130,84}};


  GrayImage b = new GrayImage(p2);
  System.out.println(b + "\nProcess Image: \n");
  b.processImage();
  System.out.println(b);


 }
}
class GrayImage{
 public static final int BLACK = 0;
 public static final int WHITE = 255;

 private int[][] pixelValues;

 public GrayImage(int[][] img){
  pixelValues = new int[img.length][img[0].length];
  for (int i = 0; i < img.length; i++){
   for (int j = 0; j < img[0].length; j++){
    pixelValues[i][j] = img[i][j];
   }
  }
 }

 public int countWhitePixels( ){
   int count = 0;
   for(int [] row : pixelValues){
     for(int val : row){
       if (val == 255){
         count++;
       }
     }
   }
   return count;
 }
 public void processImage(){
   //int[] hold;
   for(int a = 0; a < pixelValues.length; a++){
     if (a < pixelValues.length - 2){
       for(int b = 0; b < pixelValues[a].length; b++){
         if(b < pixelValues[a].length - 2){
           if(pixelValues[a][b] - pixelValues[a+2][b+2] < 0){
             pixelValues[a][b] = 0;
           } else {
             pixelValues[a][b] -= pixelValues[a+2][b+2];
           }
         }
       }
     }
   }
 }

 public String toString(){
  String out = "";
  for (int i = 0; i < pixelValues.length; i++){
   for (int j = 0; j < pixelValues[0].length; j++)
    out += pixelValues[i][j] + "\t";
   out += "\n";
  }
  return out;
 }
}
