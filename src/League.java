import java.util.ArrayList;

public class League {

  private ArrayList<Team> teams;

  public void add(Team team){
    teams.add(team);
  }
  public void remove(Team team){
    teams.remove(team);
  }

}
