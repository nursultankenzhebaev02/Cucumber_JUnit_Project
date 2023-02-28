package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTablePage {

    public WebTablePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "username")
    public WebElement username;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath = "//button")
    public WebElement loginButton;

    public void login(){
        this.username.sendKeys("Test");
        this.password.sendKeys("Tester");
        this.loginButton.click();
    }

    /**
     * This method will log in with credentials that
     * provided in the method at the time of calling
     * @param user
     * @param pass
     */

    public void login(String user, String pass){
        this.username.sendKeys(user);
        this.password.sendKeys(pass);
        this.loginButton.click();
    }

    @FindBy(xpath = "(//button[@class='button nav__item'])[2]")
    public WebElement orderButton;

}
