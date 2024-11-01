package com.tryCloud.step_definitions;

import com.tryCloud.pages.BasePage;
import com.tryCloud.pages.DashboardPage;
import com.tryCloud.pages.FilesPage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.List;

public class SearchFunctionalities_StepDefinitions {
    DashboardPage dashboardPage = new DashboardPage();
    FilesPage filesPage = new FilesPage();

    @Then("user clicks on files module")
    public void user_clicks_on_files_module() {
        dashboardPage.filesPage.click();
    }

    @Then("user clicks on magnifying glass icon")
    public void user_clicks_on_magnifying_glass_icon() {
        filesPage.search.click();
    }

    @And("user searches for file {string}")
    public void userSearchesForFile(String fileNameValue) {
        BrowserUtils.sleep(4);
        fileNameValue = ConfigurationReader.getProperty("fileName");
        filesPage.searchBox.sendKeys(fileNameValue);


    }

    @Then("user checks the file details")
    public void user_checks_the_file_details() {
        BrowserUtils.sleep(3);
        filesPage.searchResults.sendKeys(Keys.ENTER);
        String expectedFileName = ConfigurationReader.getProperty("fileName");
        BrowserUtils.sleep(3);
        String actualFileName = filesPage.fileDetails.getText();
        Assert.assertEquals(actualFileName, expectedFileName);

    }

    @Then("user clicks on Contacts module")
    public void userClicksOnContactsModule() {
        dashboardPage.contactsPage.click();
    }

    @Then("user clicks on Calendar module")
    public void userClicksOnCalendarModule() {
        dashboardPage.calendarsPage.click();
    }

    @Then("user navigates back to dashboard")
    public void userNavigatesBackToDashboard() {
        filesPage.dashboardPage.click();
        BrowserUtils.verifyTitleContains("Dashboard");

    }


}
