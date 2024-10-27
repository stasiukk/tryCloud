package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TalkModulePage {

    public TalkModulePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='appmenu']/li[5]")
    public WebElement talkButton;

    @FindBy(xpath = "//*[@id='app-navigation-vue']/div[1]/div/button")
    public WebElement createNewTalkButton;

    @FindBy(xpath = "//input[@placeholder='Conversation name']")
    public WebElement nameGroupBox;

    @FindBy(xpath = "//input[@placeholder='Search participants']")
    public WebElement searchPanel;

    @FindBy(xpath = "//button[contains(text(), 'Add participants')]")
    public WebElement addParticipantButton;

    @FindBy(xpath = "(//*[@id='body-user']//button)[8]")
    public WebElement addButton;

    @FindBy(xpath = "//*[@id='body-user']//button[2]")
    public WebElement createConversation;

    @FindBy(css = "button.icon.action-item__menutoggle.action-item__menutoggle--default-icon[aria-label='Conversation settings']")
    public WebElement settingsButton;

    @FindBy(xpath = "//*[.='Delete conversation']")
    public WebElement deleteButton;

    @FindBy(xpath = "//button[.='Yes']")
    public WebElement yesButton;
}
