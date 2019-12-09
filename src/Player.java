public class Player extends Person {


  private int goals;
  private boolean goalie = false;


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
