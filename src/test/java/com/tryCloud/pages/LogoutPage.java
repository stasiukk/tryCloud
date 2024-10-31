package com.tryCloud.pages;


import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

    WebDriver driver;
    LogoutPage logoutPage;

    public LogoutPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //    @FindBy(xpath = "//div[@class='avatardiv avatardiv-shown']//img")
    @FindBy(id = "expand")
    public WebElement iconLocator;


    @FindBy(xpath = "//li[@data-id='logout']/a")
    public WebElement logoutButton;

    @FindBy(xpath = "//div[@class='logo']")
    public WebElement homePageHeader;



}


