package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {

    public ContactsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="new-contact-button")
    public WebElement newContactButton;

    @FindBy(xpath = "//a[@class='app-navigation-entry-link']")
    public WebElement allContactButton;

    @FindBy(id = "contact-fullname")
    public WebElement nameInput;

    @FindBy(xpath = "//span[.='Upload a new picture']")
    public WebElement chooseFromFilesButton;

    @FindBy(xpath = "//tr[@data-entryname='picturesfav']")
    public WebElement picturesFolder;

    @FindBy(xpath = "//tr[@data-entryname='tree.jpg']")
    public WebElement treePictures;

    @FindBy(xpath = "//tr[@data-entryname='desert.jpg']")
    public WebElement desertPictures;

    @FindBy(className = "app-navigation-entry__counter")
    public WebElement totalContact;



}
