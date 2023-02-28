package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileDirectoryPage {
    public FileDirectoryPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "Full name")
    public WebElement fullName;

    @FindBy(xpath = "//div[@id='personal-settings']")
    public WebElement smallerFrame;

    @FindBy(id = "expand")
    public WebElement icon;

    @FindBy(xpath = "//li[@data-id='settings']")
    public WebElement settingsButton;

}
