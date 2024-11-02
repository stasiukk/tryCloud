package com.tryCloud.step_definitions;

import com.tryCloud.pages.DashboardPage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class DashboardStepDefs {

    DashboardPage dashboardPage = new DashboardPage();




    @When("user can click on customize button")
    public void userCanClickOnCustomizeButton() {
        BrowserUtils.sleep(2);
        dashboardPage.customizeButton.click();
        BrowserUtils.sleep(2);

    }


    @When("user can click on set weather widget")
    public void userCanClickOnSetWeatherWidget() {
        BrowserUtils.sleep(2);
        dashboardPage.weatherWidget.click();
        BrowserUtils.sleep(2);
    }

    @And("user can click on status widget")
    public void userCanClickOnStatusWidget() {
        BrowserUtils.sleep(2);
        dashboardPage.statusWidget.click();
        BrowserUtils.sleep(2);

    }


    @And("user can click on upcoming events widget")
    public void userCanClickOnUpcomingEventsWidget() {
        BrowserUtils.sleep(2);
        dashboardPage.upcomingEventsWidget.click();
        BrowserUtils.sleep(2);
    }

    @And("user can click on upcoming cards widget")
    public void userCanClickOnUpcomingCardsWidget() {
        BrowserUtils.sleep(2);
        dashboardPage.upcomingCardsWidget.click();
        BrowserUtils.sleep(2);

    }


    @And("user can click on recommended files widget")
    public void userCanClickOnRecommendedFilesWidget() {
        BrowserUtils.sleep(2);
        dashboardPage.recommendedFileWidget.click();
        BrowserUtils.sleep(2);
    }

    @And("user can click on talk mentions widget")
    public void userCanClickOnTalkMentionsWidget() {
        BrowserUtils.sleep(2);
        dashboardPage.talkMentionWidget.click();
        BrowserUtils.sleep(2);

    }

    @And("user can click on important mail widget")
    public void userCanClickOnImportantMailWidget() {
        BrowserUtils.sleep(2);
        dashboardPage.importantMailWidget.click();
        BrowserUtils.sleep(2);

    }

    @And("user can click on customize button unread mail widget")
    public void userCanClickOnCustomizeButtonUnreadMailWidget() {
        BrowserUtils.sleep(2);
        dashboardPage.unreadMailWidget.click();
        BrowserUtils.sleep(2);
    }

    @And("user can click on recent status widget")
    public void userCanClickOnRecentStatusWidget() {
        BrowserUtils.sleep(2);
        dashboardPage.recentStatusesWidget.click();
        BrowserUtils.sleep(2);
    }



    @When("user clicks on username icon")
    public void userClicksOnUsernameIcon() {
        dashboardPage.usernameIcon.click();
        BrowserUtils.sleep(2);




    }
        @And("user should be able to click on set status icon")
        public void userShouldBeAbleToClickOnSetStatusIcon () {
            dashboardPage.setStatusButton.click();
        }


        @And("user should be able to click on online status icon")
        public void userShouldBeAbleToClickOnOnlineStatusIcon () {
            dashboardPage.onlineStatusIcon.click();
        }

        @And("user should be able to click message status icon")
        public void userShouldBeAbleToClickMessageStatusIcon () {
            dashboardPage.statusMessageIcon.click();
        }

        @And("user should be able to click on away status icon")
        public void userShouldBeAbleToClickOnAwayStatusIcon () {
            dashboardPage.awayButtonIcon.click();
        }

        @And("user should be able to click on do not disturb status icon")
        public void userShouldBeAbleToClickOnDoNotDisturbStatusIcon () {
            dashboardPage.doNotDisturbBtn.click();

        }

        @And("user should be able to click on invisible status icon")
        public void userShouldBeAbleToClickOnInvisibleStatusIcon () {
            dashboardPage.invisibleStatusIcon.click();
        }




    @Then("user should be able to see username on dashboard")
    public void userShouldBeAbleToSeeUsernameOnDashboard() {
        Assert.assertTrue("Username is not displayed",dashboardPage.username.getText().equals("Employee11"));
    }

    @When("user click on username icon")
    public void userClickOnUsernameIcon() {
        dashboardPage.usernameIcon.click();
    }

    @Then("user can see list of modules")
    public void userCanSeeListOfModules() {
        Assert.assertTrue("Modules are not visible",dashboardPage.modules.isDisplayed());
    }
}











