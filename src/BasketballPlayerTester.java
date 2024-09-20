public class BasketballPlayerTester{
  public static void main(String[] args){
    BasketballPlayer curry = new BasketballPlayer("Stephen Curry");
    curry.addGame(10);
    curry.addGame(7);
    curry.addGame(18);
    curry.addGame(12);
    curry.addGame(9);
    System.out.println("Name : " + curry.getName());
    System.out.println("Games Played : " + curry.getGamesPlayed());
    System.out.println("Total Points Scored : " + curry.getTotalPoints());
    System.out.println("Average Points Per Game : " + curry.getAveragePointsPerGame());
  }
}