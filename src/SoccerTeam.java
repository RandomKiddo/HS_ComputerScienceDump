public class SoccerTeam{
  //Fields
  private int wins;
  private int losses;
  private int ties;
  private static int games;
  private static int goals;
  //Constructor
  public SoccerTeam(){
    wins = 0;
    losses = 0;
    ties = 0;
  }
  //Methods
  public void played(SoccerTeam other, int myScore, int otherScore){
    if (myScore > otherScore){
      this.wins++;
      other.losses++;
    } else if (myScore < otherScore){
      this.losses++;
      other.wins++;
    } else {
      this.ties++;
      other.ties++;
    }
    goals += myScore + otherScore;
    games++;
  }
  public int getPoints(){
    int total = (3 * this.wins) + this.ties;
    return total;
  }
  public int getWins(){
    return wins;
  }
  public int getTies(){
    return ties;
  }
  public int getLosses(){
    return losses;
  }
  public void reset(){
    this.wins = 0;
    this.ties = 0;
    this.losses = 0;
  }
  public static int getTotalGames(){
    return games;
  }
  public static int getTotalGoals(){
    return goals;
  }
  public static void startTournament(){
    games = 0;
    goals = 0;
  }
}