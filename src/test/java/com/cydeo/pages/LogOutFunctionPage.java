package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutFunctionPage {

    public LogOutFunctionPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "user")
    public WebElement username;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(id = "expand")
    public WebElement avatarIconButton;

    @FindBy(xpath = "//li[@data-id='logout']")
    public WebElement logOutButton;

}
