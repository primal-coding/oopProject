import java.util.ArrayList;
import java.util.Scanner;

public class MainTest {

  private League league = new League();
  private Team team1 = new Team();
  private Team team2 = new Team();
  private Team team3 = new Team();
  private Team team4 = new Team();
  private Team team5 = new Team();
  private Manager manager1 = new Manager();
  private Manager manager2 = new Manager();
  private Manager manager3 = new Manager();
  private Manager manager4 = new Manager();
  private Manager manager5 = new Manager();
  private Player player11 = new Player(new Name("Jerome","Lenfant"));
  private Player player12 = new Player(new Name("Michel","Platini"));
  private Player player13 = new Player(new Name("Alain","Giresse"));
  private Player player14 = new Player(new Name("Zinedine","Zidane"));
  private Player player15 = new Player(new Name("Lionel","Messi"));
  private Player player21 = new Player(new Name("Christiano","Ronaldo"));
  private Player player22 = new Player(new Name("Jean-Pierre","Petit"));
  private Player player23 = new Player(new Name("Fabien","Bartez"));
  private Player player24 = new Player(new Name("Zlatan","Ibrahimovic"));
  private Player player25 = new Player(new Name("Luis","Suarez"));
  private Player player31 = new Player(new Name("Thierry","Henri"));
  private Player player32 = new Player(new Name("Eric","Cantona"));
  private Player player33 = new Player(new Name("Wayne","Rooney"));
  private Player player34 = new Player(new Name("Diego","Maradona"));
  private Player player35 = new Player(new Name("Didier","Drogba"));
  private Player player41 = new Player(new Name("Dominique","Batiston"));
  private Player player42 = new Player(new Name("Jean","Tiguana"));
  private Player player43 = new Player(new Name("Eric","Lefebvre"));
  private Player player44 = new Player(new Name("Jean","Neymour"));
  private Player player45 = new Player(new Name("Simon","Pele"));
  private Player player51 = new Player(new Name("Frederic","Bats"));
  private Player player52 = new Player(new Name("Daniel","Sixt"));
  private Player player53 = new Player(new Name("Emmanuel","Petit"));
  private Player player54 = new Player(new Name("Marcel","Dessailly"));
  private Player player55 = new Player(new Name("Paul","Pogba"));
  private ArrayList<Player> players = new ArrayList<Player>();
  private ArrayList<Manager> managers = new ArrayList<Manager>();
  private FileIOTest fileIOTest = new FileIOTest();

  // In The Beginning:
  private void start(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Please select Test Part_1 or Part_2:");
    int choice = scan.nextInt();
    if (choice == 1) part1();
    else part2();
  }

