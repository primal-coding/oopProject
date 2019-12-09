public class Player extends Person {


  private int goals = 0;
  private boolean goalie = false;

  public Player(){}
  public Player(Name name){
    this.name = name;
  }

  public int getGoals() {
    return goals;
  }

  public void setGoals(int goals) {
    this.goals = goals;
  }

  public boolean isGoalie() {
    return goalie;
  }
}
