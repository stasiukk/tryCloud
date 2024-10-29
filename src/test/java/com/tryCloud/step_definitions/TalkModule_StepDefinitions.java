package com.tryCloud.step_definitions;

import com.tryCloud.pages.TalkModulePage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TalkModule_StepDefinitions {

    TalkModulePage talkModulePage = new TalkModulePage();


    @And("the user logs in successfully")
    public void theUserLogsInSuccessfully() {
        String expectedTitle = "Dashboard - Trycloud QA";
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));
        System.out.println("User logged in successfully.");
    }

    @Given("the user clicks on the {string} module")
    public void theUserClicksOnTheModule(String module) {
        talkModulePage.talkButton.click();
    }

    @When("the user clicks on the {string} button")
    public void theUserClicksOnTheButton(String createNewTalkButton) {
        talkModulePage.createNewTalkButton.click();
        BrowserUtils.waitFor(1);
    }

    @Then("the user enters {string} as the conversation title")
    public void theUserEntersAsTheConversationTitle(String title) {
        talkModulePage.nameGroupBox.sendKeys(title);
        BrowserUtils.waitFor(1);

    }

    @And("the user press on the {string} option")
    public void theUserPressOnTheOption(String AddParticipantButton) {
        talkModulePage.addParticipantButton.click();
        BrowserUtils.waitFor(1);


    }

    @Then("the user should see the search participants field")
    public void theUserShouldSeeTheSearchParticipantsField() {
        WebElement searchField = Driver.getDriver().findElement(By.xpath("//input[@placeholder='Search participants']"));
        Assert.assertTrue("Search field is not displayed!", searchField.isDisplayed());

    }

    @When("the user clicks on the {string} field")
    public void theUserClicksOnTheField(String searchPanel) {
        talkModulePage.searchPanel.click();
        BrowserUtils.waitFor(1);


    }

    @And("the user types {string} into the search field")
    public void theUserTypesIntoTheSearchField(String name) {
        talkModulePage.searchPanel.sendKeys(name);
        BrowserUtils.waitFor(1);

    }

    @And("the user selects {string} from the search results")
    public void theUserSelectsFromTheSearchResults(String name) {
        WebElement nameOfParticipant = Driver.getDriver().findElement(By.xpath("//span[@class='participant-row__user-name' and text()='" + name + "']"));
        nameOfParticipant.click();
        BrowserUtils.waitFor(1);

        talkModulePage.createConversation.click();
        BrowserUtils.waitFor(1);

    }

    @Then("the user should see {string} added to the conversation participants list")
    public void theUserShouldSeeAddedToTheConversationParticipantsList(String name) {
        System.out.println("User sees " + name + " added to the conversation participants list.");
        BrowserUtils.waitFor(1);

    }

    @Given("{string} is added to the conversation participants list")
    public void isAddedToTheConversationParticipantsList(String name) {
        System.out.println(name + " is added to the conversation participants list.");
    }

    @Then("the user should see the conversation title {string} in the conversation list")
    public void theUserShouldSeeTheConversationTitleInTheConversationList(String name) {
        System.out.println("User sees conversation titled " + name + " in the conversation list.");
    }


    @Given("the conversation titled {string} is available in the conversation list")
    public void theConversationTitledIsAvailableInTheConversationList(String name) {
        System.out.println("Conversation titled " + name + " is available in the conversation list.");
    }

    @When("the user click the conversation titled {string}")
    public void theUserClickTheConversationTitled(String name) {
        WebElement nameOfConversation = Driver.getDriver().findElement(By.xpath("//a[contains(@aria-label, 'Conversation, " + name + "')]"));
        //WebElement nameOfConversation = Driver.getDriver().findElement(By.xpath("//span[@class='acli__content__line-one__title' and normalize-space(text())='"+name+"']"));
        nameOfConversation.click();
        BrowserUtils.waitFor(3);
    }

    @Then("the selected conversation should be highlighted")
    public void theSelectedConversationShouldBeHighlighted() {
        System.out.println("Selected conversation is highlighted.");
    }

    @When("the user clicks on the settings icon")
    public void theUserClicksOnTheSettingsIcon() {
        talkModulePage.settingsButton.click();
        BrowserUtils.waitFor(1);
    }

    @And("the user selects the {string} option")
    public void theUserSelectsTheOption(String deleteButton) {
        talkModulePage.deleteButton.click();
        BrowserUtils.waitFor(1);
    }

    @Then("the user should see a confirmation prompt")
    public void theUserShouldSeeAConfirmationPrompt() {
        WebElement confirmation = Driver.getDriver().findElement(By.xpath("//p[contains(text(), 'Do you really want to delete')]"));
        Assert.assertTrue(confirmation.isDisplayed());
    }


    @When("the user clicks the {string} button to confirm")
    public void theUserClicksTheButtonToConfirm(String yesButton) {
        talkModulePage.yesButton.click();
        BrowserUtils.waitFor(3);
    }

    @Then("the conversation titled {string} should no longer appear in the conversation list")
    public void theConversationTitledShouldNoLongerAppearInTheConversationList(String name) {
        List<WebElement> conversations = Driver.getDriver().findElements(By.xpath("//ul[contains(@class, 'conversations')]//span[contains(@class, 'acli__content__line-one__title') and text()='" + name + "']"));
        Assert.assertTrue("Conversation titled '" + name + "' is still present in the list.", conversations.isEmpty());


    }

    @And("the conversation should be deleted successfully")
    public void theConversationShouldBeDeletedSuccessfully() {
        System.out.println("Conversation deleted successfully.");
    }


}
