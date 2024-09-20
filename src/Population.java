/* Programmer: Neil Ghugare
 Date: 2/28/19
 Project: Lab 2.5 Population
 File Name: Population.java
 Program Description: Uses a while loop to determine populations
*/


public class Population{
  public static void main(String[] args){

    // Enter your code here
    double mexicoPopulation = 97.6;
    double usPopulation = 268;
    int year = 1997;
    while (mexicoPopulation <= 120){
      mexicoPopulation = mexicoPopulation + (mexicoPopulation * 0.0189);
      year++;
    }
    System.out.println("Mexico's Population Would Be Over 120 Million In " + year);
    System.out.println("Mexico's Population = " + mexicoPopulation);
    mexicoPopulation = 97.6;
    year = 1997;
    while (!(mexicoPopulation > usPopulation * 0.5)){
      usPopulation = usPopulation + (usPopulation * 0.0089);
      mexicoPopulation = mexicoPopulation + (mexicoPopulation * 0.0189);
      year++;
    }
    System.out.println("Mexico's Population Would Exceed Half Of The US' Population in the year " + year);
    System.out.println("US Population = " + usPopulation);
    System.out.println("Mexico Population = " + mexicoPopulation);

  }
}