package com.cydeo.step_definitions;

import com.cydeo.pages.WikiResultPage;
import com.cydeo.pages.WikiSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Wikipedia_StepDefinitions {


    WikiSearchPage wikiSearchPage = new WikiSearchPage();

    WikiResultPage wikiResultPage = new WikiResultPage();



    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }
    @When("User types Steve Jobs in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box() {

    }
    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikiSearchPage.wikiSearchButton.click();
    }
    @Then("User sees Steve Jobs is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title() {
        BrowserUtils.verifyTitleContains("Steve Jobs");
    }


    @When("User types {string} in the wiki search box")
    public void userTypesInTheWikiSearchBox(String steveJobsSearch) {
        wikiSearchPage.wikiSearchBox.sendKeys(steveJobsSearch);
    }

    @Then("User sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String steveTitle) {
        BrowserUtils.verifyTitleContains(steveTitle);
    }

    @Then("User sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String expectedSteveJobsHeader) {

        String actualHeader = wikiResultPage.wikiMainHeader.getText();

        Assert.assertEquals(actualHeader, expectedSteveJobsHeader);

    }

    @Then("User sees {string} is in the image header")
    public void userSeesIsInTheImageHeader(String expectedText) {
        Assert.assertEquals(wikiResultPage.imageHeader.getText(), expectedText);

    }

    @When("the user clicks step back button")
    public void theUserClicksStepBackButton() {
    }
}
