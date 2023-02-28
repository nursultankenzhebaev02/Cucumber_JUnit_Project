package com.cydeo.step_definitions;

import com.cydeo.pages.FileDirectoryPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

public class FileDirectory_StepDefinitions {

    FileDirectoryPage fileDirectoryPage = new FileDirectoryPage();

    @Given("the user clicks settings label")
    public void the_user_clicks_settings_label() {

        fileDirectoryPage.icon.click();
        fileDirectoryPage.settingsButton.click();

    }
    @Then("the user should see following labels")
    public void the_user_should_see_following_labels(List<WebElement> list) {

        Driver.getDriver().switchTo().frame(fileDirectoryPage.smallerFrame);
        Assert.assertTrue(fileDirectoryPage.smallerFrame.getText().contains("Full name"));

    }

    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.

}
