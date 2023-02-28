package com.cydeo.step_definitions;

import com.cydeo.pages.LogOutFunctionPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class LogOutFunction_StepDefinition {

    LogOutFunctionPage logOutFunctionPage = new LogOutFunctionPage();

    //url=http://qa.seamlessly.net/
    //password=Employee123
    //username=Employee61
    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        Driver.getDriver().get("https://qa.seamlessly.net/");
        logOutFunctionPage.username.sendKeys("Employee61");
        logOutFunctionPage.password.sendKeys("Employee123" + Keys.ENTER);

    }
    @Given("the user clicks the avatar icon")
    public void the_user_clicks_the_avatar_icon() {
        logOutFunctionPage.avatarIconButton.click();

    }
    @Given("the user clicks the logout label")
    public void the_user_clicks_the_logout_label() {
        logOutFunctionPage.logOutButton.click();
    }


    @Then("the user should see the url {string}")
    public void the_user_should_see_the_url(String expectedURL) {
       String actualURL = Driver.getDriver().getCurrentUrl();

        System.out.println("actualURL = " + actualURL);

        Assert.assertTrue(actualURL.equals(expectedURL));

    }


}
