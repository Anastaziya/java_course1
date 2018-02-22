package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String firstname;
  private final String lastname;
  private final String companyname;
  private final String phonenumber;

  public ContactData(String firstname, String lastname, String companyname, String phonenumber) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.companyname = companyname;
    this.phonenumber = phonenumber;
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
}
