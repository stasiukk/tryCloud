package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//a[@aria-label='Files'])[1]")
    public WebElement filesPage;
    @FindBy(xpath = "//a[@aria-label='Contacts']")
    public WebElement contactsPage;
    @FindBy(xpath = "//a[@aria-label='Calendar']")
    public WebElement calendarsPage;

}

