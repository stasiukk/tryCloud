package com.tryCloud.step_definitions;

import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
public class LoginStepDefs {


    LoginPage loginPage = new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login(ConfigurationReader.getProperty("userName"), ConfigurationReader.getProperty("password")  );
    }

//    @Given("the user logged in as {string}")
//    public void the_user_logged_in_as(String userType) {
//        //based on input enter that user information
//        String username =null;
//        String password =null;
//
//        if(userType.equalsIgnoreCase("driver")){
//            username = ConfigurationReader.getProperty("driver_username");
//            password = ConfigurationReader.getProperty("driver_password");
//        }else if(userType.equalsIgnoreCase("sales manager")){
//            username = ConfigurationReader.getProperty("sales_manager_username");
//            password = ConfigurationReader.getProperty("sales_manager_password");
//        }else if(userType.equalsIgnoreCase("store manager")){
//            username = ConfigurationReader.getProperty("store_manager_username");
//            password = ConfigurationReader.getProperty("store_manager_password");
//        }
//        //send username and password and login
//        new LoginPage().login(username,password);
//    }
//
//    @Given("the user logged in with username as {string} and password as {string}")
//    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {
//      LoginPage loginPage=new LoginPage();
//      loginPage.login(username,password);
//    }





}
