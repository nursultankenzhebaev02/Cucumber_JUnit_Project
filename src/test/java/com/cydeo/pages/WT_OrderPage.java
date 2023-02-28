package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WT_OrderPage extends WT_BasePage {

    public WT_OrderPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "product")
    public WebElement productDropdown;

    @FindBy(xpath = "//input[@value='Visa']")
    public WebElement visaRadioButton;

    @FindBy(xpath = "//input[@value='MasterCard']")
    public WebElement masterCardRadioButton;

    @FindBy(xpath = "//input[@value='American Express']")
    public WebElement americanExpressRadioButton;

    @FindBy(name = "quantity")
    public WebElement quantityBox;

    @FindBy(name = "name")
    public WebElement customerName ;

    @FindBy(name = "street")
    public WebElement streetAddress;

    @FindBy(name = "city")
    public WebElement cityAddress ;

    @FindBy(name = "state")
    public WebElement stateAddress;

    @FindBy(name = "zip")
    public WebElement zipCode;

    @FindBy(xpath = "//input[@value='Visa']")
    public WebElement visaPayment;

    @FindBy(name = "cardNo")
    public WebElement cardNumber;

    @FindBy(xpath = "//input[@placeholder='e.g. 04/24']")
    public WebElement expiryDate;

    @FindBy(xpath = "//button[.='Calculate']")
    public WebElement calculateButton;

    @FindBy(xpath = "//button[.='Process Order']")
    public WebElement processButton;


}
