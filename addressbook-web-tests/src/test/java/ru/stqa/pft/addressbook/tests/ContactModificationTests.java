package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("Anastasiya!", "Belavus!", "EPAM!", "+375295059969"));
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToHomePage();
    }
}
