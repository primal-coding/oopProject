public class Person {

  protected Name name;  // in order to use in Player and Manager using 'this' keyword
  private String phone;
  private String email;

  public Name getName() {
    return name;
  }

  public void setName(Name name) {
    this.name = name;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
