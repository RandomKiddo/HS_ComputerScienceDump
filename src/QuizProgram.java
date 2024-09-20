/* Programmer:
 Date:
 Project: Lab 4.2 QuizProgram
 File Name: StateQuiz.java
 Program Description: Quizzes the user on states
*/

import java.util.*;

public class QuizProgram{


  public static void main( String[] args ){

 // Copy and paste the line below where needed
   Scanner keyboard = new Scanner( System.in );
   String [] questions = new String[10];
   String [] answers = new String[10];
   boolean [] asked = new boolean[10];
   questions[0] = "What is the state bird of Ohio?";
   questions[1] = "What is the state bird of New Jersey?";
   questions[2] = "What is the state bird of New York?";
   questions[3] = "What is the state bird of California?";
   questions[4] = "What is the state bird of Nevada?";
   questions[5] = "What is the state bird of Pennsylvania?";
   questions[6] = "What is the state bird of Idaho?";
   questions[7] = "What is the state bird of Florida?";
   questions[8] = "What is the state bird of Hawaii?";
   questions[9] = "What is the state bird of Alaska?";
   answers[0] = "Northern Cardinal";
   answers[1] = "Eastern Goldfinch";
   answers[2] = "Eastern Bluebird";
   answers[3] = "California Quail";
   answers[4] = "Mountain Bluebird";
   answers[5] = "Ruffed Goose";
   answers[6] = "Mountain Bluebird";
   answers[7] = "Mockingbird";
   answers[8] = "Nene";
   answers[9] = "Willow Ptarmigan";
   asked[0] = false;
   asked[1] = false;
   asked[2] = false;
   asked[3] = false;
   asked[4] = false;
   asked[5] = false;
   asked[6] = false;
   asked[7] = false;
   asked[8] = false;
   asked[9] = false;
   int counter = 0;
   int correct = 0, incorrect = 0;
   String input;
   int random;
   String find;
   do{
     do {
     random = (int)(Math.random() * 10);
     find = questions[random];
       } while (!(asked[random] == false));
       System.out.println(find);
       input = keyboard.nextLine();
       if (input.equalsIgnoreCase(answers[random])){
         System.out.println("Correct");
         correct += 1;
         asked[random] = true;
       } else {
         System.out.println("Incorrect");
         System.out.println("The Correct Answer Was : " + answers[random]);
         incorrect += 1;
         asked[random] = true;
       }
       counter++;
   } while (!(counter == 10));
   double percentCorrect, percentIncorrect;
   percentCorrect = (correct / 10.0) * 100.0;
   percentIncorrect = (incorrect / 10.0) * 100.0;
   System.out.println("\nYou Got " + percentCorrect + "% Correct and " + percentIncorrect + "% Incorrect");
   if (percentCorrect == 0.0){
     System.out.println("You really need some work on your state birds... ");
   } else if (percentCorrect == 10.0 || percentCorrect == 20.0){
     System.out.println("Uh... You're getting there?... ");
   } else if (percentCorrect == 30.0 || percentCorrect == 40.0){
     System.out.println("You probably guessed most of these... ");
   } else if (percentCorrect == 50.0){
     System.out.println("OH! YOU'RE HALFWAY THERE!");
   } else if (percentCorrect == 60.0){
     System.out.println("Passing! That's good enough for you!");
   } else if (percentCorrect == 70.0 || percentCorrect == 80.0){
     System.out.println("Average!");
   } else if (percentCorrect == 90.0){
     System.out.println("Ah, so close to 100%... ");
   } else {
     System.out.println("Don't lie to me, you looked it up.");
   }
   


   }


}