  // TEST Part_1
  private void part1(){
    Scanner scan = new Scanner(System.in);
    int choice;
    createLeague();
    System.out.println("Premier League:");
    System.out.println("Team 1: " + team1.getName() + " / Jersey: " + team1.getJerseyColor() + " / Manager: "
            + team1.getManager().getName().getFirstName() + " "+ team1.getManager().getName().getFirstName() + " "+ team1.getManager().getName().getFirstName() + " ");
    System.out.println("Players:");
    for (Player player : team1.getPlayers() ){
      System.out.println(player.getName().getFirstName() + " " + player.getName().getMiddleName() + " " + player.getName().getLastName() + " "
              + " is a Goalie: " + player.isGoalie() + " / Goals: " + player.getGoals());
    }
    System.out.println("");

    System.out.println("Team 2: " + team2.getName() + " / Jersey: " + team2.getJerseyColor() + " / Manager: "
            + team2.getManager().getName().getFirstName() + " " + team2.getManager().getName().getMiddleName() + " " + team2.getManager().getName().getLastName() + " ");
    System.out.println("Players:");
    for (Player player : team2.getPlayers() ){
      System.out.println(player.getName().getFirstName() + " " + player.getName().getMiddleName() + " " + player.getName().getLastName() + " "
              + " is a Goalie: " + player.isGoalie() + " / Goals: " + player.getGoals());
    }
    System.out.println("");
    System.out.println("Team 3: " + team3.getName() + " / Jersey: " + team3.getJerseyColor() + " / Manager: "
            + team3.getManager().getName().getFirstName() + " " + team3.getManager().getName().getMiddleName() + " " + team3.getManager().getName().getLastName() + " ");
    System.out.println("Players:");
    for (Player player : team3.getPlayers() ){
      System.out.println(player.getName().getFirstName() + " " + player.getName().getMiddleName() + " " + player.getName().getLastName() + " "
              + " is a Goalie: " + player.isGoalie() + " / Goals: " + player.getGoals());
    }
    System.out.println("");
    System.out.println("Team 4: " + team1.getName() + " / Jersey: " + team4.getJerseyColor() + " / Manager: "
            + team4.getManager().getName().getFirstName() + " "+ team4.getManager().getName().getMiddleName() + " "+ team4.getManager().getName().getLastName() + " ");
    System.out.println("Players:");
    for (Player player : team4.getPlayers() ){
      System.out.println(player.getName().getFirstName() + " " + player.getName().getMiddleName() + " " + player.getName().getLastName() + " "
              + " is a Goalie: " + player.isGoalie() + " / Goals: " + player.getGoals());
    }
    System.out.println("");
    System.out.println("Team 5: " + team5.getName() + " / Jersey: " + team5.getJerseyColor()
            + " / Manager: " + team5.getManager().getName().getFirstName() + " " + team5.getManager().getName().getMiddleName() + " " + team5.getManager().getName().getLastName() + " ");
    System.out.println("Players:");
    for (Player player : team5.getPlayers() ){
      System.out.println(player.getName().getFirstName() + " " + player.getName().getMiddleName() + " " + player.getName().getLastName() + " "
              + " is a Goalie: " + player.isGoalie() + " / Goals: " + player.getGoals());
    }
    System.out.println("");

    System.out.println("Select a manager to see its Team:");
    System.out.println("1. " + manager1.getName().getFirstName() + " " + manager1.getName().getMiddleName() + " " + manager1.getName().getLastName() + " ");
    System.out.println("2. " + manager2.getName().getFirstName() + " " + manager2.getName().getMiddleName() + " " + manager2.getName().getLastName() + " ");
    System.out.println("3. " + manager3.getName().getFirstName() + " " + manager3.getName().getMiddleName() + " " + manager3.getName().getLastName() + " ");
    System.out.println("4. " + manager4.getName().getFirstName() + " " + manager4.getName().getMiddleName() + " " + manager4.getName().getLastName() + " ");
    System.out.println("5. " + manager5.getName().getFirstName() + " " + manager5.getName().getMiddleName() + " " + manager5.getName().getLastName() + " ");
    System.out.println("");

    choice = scan.nextInt();

    switch (choice){
      case 1:
        System.out.println("The team managed by "+ manager1.getName().getFirstName() + " " + manager1.getName().getMiddleName() + " " + manager1.getName().getLastName()
                + " is: " + manager1.getTeam().getName());
        break;
      case 2:
        System.out.println("The team managed by "+ manager2.getName().getFirstName() + " " + manager2.getName().getMiddleName() + " " + manager2.getName().getLastName()
                + " is: " + manager2.getTeam().getName());
        break;
      case 3:
        System.out.println("The team managed by " + manager3.getName().getFirstName() + " " + manager3.getName().getMiddleName() + " " + manager3.getName().getLastName()
                + " is: " + manager3.getTeam().getName());
        break;
      case 4:
        System.out.println("The team managed by " + manager4.getName().getFirstName() + " " + manager4.getName().getMiddleName() + " " + manager4.getName().getLastName()
                + " is: " + manager4.getTeam().getName());
        break;
      case 5:
        System.out.println("The team managed by " + manager5.getName().getFirstName() + " " + manager5.getName().getMiddleName() + " " + manager5.getName().getLastName()
                + " is: " + manager5.getTeam().getName());
        break;
      default:
        break;
    }
  }

  private void createLeague(){
    createTeams();
    league.add(team1);
    league.add(team2);
    league.add(team3);
    league.add(team4);
    league.add(team5);
  }

