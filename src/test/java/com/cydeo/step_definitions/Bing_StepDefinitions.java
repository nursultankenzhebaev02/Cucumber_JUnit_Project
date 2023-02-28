package com.cydeo.step_definitions;

import com.cydeo.pages.BingSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;


public class Bing_StepDefinitions {

    BingSearchPage bingSearchPage = new BingSearchPage();



    @Given("user is on the Bing search page")
    public void userIsOnTheBingSearchPage() {
        Driver.getDriver().get("https://www.bing.com");
    }

    @When("user searches for {string}")
    public void userSearchesFor(String samsung) {
        bingSearchPage.bingSearchBox.sendKeys(samsung + Keys.ENTER);
    }

    @Then("user should see {string} in the title")
    public void userShouldSeeInTheTitle(String samsungTitle) {
        BrowserUtils.verifyTitleContains(samsungTitle);
    }
}
