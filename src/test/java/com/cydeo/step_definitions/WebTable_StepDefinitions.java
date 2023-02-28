package com.cydeo.step_definitions;

import com.cydeo.pages.WT_OrderPage;
import com.cydeo.pages.WT_ViewAllOrderPage;
import com.cydeo.pages.WebTablePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class WebTable_StepDefinitions {

    WebTablePage webTablePage = new WebTablePage();

    @Given("user is on the Web Table app login")
    public void user_is_on_the_web_table_app_login() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
    }
    @When("user enters tester username {string}")
    public void userEntersTesterUsername(String usernameLogin) {
        webTablePage.username.sendKeys(usernameLogin);
    }

    @And("user enters valid password {string}")
    public void userEntersValidPassword(String passwordLogin) {
        webTablePage.password.sendKeys(passwordLogin);
    }
    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        webTablePage.loginButton.click();
    }


    @Then("user should see {string} word in the URL")
    public void userShouldSeeWordInTheURL(String expectedURL) {

        String actualURL = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualURL.contains(expectedURL));

    }


    @When("user enters below correct credentials")
    public void userEntersBelowCorrectCredentials(Map<String, String> credentials) {

        webTablePage.username.sendKeys(credentials.get("username"));
        webTablePage.password.sendKeys(credentials.get("password"));

    }

    @Given("user is already logged in to The Web table app")
    public void userIsAlreadyLoggedInToTheWebTableApp() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
        webTablePage.login();
    }

    WT_OrderPage orderPage = new WT_OrderPage();

    @When("user is on the “Order” page")
    public void userIsOnTheOrderPage() {
        orderPage.orderLink.click();
        BrowserUtils.sleep(2);
    }

    @Then("user sees below options under “product” dropdown")
    public void userSeesBelowOptionsUnderProductDropdown(List<String> expectedOptions) {

        List<String> actualOptions = BrowserUtils.dropdownOptions_as_STRING(orderPage.productDropdown);

        Assert.assertEquals(actualOptions, expectedOptions);

    }


    @Then("user sees American Express as enabled payment option")
    public void userSeesAmericanExpressAsEnabledPaymentOption() {
        Assert.assertTrue(orderPage.masterCardRadioButton.isEnabled());
    }

    @Then("user sees Visa as enabled payment option")
    public void userSeesVisaAsEnabledPaymentOption() {
        Assert.assertTrue(orderPage.visaRadioButton.isEnabled());
    }

    @Then("user sees Mastercard as enabled payment option")
    public void userSeesMastercardAsEnabledPaymentOption() {
        Assert.assertTrue(orderPage.americanExpressRadioButton.isEnabled());
    }

    @Given("user is already logged in to web table app")
    public void userIsAlreadyLoggedInToWebTableApp() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
        webTablePage.login();

    }


    @And("user enters quantity {string}")
    public void userEntersQuantity(String quantity) {
        orderPage.quantityBox.clear();
        orderPage.quantityBox.sendKeys(quantity);
    }

    @And("user enters customer name {string}")
    public void userEntersCustomerName(String customerName) {
        orderPage.customerName.sendKeys(customerName);
    }

    @Then("user enters street {string}")
    public void userEntersStreet(String street) {
        orderPage.streetAddress.sendKeys(street);
    }

    @And("user enters city {string}")
    public void userEntersCity(String city) {
        orderPage.cityAddress.sendKeys(city);
    }

    @And("user enters state {string}")
    public void userEntersState(String state) {
        orderPage.stateAddress.sendKeys(state);
    }

    @And("user enters zip {string}")
    public void userEntersZip(String zip) {
        orderPage.zipCode.sendKeys(zip);
    }

    @And("user selects payment option {string}")
    public void userSelectsPaymentOption(String paymentOption) {
        orderPage.visaRadioButton.click();
    }



    @And("user enters credit card number {string}")
    public void userEntersCreditCardNumber(String creditCardNumber) {
        orderPage.cardNumber.sendKeys(creditCardNumber);
    }

    @And("user enters expiration date {string}")
    public void userEntersExpirationDate(String expDate) {
        orderPage.expiryDate.sendKeys(expDate);
    }

    @And("user clicks to process order button")
    public void userClicksToProcessOrderButton() {
        orderPage.processButton.click();
    }

    WT_ViewAllOrderPage wt_viewAllOrderPage = new WT_ViewAllOrderPage();

    @Then("user should see {string} in the first row of the web table")
    public void userShouldSeeInTheFirstRowOfTheWebTable(String expectedName) {
        String actualName = wt_viewAllOrderPage.expectedName.getText();
        Assert.assertEquals(actualName, expectedName);
    }
}
