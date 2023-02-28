package com.cydeo.step_definitions;

import com.cydeo.pages.DropdownPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import java.util.List;
import java.util.Map;

public class DataTables_StepDefinitions {


    @Then("user should see below list")
    public void user_should_see_below_list(List<String> fruitsAndVegetables) {
        System.out.println("fruitsAndVegetables = " + fruitsAndVegetables);

        System.out.println(fruitsAndVegetables.get(1));

    }

    @Then("I will share my favorites")
    public void iWillShareMyFavorites(List<String> pets) {
        System.out.println("pets = " + pets);
    }

    @Then("office is able to see any data he wants")
    public void office_is_able_to_see_any_data_he_wants(Map<String, String> driverInfo) {

        System.out.println("driverInfo = " + driverInfo);

        System.out.println("driverInfo.get(\"name\") = " + driverInfo.get("name"));
        System.out.println("driverInfo.get(\"Address\") = " + driverInfo.get("Address"));
        System.out.println("driverInfo.size() = " + driverInfo.size());

    }

    DropdownPage dropdownPage = new DropdownPage();

    @Given("User is on the dropdown page of practice tool")
    public void user_is_on_the_dropdown_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }
    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonth) {

        List<String> actualMonth = BrowserUtils.dropdownOptions_as_STRING(dropdownPage.dropdownMonth);

        Assert.assertEquals(expectedMonth, actualMonth);

    }



}