  private void createTeams(){
    team1.setJerseyColor("Black");
    team2.setJerseyColor("Blue");
    team3.setJerseyColor("Red");
    team4.setJerseyColor("Yellow");
    team5.setJerseyColor("Green");
    team1.setName("Dingle");
    team2.setName("Charleville");
    team3.setName("Cork");
    team4.setName("Athlone");
    team5.setName("Portlaois");
    createManagers();
    team1.addManager(manager1);
    team2.addManager(manager2);
    team3.addManager(manager3);
    team4.addManager(manager4);
    team5.addManager(manager5);
    addPlayers();
  }

  private void createManagers(){
    manager1.setName(new Name("Pep","Guardiola"));
    manager2.setName(new Name("Arsene","Wenger"));
    manager3.setName(new Name("Alex","Ferguson"));
    manager4.setName(new Name("Jurgen","Kopp"));
    manager5.setName(new Name("Martin","O'","Neill"));
    manager5.setDob("01/02/83");
    manager5.setStarRating(5);
    manager5.setEmail("martin.o.neil@fai.ie");
    manager5.setPhone("089-12345678");
    // used in part 2 only :
    managers.add(manager1); managers.add(manager2); managers.add(manager3); managers.add(manager4); managers.add(manager5);
  }

  private void addPlayers(){

    team1.addPlayer(player11); team1.addPlayer(player12); team1.addPlayer(player13); team1.addPlayer(player14); team1.addPlayer(player15);
    team2.addPlayer(player21); team2.addPlayer(player22); team2.addPlayer(player23); team2.addPlayer(player24); team2.addPlayer(player25);
    team3.addPlayer(player31); team3.addPlayer(player32); team3.addPlayer(player33); team3.addPlayer(player34); team3.addPlayer(player35);
    team4.addPlayer(player41); team4.addPlayer(player42); team4.addPlayer(player43); team4.addPlayer(player44); team4.addPlayer(player45);
    team5.addPlayer(player51); team5.addPlayer(player52); team5.addPlayer(player53); team5.addPlayer(player54); team5.addPlayer(player55);

    player12.setGoals(5); player23.setGoals(3); player34.setGoals(7); player45.setGoals(2); player51.setGoals(1);

    player11.setGoalie(); player11.setGoals(15);
    player22.setGoalie(); player22.setGoals(11);
    player33.setGoalie(); player33.setGoals(12);
    player44.setGoalie(); player44.setGoals(17);
    player55.setGoalie(); player55.setGoals(1);
    // used in part 2 only:
    players.add(player11); players.add(player12); players.add(player13); players.add(player14); players.add(player15);
    players.add(player21); players.add(player22); players.add(player23); players.add(player24); players.add(player25);
    players.add(player31); players.add(player32); players.add(player33); players.add(player34); players.add(player35);
    players.add(player41); players.add(player42); players.add(player43); players.add(player44); players.add(player45);
    players.add(player51); players.add(player52); players.add(player53); players.add(player54); players.add(player55);
  }


  // TEST Part_2
  private void part2(){
    boolean loop = true;
    createLeague();
    Scanner scan = new Scanner(System.in);
    int choice = 0;

    while (loop){
      menu();
      choice = scan.nextInt();
      switch(choice){
        case 1:
          menu1();
          break;
        case 2:
          menu2();
          break;
        case 3:
          menu3();
          break;
        case 4:
          menu4();
          break;
        case 5:
          menu5();
          break;
        case 6:
          menu6();
          break;
        case 7:
          menu7();
          break;
        case 8:
          loop = false;
          break;
        default:
          break;
      }
    }

  }

