public class Player extends Person {


  private int goals = 0;
  private boolean goalie = false;

  public Player(){}
  public Player(Name name){
    this.name = name;   // uses protected name instead of setFirst/Middle/LastName
  }

  public int getGoals() {
    return goals;
  }

  public void setGoals(int goals) {
    this.goals = goals;
  }

  public void addGoal(){ goals++; }

  public void setGoalie(){goalie = true;}

  public boolean isGoalie() {
    return goalie;
  }
}
