import java.util.ArrayList;

public class Team {

  private Manager manager = new Manager(new Name("No","Manager"));
  private ArrayList<Player> team;
  private String jerseyColor = "";

  public void addPlayer(Player player) {
    team.add(player);
  }

  public void removePlayer(Player player) {
    team.remove(player);
  }

  public void addManager(Manager manager) {
    this.manager = manager;
    this.manager.setTeam(this);
  }

  public void removeManager() {
    manager.setTeam(null);
    manager = null;
  }

  public void setJerseyColor(String color) {
    jerseyColor = color;
  }


  public String getJerseyColor() {
    return jerseyColor;
  }
}