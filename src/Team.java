import java.util.ArrayList;

public class Team {

  private String name = "";
  private String jerseyColor = "";
  private Manager manager = new Manager(new Name("No","Manager"));
  private ArrayList<Player> team = new ArrayList<Player>();   // necessary to prevent null pointer exception in addPlayer()


  public void addPlayer(Player player) {
    this.team.add(player);
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

  public Manager getManager() {
    return manager;
  }

  public void setJerseyColor(String color) {
    jerseyColor = color;
  }


  public String getJerseyColor() {
    return jerseyColor;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  public ArrayList<Player> getPlayers(){ return team; }

  public String toFile(){
    String result = "";
    result = name  + "\n" + jerseyColor + "\n" + manager.getName().getFirstName() + "\n"
            + manager.getName().getMiddleName() + "\n" + manager.getName().getLastName() + "\n";
    result += team.size() + "\n";
    for (Player p : team){
      result += p.getName().getFirstName() + "\n" + p.getName().getMiddleName() + "\n" + p.getName().getLastName() + "\n";
    }
    return result;
  }
}