import java.util.*;
import java.io.*;

public class Wordscapes{
  public static void main(String[] args) throws IOException{
    Scanner keyboard = new Scanner(System.in);
    String fileName;


    // Open input file:

    if (args.length > 0)
      fileName = args[0];
    else
    {
      fileName = "dictionary.txt";
    }



    File inputFile = new File(fileName);
    Scanner in = new Scanner(inputFile);


    ArrayList<String> words = new ArrayList<String>(300000);
 // Create a list of String objects and add a trimed version of each word to the list
    while(in.hasNext()){
       String word = in.next(); //will hold each element in the dictionary file one at a time
       words.add(word);



    }

 // ask the user for the letters in their puzzle. have them enter all the letters as a single String
    System.out.println("Enter Letters In Their Puzzle : ");
    String letters = keyboard.next(); 


 // make a new Permutation object and call the permute method to find all possible permutations of the input letters
    Permutation perm = new Permutation(letters);
    perm.permute(letters, 0, letters.length()-1);

 // Create a list containing all permutations of at least 3 letters that are in the dictionary.txt file
    ArrayList<String> permutations = Permutation.getPermutations(letters);
    ArrayList<String> unique = new ArrayList<String>(100);
    String tempWord = "";
    for (int a = 3; a <= letters.length(); a++){
      for (int b = 0; b < permutations.size(); b++){
        tempWord = permutations.get(b).substring(0,a);
        if (unique.contains(tempWord) == false && words.contains(tempWord) == true){
          unique.add(tempWord);
        }
      }
    }

 // print the list of words and the number of words found
    for (String val : unique){
      System.out.println(val);
    }
    System.out.println("Number Of Words : " + unique.size());


  in.close();
  keyboard.close();
  }
}


class Permutation{
 // This code is adapted by Mihir Joshi
 private static ArrayList<String> list = new ArrayList<String>();


 public Permutation(String w){
  int n = 1;
  for (int i = 1; i <= w.length(); i++)
   n *= i;

  list = new ArrayList<String>(n);
 }

 public static ArrayList<String> getPermutations( String w ) {
  return list;
 }

 /**
 * permutation function
 * @param str string to calculate permutation for
 * @param l starting index
 * @param r end index
 */
 public void permute(String str, int l, int r)
 {
  if (l == r){
   //System.out.println(str);
   list.add(str);
  }
  else
  {
   for (int i = l; i <= r; i++)
   {
    str = swap(str,l,i);
    permute(str, l+1, r);
    str = swap(str,l,i);
   }
  }
 }

 /**
 * Swap Characters at position
 * @param a string value
 * @param i position 1
 * @param j position 2
 * @return swapped string
 */
 public String swap(String a, int i, int j)
 {
  char temp;
  char[] charArray = a.toCharArray();
  temp = charArray[i] ;
  charArray[i] = charArray[j];
  charArray[j] = temp;
  return String.valueOf(charArray);
 }

}






