package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CalendarPage {

public CalendarPage(){

    PageFactory.initElements(Driver.getDriver(), this);

}
@FindBy (xpath = "//a[@href='/index.php/apps/calendar/']")
public WebElement calendarButton;

@FindBy(xpath = "//button[@aria-label='Actions']")
public WebElement events;

@FindBy (xpath = "(//span[@class='action-button__text'])[3]")
public WebElement dailyCalendar;

@FindBy (xpath = "(//span[@class='action-button__text'])[4]")
public WebElement weeklyCalendar;

@FindBy (xpath = "(//span[@class='action-button__text'])[5]")
public WebElement monthlyCalendar;

@FindBy (xpath = "(//div[@class='new-event-today-view-section'])")
public WebElement newEvent;

@FindBy (xpath = "//input[@placeholder='Event title']")
public WebElement eventTitle;

@FindBy (xpath = "//div[@class='mx-datepicker'][1]")
public WebElement selectStartingDate;

@FindBy(xpath = "//div[@class='mx-datepicker-main mx-datepicker-popup']//tr[5]//td[6]")
public WebElement fromdatePicker;

@FindBy (xpath = "//div[@class='mx-datepicker-main mx-datepicker-popup']//tr[1]//td[7]")
public WebElement toDatePicker;

@FindBy (xpath = "//button[@class='primary']")
public WebElement saveBtn;

@FindBy (xpath = "//div[@class='fc-event-time']")
public WebElement upcomingEvent;



}
