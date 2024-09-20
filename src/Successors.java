/*
 * Programmer:
 * Assignment:    Lab 5.7 - Successors
 * File Name:     Successors.Java
 *
 */


public class Successors{
 public static void main(String[] args){
  int[][] arr = {{15, 5, 9, 10},{12, 16, 11, 6},{14, 8, 13, 7}};

  System.out.println("findPosition(8,arr) = " + findPosition(8, arr) + " - answer should be (2, 1)");
  System.out.println("findPosition(17,arr) = " + findPosition(17, arr) + " - answer should be null");

  Position[][] b = getSuccessorArray(arr);

  System.out.println("\n\nYour Answer:");
  for (int r = 0; r < b.length; r++){
   for (int c = 0; c < b[0].length; c++)
    System.out.print(b[r][c] + "\t");
   System.out.println();
  }
  System.out.println("\n\nCorrect Answer:");
  System.out.println("(1,1)\t(1,3)\t(0,3)\t(1,2)");
  System.out.println("(2,2)\tnull\t(1,0)\t(2,3)");
  System.out.println("(0,0)\t(0,2)\t(2,0)\t(2,1)");
 }

 public static Position findPosition(int num, int[][] intArr){
  // implement part a
   int rowcnt = 0;
   for (int [] row : intArr){
     for (int cnt = 0; cnt < row.length; cnt++){
       if (row[cnt] == num){
         return new Position(rowcnt, cnt);
       }
     }
     rowcnt++;
   }
   return null;
 }

 public static Position[][] getSuccessorArray(int[][] intArr){
  // implement part b
   Position[][] successor = new Position[intArr.length][intArr[0].length];
   for (int x = 0; x < intArr.length; x++){
     for (int y = 0; y < intArr[x].length; y++){
       if (findPosition(intArr[x][y] + 1, intArr) == null){
         successor[x][y] = null;
       } else {
         successor[x][y] = findPosition(intArr[x][y] + 1, intArr);
       }
     }
   }
   return successor;
 }
}

class Position{
 int row, col;
 public Position(int r, int c){
  row = r;
  col = c;
 }

 public String toString( ){
  return "(" + row + "," + col + ")";
 }
}