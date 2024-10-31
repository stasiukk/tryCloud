package com.tryCloud.step_definitions;

import com.tryCloud.pages.CalendarPage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.sql.SQLOutput;

public class Calendar_stepDefinitions {
    CalendarPage calendarPage = new CalendarPage();

    @Given("the user put valid credentials")
    public void the_user_put_valid_credentials() {
        System.out.println("User enters valid credentials");

    }
    @Then("the user logged in successfully")
    public void the_user_log_in_successfully() {
        System.out.println("User logged in successfully");

    }
    @Given("the user can find the Calendar module on dashboard")
    public void the_user_can_find_the_calendar_module_on_dashboard() {
        calendarPage.calendarButton.click();
        System.out.println("User can find the calendar module on dashboard");

    }
    @Then("the user can click on the Calendar module")
    public void theUserCanClickOnTheCalendarModule() {
        System.out.println("User click on the calendar module successfully");
        BrowserUtils.sleep(5);
    }
    @Then("the user can display the daily calendar view")
    public void the_user_can_display_the_daily_calendar_view() {
        calendarPage.events.click();
        calendarPage.dailyCalendar.click();
        System.out.println("User can display the daily calendar view");
        BrowserUtils.sleep(2);
    }
    @Then("the user can display the weekly calendar view")
    public void the_user_can_display_the_weekly_calendar_view() {
        calendarPage.events.click();
        calendarPage.weeklyCalendar.click();
        System.out.println("User can display the weekly calendar view");
        BrowserUtils.sleep(2);

    }
    @Then("the user can display the monthly calendar view")
    public void the_user_can_display_the_monthly_calendar_view() {
        calendarPage.events.click();
        calendarPage.monthlyCalendar.click();
        BrowserUtils.sleep(2);
        System.out.println("User can display the monthly calendar view");
    }
    @Then("the user can click on the New Event")
    public void theUserCanClickOnTheNewEvent() {
        calendarPage.newEvent.click();
        calendarPage.eventTitle.sendKeys("Right now meeting " + Keys.ENTER);
        BrowserUtils.waitFor(2);
    }
    @Then("the user can create a new event under the monthly calendar view")
    public void the_user_can_create_a_new_event_under_the_monthly_calendar_view() {
        calendarPage.selectStartingDate.click();
        calendarPage.fromdatePicker.click();
        BrowserUtils.sleep(3);
        //calendarPage.toDatePicker.click();
        BrowserUtils.sleep(3);
        //calendarPage.selectStartingDate.sendKeys("from 11/01/2024 at 2:00 PM");
        calendarPage.saveBtn.click();
        BrowserUtils.waitFor(3);
        //calendarPage.selectStartingDate.sendKeys("from 11/01/2024 at 2:00 PM" );
        //calendarPage.dateSelected.click();
        //calendarPage.pickADate.click();
        //calendarPage.selectStartingDate.sendKeys("11/01/2024" + Keys.ENTER );
        System.out.println("User can create an event on the calendar module");
    }

    @And("the user can see new event created on the monthly calendar view")
    public void theUserCanSeeNewEventCreatedOnTheMonthlyCalendarView() {
        calendarPage.upcomingEvent.click();
        System.out.println("User can see new event created on the monthly calendar view");
        BrowserUtils.sleep(3);
    }


}
