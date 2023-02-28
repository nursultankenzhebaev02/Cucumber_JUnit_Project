package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateListPage {
    public CreateListPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@href='/index.php/apps/tasks/'])[1]")
    public WebElement tasksButton;

    @FindBy(xpath = "(//a[@href='#'])[4]")
    public WebElement addListButton;

    @FindBy(xpath = "//input[@placeholder='New List']")
    public WebElement writeSchool;

    @FindBy(xpath = "(//input[@data-v-5528ad24])[3]")
    public WebElement saveButton;

    @FindBy(xpath = "//ul[@data-v-36d636e7]")
    public WebElement webList;

}
