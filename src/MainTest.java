public class MainTest {

  private League league = new League();


  private void start(){


  }

  private League createLeague(){


    return league;
  }

  private Team createTeam(){
    Team team = new Team();

    return team;
  }

  private Player createPlayer(){
    Player player = new Player();

    return player;
  }

  private Manager createManager(){
    Manager manager = new Manager();

    return manager;
  }


  public void main (String[] args){
    MainTest test = new MainTest();
    test.start();
  }
}
