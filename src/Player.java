import java.util.List;

public class Player extends Person {


  private int goals = 0;
  private boolean goalie = false;

  public Player(){}
  public Player(Name name){
    this.name = name;   // uses protected name instead of setFirst/Middle/LastName in Person Class
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

  public String toFile(){
    String result = "";
    result = name.getFirstName() + "\n" + name.getMiddleName() + "\n" + name.getLastName() + "\n";
    result += getEmail() + "\n" + getPhone() + "\n";
    result += goals  + "\n" + goalie + "\n";
    return result;
  }
}
