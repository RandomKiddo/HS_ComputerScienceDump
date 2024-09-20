/* Programmer: Neil Ghugare
   Date: 1/28/19
   Project: CalculatePoints
   File Name: CalculatePoints.java
*/

import java.util.*;

public class CalculatePoints{

  public static void main(String[] args){

    // start your code here

Scanner keyboard = new Scanner(System.in);
int twoPoints, threePoints, freeThrows;
System.out.print("Enter The Number Of 2-Point Field Goals You Made: ");
twoPoints = keyboard.nextInt();
twoPoints = twoPoints * 2;
System.out.print("Enter The Number Of 3-Point Field Goals You Made: ");
threePoints = keyboard.nextInt();
threePoints = threePoints * 3;
System.out.print("Enter The Number Of Free Throws You Made: ");
freeThrows = keyboard.nextInt();
int totalPoints;
totalPoints = twoPoints + threePoints + freeThrows;
System.out.println("Total Points = " + totalPoints);
double averagePPM;
averagePPM = totalPoints / 32.0;
System.out.println("Average Points Per Minute = " + averagePPM);
double predictedPoints;
predictedPoints = averagePPM * 25.0 * 22.0;
System.out.println("Predicted Points For Season = " + (int) predictedPoints);




    }

}
