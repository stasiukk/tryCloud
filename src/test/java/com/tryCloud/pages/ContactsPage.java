package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.codehaus.plexus.util.xml.Xpp3Dom;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {

    public ContactsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//ul[@id='appmenu']//li[7]")
    public WebElement contactsButton;

    @FindBy(id="new-contact-button")
    public WebElement newContactButton;

    @FindBy(xpath = "//a[@class='app-navigation-entry-link']")
    public WebElement allContactButton;

    @FindBy(id = "contact-fullname")
    public WebElement nameInput;

    @FindBy(xpath = "//div[@class='contact-header-avatar__wrapper']//div[2]")
    public WebElement avatarSetting;

    @FindBy(xpath = "//span[.='Choose from Files']")
    public WebElement chooseFromFilesButton;

    @FindBy(xpath = "//tr[@data-entryname='picturesfav']")
    public WebElement picturesFolder;

    @FindBy(xpath = "//tr[@data-entryname='tree.jpg']")
    public WebElement treePictures;

    @FindBy(xpath = "//tr[@data-entryname='desert.jpg']")
    public WebElement desertPictures;

    @FindBy(xpath = "//button[.='Choose']")
    public WebElement pictureChooseButton;

    @FindBy(className = "app-navigation-entry__counter")
    public WebElement totalContact;

    @FindBy(xpath = "//div[@class='contact-header__actions']")
    public WebElement contactActionButton;

    @FindBy(xpath = "(//span[@class='action-button__text'])[6]")
    public WebElement contactDeleteButton;

    @FindBy(xpath = "//div[@class='vue-recycle-scroller__item-wrapper']")
    public WebElement allContactList;

    @FindBy(xpath = "//div[@class='vue-recycle-scroller__item-wrapper']/div[2]")
    public WebElement secondContactFromTheList;


    @FindBy(xpath = "//div[contains(text(),'User08')]")
    public WebElement contactUser08;

    @FindBy(xpath = "//div[contains(text(),'New contact')]")
    public WebElement blankContact;


}
