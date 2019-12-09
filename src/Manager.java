public class Manager extends Person {


  private String dob = "";
  private int starRating = 0;
  private Team team = new Team();

  public Manager(){}
  public Manager(Name name){
    this.name = name;   // uses protected name instead of setFirst/Middle/LastName
  }

  public String getDob() {
    return dob;
  }

  public void setDob(String dob) {
    this.dob = dob;
  }

  public int getStarRating() {
    return starRating;
  }

  public void setStarRating(int starRating) {
    this.starRating = starRating;
  }

  public Team getTeam() {
    return team;
  }

  public void setTeam(Team team){ this.team = team; }

}
