/* Name:
   Lab 7.3 - SparseArray
*/

import java.util.*;

public class SparseArrayTester{
 public static void main( String[] args ){

 SparseArray array = new SparseArray();
 array.addEntry(new SparseArrayEntry(2, 0, 1));
 array.addEntry(new SparseArrayEntry(1, 1, 5));
 array.addEntry(new SparseArrayEntry(3, 1, -9));
 array.addEntry(new SparseArrayEntry(1, 4, 4));

 array.setNumRows(6);
 array.setNumCols(5);

 System.out.println("numRows: " + array.getNumRows() + "\nnumCols: " + array.getNumCols() + "\n\n" + array);

 System.out.println("Value at (3,1): " + array.getValueAt(3,1));
 System.out.println("Value at (3,3): " + array.getValueAt(3,3));

 array.removeColumn(1);

 System.out.println("\n\nRemove Column 1\nnumRows: " + array.getNumRows() + "\nnumCols: " + array.getNumCols() + "\n\n" + array);

 }
}

class SparseArray{
 private int numRows, numCols;
 private List<SparseArrayEntry> entries;

 public SparseArray(){
  entries = new ArrayList<SparseArrayEntry>();
 }

 public int getValueAt(int row, int col){
  // part a
   for (SparseArrayEntry entry : entries){
     if(entry.getRow() == row && entry.getCol() == col){
       return entry.getValue();
     }
   }
   return 0;
 }

 public void removeColumn(int col){
  // part b
   SparseArrayEntry entry = null;
   for (int a = 0; a < entries.size(); a++){
     entry = entries.get(a);
     if (entry.getCol() == col){
       entries.remove(a);
       a--;
     }
   }
   entry = null;
   for (int b = 0; b < entries.size(); b++){
     entry = entries.get(b);
     if (entry.getCol() > col){
       entries.set(b,new SparseArrayEntry(entry.getRow(),entry.getCol()-1,entry.getValue()));
     }
   }
   setNumCols(this.getNumCols()-1);
 }

 public void setNumRows(int r){ numRows = r; }
 public void setNumCols(int c){ numCols = c; }

 public void addEntry(SparseArrayEntry x){
  entries.add(x);
  if (x.getRow() + 1 > numRows)
   numRows = x.getRow() + 1;
  if(x.getCol() + 1 > numCols)
   numCols = x.getCol() + 1;
 }

 public int getNumRows(){ return numRows; }
 public int getNumCols(){ return numCols; }

 public String toString(){
  String out = "";
  for (SparseArrayEntry x:entries){
   out += "row: " + x.getRow() + "\ncol: " + x.getCol() + "\nvalue: " + x.getValue() + "\n\n";
  }
  return out;
 }
}

class SparseArrayEntry{
 private int row, col, value;

 public SparseArrayEntry(int r, int c, int v){
  row = r;
  col = c;
  value = v;
 }

 public int getRow(){ return row; }
 public int getCol(){ return col; }
 public int getValue(){ return value; }
}

