public class Name {

  private String firstName = "";
  private String middleName = "";
  private String lastName = "";

  // constructors
  public Name(){}
  public Name(String fname, String lname){
    firstName = fname;
    lastName = lname;
  }
  public Name(String fname, String mname, String lname){
    firstName = fname;
    middleName = mname;
    lastName = lname;
  }

  // getters and setters
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}
