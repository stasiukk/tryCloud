package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (xpath = "//a[@class='edit-panels icon-rename']")
    public WebElement customizeButton;

    @FindBy (xpath = "//div[@class='user-status-menu-item']")
    public WebElement setStatusButton;

    @FindBy (id = "expand")
    public WebElement usernameIcon;

    @FindBy(xpath = "//label[@for='status-checkbox-weather']")
    public WebElement weatherWidget;

    @FindBy(xpath = "//label[@for='status-checkbox-status']")
    public WebElement statusWidget;

    @FindBy(xpath = "//label[@for='panel-checkbox-calendar']")
    public WebElement upcomingEventsWidget;

    @FindBy (xpath = "//label[@for='panel-checkbox-deck']")
    public WebElement upcomingCardsWidget;

    @FindBy (xpath = "//label[@for='panel-checkbox-mail']")
    public WebElement importantMailWidget;

    @FindBy(xpath = "//label[@for='panel-checkbox-mail-unread']")
    public WebElement unreadMailWidget;

    @FindBy (xpath = "//label[@for='panel-checkbox-recommendations']")
    public WebElement recommendedFileWidget;

    @FindBy(xpath = "//label[@for='panel-checkbox-spreed']")
    public WebElement talkMentionWidget;

    @FindBy(xpath = "//label[@for='panel-checkbox-user_status']")
    public WebElement recentStatusesWidget;




    @FindBy (xpath = "//em[.='Mute all notifications']")
    public WebElement doNotDisturbBtn;

    @FindBy (xpath = "//label[@for='user-status-online-status-away']")
    public WebElement awayButtonIcon;

    @FindBy(xpath = "//button[@class='status-buttons__primary primary']")
    public WebElement statusMessageIcon;

    @FindBy(xpath = "//label[@for='user-status-online-status-online']")
    public WebElement onlineStatusIcon;

    @FindBy (xpath = "//label[@for='user-status-online-status-invisible']")
    public WebElement invisibleStatusIcon;






}
