package com.cydeo.step_definitions;

/*
In this class we will be able to create "PRE" and "POST conditions"
for ALL the SCENARIOS and even STEPS.
 */

import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    //import the @Before coming from io.cucumber.java
   // @Before (order = 1)
    public void setUpMethod(){
        //System.out.println("\n---> @Before: RUNNING BEFORE EACH SCENARIO");
    }

    //@Before(value = "@login", order = 2)
    public void login_scenario_before(){
        //System.out.println("\n---> @Before: RUNNING BEFORE EACH SCENARIO");
    }



    @After
    public void teardownMethod(Scenario scenario) {

        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }

        System.out.println("---> @After: RUNNING AFTER EACH SCENARIO");
        Driver.closeDriver();

    }

    @BeforeStep
    public void setupStep(){

        //System.out.println("---> @BeforeStep: RUNNING BEFORE EACH STEP");
    }

    @AfterStep
    public void teardownStep(){
       // System.out.println("---> @BeforeStep: RUNNING AFTER EACH STEP");

    }

}
