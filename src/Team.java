import java.util.ArrayList;

public class Team {

  private Manager manager;
  private ArrayList<Player> team;
  private String jerseyColor;

  public void addPlayer(Player player){
   team.add(player);
  }
  public void removePlayer(Player player){
    team.remove(player);
  }

  public void addManager(Manager manager){
    this.manager = manager;
  }
  public void removeManager(){
    manager = null;
  }

  public void setJerseyColor(String color){
    jerseyColor = color;
  }

}
