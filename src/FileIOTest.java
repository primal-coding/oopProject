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

    lines.add(Integer.toString(managers.size())); // number of managers
    for (Manager manager : managers)
      lines.add(manager.toFile());
    lines.add(Integer.toString(players.size()));  // number of players
    for (Player player : players)
      lines.add(player.toFile());
    lines.add(Integer.toString(teams.size()));    // first string : amount of teams in league
    for (Team team : teams)
      lines.add(team.toFile());

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
    lines = new ArrayList<>();
    try{
      Path file = Paths.get("league.txt");
      Files.lines(file,StandardCharsets.UTF_8).forEach(lines::add);
    } catch (IOException e){
      e.printStackTrace();
      error = 1;
    }
    // readTest(); // checking that each object in lines is a 'line' and NOT a set of lines
    populate();
    return error;
  }
//  private void readTest(){
//    for (String s : lines)
//      System.out.println(s + "-");
//  }
  private void populate(){
    teams = new ArrayList<>();
    // ArrayList<Integer> nPlayers = new ArrayList<Integer>();   // number of players per team
    managers = new ArrayList<>();
    players = new ArrayList<>();
    int index = 0;

    // first: managers
    int nManager = Integer.parseInt(lines.get(index++)); // total number of managers
    for (int i = 0; i < nManager; i++){
      Manager manager = new Manager();
      Name name = new Name(lines.get(index++),lines.get(index++),lines.get(index++));
      manager.setName(name);
      manager.setEmail(lines.get(index++));
      manager.setPhone(lines.get(index++));
      manager.setDob(lines.get(index++));
      manager.setStarRating(Integer.parseInt(lines.get(index++)));
      lines.get(index++);     // empty line added during writing of file
      managers.add(manager);
    }

    // second: players
    int nPlayer = Integer.parseInt(lines.get(index++)); // total number of players
    for (int i = 0; i < nPlayer; i++){
      Player player = new Player();
      Name name = new Name(lines.get(index++),lines.get(index++),lines.get(index++));
      player.setName(name);
      player.setEmail(lines.get(index++));
      player.setPhone(lines.get(index++));
      player.setGoals(Integer.parseInt(lines.get(index++)));
      boolean b = Boolean.parseBoolean(lines.get(index++));
      if (b) player.setGoalie();
      lines.get(index++);     // empty line added during writing of file
      players.add(player);
    }

    // teams
    int nTeams = Integer.parseInt(lines.get(index++));
    for (int i = 0; i < nTeams; i++){
      Team team = new Team();
      String str = "";
      team.setName(lines.get(index++));
      team.setJerseyColor(lines.get(index++));
      str = lines.get(index++) + lines.get(index++) + lines.get(index++); // manager FN MN LastName
      team.addManager(findManager(str));

      nPlayer = Integer.parseInt(lines.get(index++));   // gets the number of players for this team
      // nPlayers.add(nPlayer);      // stores it in order to retrieve the players
      for (int j = 0; j < nPlayer; j++ ) {
        str = lines.get(index++) + lines.get(index++) + lines.get(index++); // player FN MN LastName
        team.addPlayer(findPlayer(str));
      }
      lines.get(index++);     // empty line added during writing of file
      teams.add(team);
    }
  }
  private Manager findManager(String str){
    Manager manager = new Manager();
    for (Manager m : managers){
      String s = m.getName().getFirstName() + "\n" + m.getName().getMiddleName() + "\n" + m.getName().getLastName() + "\n";
      if (str.equals(s)) manager = m;
    }
    return manager;
  }
  private Player findPlayer(String str){
    Player player = new Player();
    for (Player p : players){
      String s = p.getName().getFirstName() + "\n" + p.getName().getMiddleName() + "\n" + p.getName().getLastName() + "\n";
      if (str.equals(s)) player = p;
    }
    return player;
  }
  private int toInt(String str){
    int result = 0;
    String s = "";
    for (int i = 0; i < (str.length() - 1); i++){
      s += str.charAt(i);
    }
    result = Integer.parseInt(str.trim());
    return result;
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
