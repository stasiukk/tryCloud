package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilesPage {
    public FilesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@aria-controls='header-menu-unified-search']")
    public WebElement search;
    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;
    @FindBy(xpath = "//a[@class='filename']")
    public WebElement fileDetails;
    @FindBy(xpath = "//a[@href='https://qa.trycloud.net/index.php/apps/files/?dir=/&scrollto=Readme.md']")
    public WebElement searchResults;
    @FindBy(xpath = "//a[@aria-label='Dashboard']")
    public WebElement dashboardPage;

}
