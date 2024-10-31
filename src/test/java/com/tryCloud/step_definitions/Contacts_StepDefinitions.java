package com.tryCloud.step_definitions;


import com.tryCloud.pages.ContactsPage;
import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Contacts_StepDefinitions {

    ContactsPage contactsPage = new ContactsPage();

    @Given("User is on contact page")
    public void userIsOnContactPage() {
        contactsPage.contactsButton.click();
    }


    @And("User click on New contact")
    public void userClickOnNewContact() {

        contactsPage.newContactButton.click();


    }

    @And("User enter contact {string}")
    public void userEnterContact(String name) {

        contactsPage.nameInput.clear();
        contactsPage.nameInput.sendKeys(name);
        contactsPage.allContactButton.click();

    }

    @Then("New contact {string}should be created")
    public void newContactShouldBeCreated(String name){


        List<String> contacts = new ArrayList<>();

        // Locate all contact elements
        List<WebElement> contactElements = Driver.getDriver().findElements(By.xpath(
                "//div[contains(@class, 'app-content-list-item')]//div[contains(@class, " +
                        "'app-content-list-item-line-one')]"));

        // Loop through elements and add names to the list
        for (WebElement contact : contactElements) {
            contacts.add(contact.getText());
        }
        System.out.println("contacts = " + contacts);
        if(name.isBlank()){
            Assert.assertTrue(contacts.contains("New contact"));
        }else {
            Assert.assertTrue(contacts.contains(name));
        }


    }

    @And("User click on All contacts tab")
    public void userClickOnAllContactsTab() {
        contactsPage.allContactButton.click();

    }

    @Then("User should see all contacts as a list in the middle column")
    public void userShouldSeeAllContactsAsAListInTheMiddleColumn() {
        Assert.assertTrue("All Contact List is not Displayed", contactsPage.allContactList.isDisplayed());

    }

    @And("User should see total number of contact near the All contacts tab")
    public void userShouldSeeTotalNumberOfContactNearTheAllContactsTab() {
        Assert.assertTrue("Total Contacts Count is not Displayed", contactsPage.totalContact.isDisplayed());
    }


    @And("User click on Contact User08")
    public void userClickOnContactUser() {
        contactsPage.contactUser08.click();
        BrowserUtils.sleep(1);
    }

    @And("User click on Profile Picture Setting")
    public void userClickOnProfilePictureSetting() {
        contactsPage.avatarSetting.click();
        BrowserUtils.sleep(1);
    }

    @And("User click Choose from Files")
    public void userClickChooseFromFiles() {
        contactsPage.chooseFromFilesButton.click();
        BrowserUtils.sleep(1);
        
    }

    @And("User select picturesfav folder")
    public void userSelectPicturesfavFolder() {
        contactsPage.picturesFolder.click();
        BrowserUtils.sleep(1);
        
    }

    @And("User select new pictures")
    public void userSelectNewPictures() {
        contactsPage.desertPictures.click();
        BrowserUtils.sleep(1);
        
    }

    @Then("User click Choose Button")
    public void userClickChooseButton() {
        contactsPage.pictureChooseButton.click();
        BrowserUtils.sleep(1);
    }

    @And("User select contact {string} from the list")
    public void userSelectContactFromTheList(String name) {

        WebElement createdContact = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'"+name+"')]"));


        if( !name.isBlank()){
            createdContact.click();
        }else {
            contactsPage.blankContact.click();
        }
    }

    @And("User click on {int} dots action button")
    public void userClickOnDotsActionButton(int arg0) {
        contactsPage.contactActionButton.click();
        BrowserUtils.sleep(1);

    }

    @And("User click on Delete")
    public void userClickOnDelete() {
        contactsPage.contactDeleteButton.click();
        BrowserUtils.sleep(1);

    }

    @Then("Contact {string} should be deleted")
    public void contactShouldBeDeleted(String name) {


        List<String> contacts = new ArrayList<>();

        // Locate all contact elements
        List<WebElement> contactElements = Driver.getDriver().findElements(By.xpath(
                "//div[contains(@class, 'app-content-list-item')]//div[contains(@class, " +
                        "'app-content-list-item-line-one')]"));

        // Loop through elements and add names to the list
        for (WebElement contact : contactElements) {
            contacts.add(contact.getText());
        }
        Assert.assertFalse(contacts.contains(name));
        BrowserUtils.sleep(1);
    }



}
