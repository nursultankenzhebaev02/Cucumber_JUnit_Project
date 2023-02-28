package com.cydeo.step_definitions;

import com.cydeo.pages.EtsyPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Etsy_StepDefinitions {

    @Given("user is on the Etsy page")
    public void user_is_on_the_etsy_page() {
        Driver.getDriver().get("https://etsy.com");
    }
    @Then("user should see title is as expected")
    public void user_should_see_title_is_as_expected() {
        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";

        BrowserUtils.verifyTitle(expectedTitle);

    }

    EtsyPage etsyPage = new EtsyPage();

    @When("User types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
        etsyPage.etsySearchBox.sendKeys("Wooden Spoon");
    }
    @When("User clicks search button")
    public void user_clicks_search_button() {
        etsyPage.etsySearchButton.click();
    }
    @Then("User sees Wooden Spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {
        String expectedTitleEtsy = "Wooden spoon";

        BrowserUtils.verifyTitleContains(expectedTitleEtsy);
    }


    @When("User types {string} in the search box")
    public void userTypesInTheSearchBox(String woodenSpoon) {
        etsyPage.etsySearchBox.sendKeys(woodenSpoon);
    }

    @Then("User sees {string} is in the title")
    public void userSeesIsInTheTitle(String woodenSpoonTitle) {
        BrowserUtils.verifyTitleContains(woodenSpoonTitle);
    }
}
