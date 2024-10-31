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


public class LogoutStepDefs {

    WebDriver driver;

    LogoutPage logoutPage = new LogoutPage();



    @Given("the user is logged in successfully")
    public void the_user_is_logged_in_successfully() {
//        driver = Driver.getDriver();
//        driver.get("https://www.trycloud.com/");
//        BrowserUtils.waitFor(2);
//        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='logo']")).isDisplayed());
//        BrowserUtils.clickWithWait(By.xpath("//div[@class='avatardiv avatardiv-shown']//img"), 2);
//        BrowserUtils.waitFor(2);
//        Assert.assertTrue(driver.findElement(By.id("logout")).isDisplayed());

    }

    @When("the user logs out")
    public void the_user_logs_out() {
        logoutPage.iconLocator.click();
        BrowserUtils.waitFor(2);
            logoutPage.logoutButton.click();

   }

   @Then("the user should be redirected to the login page")
 public void the_user_should_be_redirected_to_the_login_page() {
        BrowserUtils.verifyURLContains("login");

    }

    @When("the user clicks the browser's back button")
    public void the_user_clicks_the_browser_s_back_button() {
   driver.navigate().back();
   }

   @Then("the user should be redirected back to the login page")
    public void the_user_should_be_redirected_back_to_the_login_page() {
        BrowserUtils.verifyURLContains("login");

        }


    }




