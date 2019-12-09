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
    createLeague();
    System.out.println("Premier League:");
    System.out.println("Team 1: " + team1.getName() + " / Jersey: " + team1.getJerseyColor() + " / Manager: " + team1.getManager().getName());
    System.out.println("Players:");
    for (Player player : team1.getPlayers() ){
      System.out.println(player.getName() + " is a Goalie: " + player.isGoalie() + " / Goals: " + player.getGoals());
    }
    System.out.println("");

    System.out.println("Team 2: " + team2.getName() + " / Jersey: " + team2.getJerseyColor() + " / Manager: " + team2.getManager().getName());
    System.out.println("Players:");
    for (Player player : team2.getPlayers() ){
      System.out.println(player.getName() + " is a Goalie: " + player.isGoalie() + " / Goals: " + player.getGoals());
    }
    System.out.println("");
    System.out.println("Team 3: " + team3.getName() + " / Jersey: " + team3.getJerseyColor() + " / Manager: " + team3.getManager().getName());
    System.out.println("Players:");
    for (Player player : team3.getPlayers() ){
      System.out.println(player.getName() + " is a Goalie: " + player.isGoalie() + " / Goals: " + player.getGoals());
    }
    System.out.println("");
    System.out.println("Team 4: " + team1.getName() + " / Jersey: " + team4.getJerseyColor() + " / Manager: " + team4.getManager().getName());
    System.out.println("Players:");
    for (Player player : team4.getPlayers() ){
      System.out.println(player.getName() + " is a Goalie: " + player.isGoalie() + " / Goals: " + player.getGoals());
    }
    System.out.println("");
    System.out.println("Team 5: " + team5.getName() + " / Jersey: " + team5.getJerseyColor() + " / Manager: " + team5.getManager().getName());
    System.out.println("Players:");
    for (Player player : team5.getPlayers() ){
      System.out.println(player.getName() + " is a Goalie: " + player.isGoalie() + " / Goals: " + player.getGoals());
    }
    System.out.println("");
  }

  private void createLeague(){
    league.add(team1);
    league.add(team2);
    league.add(team3);
    league.add(team4);
    league.add(team5);
    createTeams();
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
  }

  private void addPlayers(){
    team1.addPlayer(player11);
    team1.addPlayer(player12);
    team1.addPlayer(player13);
    team1.addPlayer(player14);
    team1.addPlayer(player15);
    team2.addPlayer(player21);
    team2.addPlayer(player22);
    team2.addPlayer(player23);
    team2.addPlayer(player24);
    team2.addPlayer(player25);
    team3.addPlayer(player31);
    team3.addPlayer(player32);
    team3.addPlayer(player33);
    team3.addPlayer(player34);
    team3.addPlayer(player35);
    team4.addPlayer(player41);
    team4.addPlayer(player42);
    team4.addPlayer(player43);
    team4.addPlayer(player44);
    team4.addPlayer(player45);
    team5.addPlayer(player51);
    team5.addPlayer(player52);
    team5.addPlayer(player53);
    team5.addPlayer(player54);
    team5.addPlayer(player55);
    player11.setGoals(5);
    player23.setGoals(3);
    player35.setGoals(7);
    player41.setGoals(2);
    player55.setGoals(1);
    player11.setGoalie();
    player11.setGoals(15);
    player22.setGoalie();
    player22.setGoals(11);
    player33.setGoalie();
    player33.setGoals(12);
    player44.setGoalie();
    player44.setGoals(17);
    player55.setGoalie();
    player55.setGoals(1);
  }


  // TEST Part_2
  private void part2(){


  }

  // MAIN method:
  public void main (String[] args){
    MainTest test = new MainTest();
    test.start();
  }
}
