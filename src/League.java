import java.util.ArrayList;

public class League {

  private ArrayList<Team> teams = new ArrayList<Team>();    // necessary to prevent null pointer exception in add()

  public void add(Team team){
    teams.add(team);
  }
  public void remove(Team team){
    teams.remove(team);
  }

  public ArrayList<Team> getTeams(){
    return teams;
  }

}
