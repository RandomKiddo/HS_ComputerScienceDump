/*
 * Programmer:
 * Date:
 * Assignment:    Lab 3.7 - Phrase
 * File Name:     PhraseTester.Java
 * Description:   A wrapper program to test the methods in the Phrase class
 *
 */

public class PhraseTester{
  public static void main( String[] args ){

   Phrase phrase1 = new Phrase("A cat ate late.");
   phrase1.replaceNthOccurrence("at", 1, "rane");
   System.out.println(phrase1);

   phrase1 = new Phrase("A cat ate late.");
   phrase1.replaceNthOccurrence("at", 6, "xx");
   System.out.println(phrase1);

   phrase1 = new Phrase("A cat ate late.");
   phrase1.replaceNthOccurrence("bat", 2, "xx");
   System.out.println(phrase1);

   phrase1 = new Phrase("aaaa");
   phrase1.replaceNthOccurrence("aa", 1, "xx");
   System.out.println(phrase1);

   phrase1 = new Phrase("aaaa");
   phrase1.replaceNthOccurrence("aa", 2, "bbb");
   System.out.println(phrase1);

   phrase1 = new Phrase("A cat ate late.");
   System.out.println(phrase1.findLastOccurrence("at"));
   System.out.println(phrase1.findLastOccurrence("cat"));
   System.out.println(phrase1.findLastOccurrence("bat"));

  }
}

class Phrase{
 private String currentPhrase;

 public Phrase(String p){
  currentPhrase = p;
 }


 public void replaceNthOccurrence(String str, int n, String repl){
  // implement in part a
   int index = findNthOccurrence(str,n);
   String ans = "";
   if (index >= 0){
     String s1 = currentPhrase.substring(0,index);
     String s2 = currentPhrase.substring(index + str.length());
     currentPhrase = s1 + repl + s2;
   } else {
     currentPhrase = currentPhrase;
   }
 }

 public int findLastOccurrence(String str){
  // implement in part b
   int index = 0;
   int temp = 0;
   for (int cnt = 1; index >= 0; cnt++){
     index = findNthOccurrence(str,cnt);
     temp = cnt;
   }
   int ret = findNthOccurrence(str,temp-1);
   return ret;
 }


 public int findNthOccurrence(String str, int n){
  int ix = -1, cnt = 0;

  do{
   ix++;
   ix = currentPhrase.indexOf(str,ix);
   cnt++;
   if (cnt == n && ix != -1)
    return ix;
  } while(ix != -1 && ix < currentPhrase.length());

  return -1;
 }

 public String toString(){
  return currentPhrase;
 }
}