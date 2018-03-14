package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String firstname;
  private final String lastname;
  private final String companyname;
  private final String phonenumber;
  private String group;

  public ContactData(String firstname, String lastname, String companyname, String phonenumber, String group) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.companyname = companyname;
    this.phonenumber = phonenumber;
    this.group = group;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getCompanyname() {
    return companyname;
  }

  public String getPhonenumber() {
    return phonenumber;
  }

  public String getGroup() {
    return group;
  }
}
