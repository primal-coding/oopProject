import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOTest {

  private ArrayList<Team> teams;
  private ArrayList<Player> players;
  private ArrayList<Manager> managers;
  private ArrayList<String> lines = new ArrayList<>();

  public int saveLeague(ArrayList<Team> t, ArrayList<Player> p, ArrayList<Manager> m){
    int error = 0;
    teams = t;
    players = p;
    managers = m;

    lines.add(Integer.toString(teams.size()));    // first string : amount of teams in league
    for (Team team : teams)
      lines.add(team.toFile());
    lines.add(Integer.toString(managers.size())); // number of managers
    for (Manager manager : managers)
      lines.add(manager.toFile());
    lines.add(Integer.toString(players.size()));  // number of players
    for (Player player : players)
      lines.add(player.toFile());

    error = writeLeague();
    return error;
  }
  private int writeLeague(){
    int error = 0;

    try{
      Path file = Paths.get("league.txt");
      Files.write(file,lines, StandardCharsets.UTF_8);
    } catch (IOException e){
      e.printStackTrace();
      error = 1;
    }
    return error;
  }

  public int readLeague(){
    int error = 0;

    return error;
  }

  public ArrayList<Team> readTeams(){
    return teams;
  }
  public ArrayList<Player> readPlayers(){
    return players;
  }
  public ArrayList<Manager> readManagers(){
    return managers;
  }


}
