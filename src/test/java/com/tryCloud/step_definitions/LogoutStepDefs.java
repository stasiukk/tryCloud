package com.tryCloud.step_definitions;

import com.tryCloud.pages.LogoutPage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.tryCloud.utilities.BrowserUtils.waitFor;


public class LogoutStepDefs {




    LogoutPage logoutPage = new LogoutPage();


//  @Given("the user is logged in")
//    public void the_user_is_logged_in() {
//        driver = Driver.getDriver();
//        driver.get("https://www.trycloud.com/");
//        BrowserUtils.waitFor(2);
//        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='logo']")).isDisplayed());
//        BrowserUtils.clickWithWait(By.xpath("//div[@class='avatardiv avatardiv-shown']//img"), 2);
//        BrowserUtils.waitFor(2);
//        Assert.assertTrue(driver.findElement(By.id("logout")).isDisplayed());



    @Given("the user is on the home page")
    public void theUserIsOnTheHomePage() {
        String homepageTitle = "Dashboard - Trycloud QA";
        Assert.assertTrue(Driver.getDriver().getTitle().contains(homepageTitle));

    }

    @When("the user click user icon")
    public void theUserClickUserIcon() {
        logoutPage.iconLocator.click();
//        BrowserUtils.waitFor(2);
//        logoutPage.logoutButton.click();

    }


    @And("the user clicks on Log out button")
    public void theUserClicksOnLogOutButton() {
        logoutPage.logoutButton.click();
        waitFor(1);
    }

    @Then("the user should be redirected to the login page")
    public void the_user_should_be_redirected_to_the_login_page() {
        BrowserUtils.verifyURLContains("https://qa.trycloud.net/index.php/login?clear=1");



}


@When("the user clicks the browser's back button")
public void the_user_clicks_the_browser_s_back_button() {
    waitFor(3);
    //driver.navigate().back();
   Driver.getDriver().navigate().back();
    waitFor(3);


}


    @Then("title should contain {string}")
    public void title_should_contain (String expectedTitle ) {
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);

    }




}