  // 1. Create a new Team, Player or Manager and add Player/Manager to a Team.
  private void menu1(){
    Scanner scan = new Scanner(System.in);
    int choice = 0;
    System.out.println("Create a new 1.Team, 2.Player or 3.Manager");
    System.out.println("4. Add Player/Manager to a Team");
    choice = scan.nextInt();
    switch(choice){
      case 1:
        menu11();
        break;
      case 2:
        menu12();
        break;
      case 3:
        menu13();
        break;
      case 4:
        menu14();
        break;
      default:
        break;
    }
  }
  private void menu11(){    // Create new Team
    Scanner scan = new Scanner(System.in);
    String str = "";
    Team team = new Team();
    System.out.println("Name of the Team:");
    str = scan.nextLine();
    team.setName(str);
    System.out.println("Color of the Jersey:");
    str = scan.nextLine();
    team.setJerseyColor(str);

    System.out.println();
  }
  private void menu12(){    // Create new Player
    Scanner scan = new Scanner(System.in);
    String str, strF, strM, strL;
    char c;
    int goals;
    Player player = new Player();
    System.out.println("First name of the Player:");
    strF = scan.nextLine();
    System.out.println("Middle name:");
    strM = scan.nextLine();
    System.out.println("Last name:");
    strL = scan.nextLine();
    player.setName(new Name(strF,strM,strL));

    System.out.println("Did he score any goal? (Y/N)");
    str = scan.nextLine();
    c = str.charAt(0);
    if (c == 'y' || c == 'Y'){
      System.out.println("How many goals?");
      goals = scan.nextInt();
      player.setGoals(goals);
    }
    System.out.println("Is he a Goalie (Y/N)");
    str = scan.nextLine();
    c = str.charAt(0);
    if (c == 'y' || c == 'Y') {
      player.setGoalie();
      System.out.println("How many goals did he take?");
      goals = scan.nextInt();
      player.setGoals(goals);
    }

    players.add(player);
    System.out.println();
  }
  private void menu13(){    // Create new Manager
    Scanner scan = new Scanner(System.in);
    String str, strF, strM, strL;
    int starRating;
    Manager manager = new Manager();
    System.out.println("First name of the Player:");
    strF = scan.nextLine();
    System.out.println("Middle name:");
    strM = scan.nextLine();
    System.out.println("Last name:");
    strL = scan.nextLine();
    manager.setName(new Name(strF,strM,strL));
    System.out.println("What is his date of birth?");
    str = scan.nextLine();
    manager.setDob(str);
    System.out.println("What is his email?");
    str = scan.nextLine();
    manager.setEmail(str);
    System.out.println("What is his Phone number");
    str = scan.nextLine();
    manager.setPhone(str);

    managers.add(manager);
    System.out.println();
  }
  private void menu14(){    // Add Player/Manager in Team
    Scanner scan = new Scanner(System.in);
    int choice = 0, i = 1;
    Team team = new Team();

    System.out.println("To which Team do you want to add a player or a manager?");
    for (Team t : league.getTeams()){
      System.out.println(i + ". " + t.getName());
      i++;
    }
    choice = scan.nextInt();
    if (choice > 0 && choice < i) team = league.getTeams().get(choice);
    else return;

    System.out.println("Do you want to add a 1.Player or a 2.Manager?");
    choice = scan.nextInt();
    if (choice == 2){   // manager selected
      System.out.println("Which Manager do you want to add?");
      i = 1;
      for (Manager m : managers){
        System.out.println(i + ". " + m.getName().getFirstName() + " " + m.getName().getMiddleName() + " " + m.getName().getLastName());
        i++;
      }
      choice = scan.nextInt();
      if (choice > 0 && choice < i) team.addManager(managers.get(choice));
      else return;
    }
    else {
      if (choice == 1){   // player selected
        System.out.println("Which Player do you want to add?");
        i = 1;
        for (Player p : players){
          System.out.println(i + ". " + p.getName().getFirstName() + " " + p.getName().getMiddleName() + " " + p.getName().getLastName());
          i++;
        }
        choice = scan.nextInt();
        if (choice > 0 && choice < i) team.addPlayer(players.get(choice));
        else return;
      }
      else return;
    }

    System.out.println();
  }

