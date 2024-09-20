public class BasketballPlayer{
  //Fields
  private String name;
  private int points;
  private int games;
  //Constructors
  public BasketballPlayer(String a){
    name = a;
    points = 0;
    games = 0;
  }
  //Accessor Methods
  public String getName(){
    return name;
  }
  public int getTotalPoints(){
    return points;
  }
  public int getGamesPlayed(){
    return games;
  }
  //Mutator Methods
  public void addGame(int b){
    points += b;
    games += 1;
  }
  public double getAveragePointsPerGame(){
    return ((double)points/(double)games);
  }
}