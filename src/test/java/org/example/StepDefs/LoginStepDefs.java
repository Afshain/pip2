package org.example.StepDefs;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {

    LoginPage loginpg;


    public LoginStepDefs(){
        loginpg = new LoginPage();

    }
    @Given("user navigate to URL")
    public void userNavigateToURL() {
        loginpg.Driversetup();


    }

    @Given("User is on the login page")
    public void userIsOnTheLoginPage() {

    }

    @And("User Enter the Email")
    public void userEnterTheEmail() {
        loginpg.enterEmail();
    }

    @And("User enter the password")
    public void userEnterThePassword() {
        loginpg.enterpassword();
    }

    @When("User clicks on the login button")
    public void userClicksOnTheLoginButton() throws InterruptedException {
        loginpg.clickbtn();
    }

    @Then("User should be logged in with the account")
    public void userShouldBeLoggedInWithTheAccount() {
    }


}