  // 2. Remove a Player.
  private void menu2(){
    Scanner scan = new Scanner(System.in);
    String str;
    Team team = new Team();
    Player player = new Player();
    int i = 1, choice = 0;

    System.out.println("From which Team do you want to remove a Player?");
    for (Team t : league.getTeams()){
      System.out.println( i + ". " + t.getName());
      i++;
    }
    choice = scan.nextInt();
    if (choice > 0 && choice < i){
      team = league.getTeams().get(choice);
    }
    else return;

    System.out.println("Which Player do you want to remove?");
    i = 1;
    for (Player p : team.getPlayers()){
      System.out.println( i + ". " + p.getName().getFirstName() + " " + p.getName().getMiddleName() + " " + p.getName().getLastName());
      i++;
    }
    choice = scan.nextInt();
    if (choice > 0 && choice < i){
      player = team.getPlayers().get(choice);
    }
    team.removePlayer(player);
    System.out.println("Player removed.");

    System.out.println();
  }
  // 3. Search for a Player by supplying the Player name. Display goals and Manager details.
  private void menu3(){
    Scanner scan = new Scanner(System.in);
    String strF, strM, strL;
    Player player = new Player();
    Manager manager = new Manager();
    System.out.println("What is the Player First Name:");
    strF = scan.nextLine();
    System.out.println("What is " + strF + " Middle Name:");
    strM = scan.nextLine();
    System.out.println("What is " + strF + " Last Name:");
    strL = scan.nextLine();

    for (Player p : players){
      if (p.getName().getFirstName() == strF && p.getName().getMiddleName() == strM
        && p.getName().getLastName() == strL) player = p;
    }
    System.out.println(strF + " has " + player.getGoals() + " goal(s).");
    for (Team t : league.getTeams()){
      for (Player p : t.getPlayers()){
        if (p.equals(player)){
          manager = t.getManager();
        }
      }
    }
    if (manager != null){
      System.out.print(strF + "'s Manager is " + manager.getName().getFirstName() + " " + manager.getName().getMiddleName()
              + " " + manager.getName().getLastName());
      System.out.println(", who was born the " + manager.getDob() + ", and has a star rating of " + manager.getStarRating() + ".");
    }
    else System.out.println(strF + " has " + "no manager.");
// TODO // TODO // TODO // TODO // TODO
    System.out.println();
  }
  // 4. Display all Players in a particular Team.
  private void menu4(){
    Scanner scan = new Scanner(System.in);
    Team team;
    int i = 1;
    int choice = 0;
    System.out.println("Select a Team:");
    for (Team t : league.getTeams()){
      System.out.println(i + ". " + t.getName());
      i++;
    }
    choice = scan.nextInt();
    team = league.getTeams().get(choice - 1);

    System.out.println("List of Players of " + team.getName() + ":");
    for (Player player : team.getPlayers() ){
      System.out.println(player.getName().getFirstName() + " " + player.getName().getMiddleName() + " " + player.getName().getLastName() + " "
              + " is a Goalie: " + player.isGoalie() + " / Goals: " + player.getGoals());
    }

    System.out.println();
  }
  // 5. Display all Teams in the League.
  private void menu5(){
    System.out.println("Teams of the League:");
    for (Team team : league.getTeams()){
      System.out.println("Team: " + team.getName() + " / Jersey: " + team.getJerseyColor() + " / Manager: "
              + team.getManager().getName().getFirstName() + " "+ team.getManager().getName().getFirstName() + " "+ team.getManager().getName().getFirstName() + " ");
    }

    System.out.println();
  }
  // 6. Save information to text file.
  private void menu6(){
    if (fileIOTest.saveLeague(league.getTeams(),players,managers) == 0)
      System.out.println("All League information saved.");
    else
      System.out.println("Error while saving. Please try again.");
    System.out.println();
  }
  // 7. Load information from text file.
  private void menu7(){
    ArrayList<Team> teams;
    if (fileIOTest.readLeague() == 0) {
      managers = fileIOTest.readManagers();
      players = fileIOTest.readPlayers();
      teams = fileIOTest.readTeams();
    }
    else {
      System.out.println("Error while trying to read the file. Please try again.");
      return;
    }
    league = new League();
    for (Team t : teams)
      league.add(t);
    System.out.println("All information loaded.\n");
  }

  private void menu(){
    System.out.println("1. Create a new Team, Player or Manager and add Player/Manager to a Team.");
    System.out.println("2. Remove a Player.");
    System.out.println("3. Search for a Player by supplying the Player name. Display goals and Manager details.");
    System.out.println("4. Display all Players in a particular Team.");
    System.out.println("5. Display all Teams in the League.");
    System.out.println("6. Save information to text file.");
    System.out.println("7. Load information from text file.");
    System.out.println("8. Quit");
  }


  // MAIN method:
  public static void main (String[] args){
    MainTest test = new MainTest();
    test.start();
  }
}
