package com.cydeo.step_definitions;

import com.cydeo.pages.CreateListPage;
import com.cydeo.pages.LogOutFunctionPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class CreateList_StepDefinitions {

    LogOutFunctionPage logOutFunctionPage = new LogOutFunctionPage();
    CreateListPage createListPage = new CreateListPage();

    @Given("the user on the login page")
    public void the_user_on_the_login_page() {
        Driver.getDriver().get("https://qa.seamlessly.net/");
    }
    @Given("the user is logged in the given link")
    public void the_user_is_logged_in_the_given_link() {
        logOutFunctionPage.username.sendKeys("Employee61");
        logOutFunctionPage.password.sendKeys("Employee123" + Keys.ENTER);
    }
    @When("user can click task icon")
    public void user_can_click_task_icon() {
        createListPage.tasksButton.click();
    }
    @When("Click Add to list")
    public void click_add_to_list() {
        createListPage.addListButton.click();
    }
    @When("Enter {string} task and click save")
    public void enter_task_and_click_save(String string) {
        createListPage.writeSchool.sendKeys(string);
        createListPage.saveButton.click();
    }

    @Then("User cans see left drop down menu {string} appear in the Trafalgar list")
    public void userCansSeeLeftDropDownMenuAppearInTheTrafalgarList(String traffy) {

        //Driver.getDriver().switchTo().frame(createListPage.webList);
        Assert.assertTrue(createListPage.webList.getText().contains(traffy));

    }

    @Given("Navigate to {string} page")
    public void navigate_to_page(String string) {

    }
    @When("Double click on button")
    public void double_click_on_button() {

    }
    @Then("Verify text double click message {string} should be visible")
    public void verify_text_double_click_message_should_be_visible(String string) {

    }
    @Then("Right click on button")
    public void right_click_on_button() {

    }
    @Then("Verify text right click message {string} should be visible")
    public void verify_text_right_click_message_should_be_visible(String string) {

    }
    @Then("Click Me button")
    public void click_me_button() {

    }
    @Then("Verify text click me message {string} should be visible")
    public void verify_text_click_me_message_should_be_visible(String string) {

    }

}
