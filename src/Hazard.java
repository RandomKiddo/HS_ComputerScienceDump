/* Programmer:
   Date:
   Project: Hazard
   File Name: Hazard.java
   Program Description:  This program will simulate the dice game hazard.
*/


public class Hazard {
 public static void main(String [] args) {

  // user options
  // main value - select a value between 5 and 9, inclusive
  int mainValue = 9;
  // number of times to play game
  int n = 1000000;
  // set to true if you want to print the results for each run
  boolean printRuns = false;


  int nwins = 0;


  for (int i = 0; i < n; i++){

   // recieve initial roll value
   int roll = Die.rollDie() + Die.rollDie(); // the sum of a random roll of two dice
   int result = 0; // set result to 1 if the user wins and -1 if they lose

   //enter the rules for the game hazard here:
   
   //use this part to determine if the user wins/loses on their first roll
   //based on the rules outlined in steps a - d in the lab report
   if (roll == mainValue){
     result = 1;
   } else if (roll == 2 || roll == 3){
     result = -1;
   } else if (roll == 11){
     if (mainValue == 7){
       result = 1;
     } else {
       result = -1;
     }
   } else if (roll == 12){
     if (mainValue == 6 || mainValue == 8){
       result = 1;
     } else {
       result = -1;
     }
   } else {
     result = 0;
   }
   
   if (printRuns)
    System.out.print("Main value = " + mainValue);


   //use this part to determine if the user wins/loses after their first roll
   if (result == 0){
    int chance = roll; // holds the value of the user's initial role
    if (printRuns)
     System.out.print(" Chance = " + chance);
    while (result == 0){
     roll = Die.rollDie() + Die.rollDie(); // the sum of a random roll of two dice
     // enter the remaining rules of hazard outlined in step e of the lab report here
     if (roll == chance){
       result = 1;
     } else if (roll == mainValue) {
       result = -1;
     }

    }

   }

   if (printRuns)
    System.out.println(" Roll = " + roll + " Result = " + result);

   if (result == 1)
    nwins++;

  }
  System.out.println("Main Value = " + mainValue + " You won " + nwins + " times out of " + n + " times.");
 }
}

class Die {
 public static int rollDie( ){ return (int)(6*Math.random()+1); }
}