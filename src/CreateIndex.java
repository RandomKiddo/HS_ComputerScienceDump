import java.util.*;
import java.io.*;

public class CreateIndex{
  public static void main(String[] args) throws IOException{
    Scanner keyboard = new Scanner(System.in);
    String fileName;


    // Open input file:

    if (args.length > 0)
      fileName = args[0];
    else
    {
      fileName = "dream.txt";
    }


    File inputFile = new File(fileName);
    Scanner in = new Scanner(inputFile);

    // Create output file:
    if (args.length > 1)
      fileName = args[1];
    else{
      fileName = "index.txt";
    }

    PrintWriter outputFile =
                 new PrintWriter(new FileWriter(fileName));


    String word;
    ArrayList<Index> words = new ArrayList<Index>(100000);
    while(in.hasNext()){//inputFile.hasNext( )){
       word = in.next();//inputFile.next();
  // Start your code here
       word = word.trim();
       word = word.toLowerCase();/*
       if (word.length() == 0){
         continue;
       }
       */
       for (int a = word.length()/2; a < word.length(); a++){
         if (Character.isLetter(word.charAt(a)) == false){
           word = word.substring(0,a) + word.substring(a+1);
         }
       }
       if (word.length() == 0){
         continue;
       }
      // Index forIn = new Index(word);
       if (words.size() == 0){
         words.add(new Index(word));
       } else {
         boolean inWords = false;
         int index = -1;
         for (int a = 0; a < words.size(); a++){
           if ((words.get(a).getWord()).equalsIgnoreCase(word)){
             inWords = true;
             index = a;
             break;
           }
         }
         if (inWords == true){
           words.get(index).increaseAmount();
         } else {
           int cnt = -1;
            for (int a = 0; a < words.size(); a++){
             if(word.compareTo(words.get(a).getWord()) < 0){
               cnt = a;
               break;
             }
           }
            if (cnt == -1){
              cnt = words.size();
              words.add(cnt, new Index(word));
            } else {
              words.add(cnt, new Index(word));
            }
         }
       }
       }
    Index mostCommon = words.get(0);
    for (int a = 0; a < words.size(); a++){
      if (mostCommon.getAmount() < words.get(a).getAmount()){
        mostCommon = words.get(a);
      }
    }
    System.out.println("Number Of Words : " + words.size());
    System.out.println("Most Common Word : " + mostCommon.getWord());
    System.out.println("Word Appears " + mostCommon.getAmount() + " Times");
    // pass in a String to the method call below to add a line to your index.txt file
    for (int a = 0; a < words.size(); a++){
      outputFile.println(words.get(a).getWord() + " " +  words.get(a).getAmount());
    }




 // close the output file
   outputFile.close();

  }
}
class Index{
  private String word;
  private int times;
  public Index(String w){
    word = w;
    times = 1;
  }
  public String getWord(){ return word; }
  public int getAmount(){ return times; }
  public void increaseAmount(){ times++; }
}
