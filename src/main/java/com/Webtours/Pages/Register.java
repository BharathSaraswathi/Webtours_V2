package com.Webtours.Pages;

import java.util.logging.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register extends Base {

  public Register() {
    PageFactory.initElements(driver, this);
  }

  public void clickRegistrationLink() {
    registerLink.click();
  }

  public void customerDetails() {
    Logger.getLogger("Enter First Name");
    firstName.sendKeys(properties.getProperty("firstName"));
    Logger.getLogger("Enter eMail ID");
    userName.sendKeys(properties.getProperty("eMail"));
    Logger.getLogger("Enter password");
    password.sendKeys(properties.getProperty("password"));
    Logger.getLogger("Enter Confirm password");
    confirmPassword.sendKeys(properties.getProperty("password"));
  }

  public void clicksubmitButton() {
    submitButton.click();
  }



  @FindBy(xpath = ".//a[contains(text(),'REGISTER')]")
  WebElement registerLink;

  @FindBy(xpath = ".//input[@name='firstName']")
  WebElement firstName;

  @FindBy(xpath = ".//input[@id='email']")
  WebElement userName;

  @FindBy(xpath = ".//input[@name='password']")
  WebElement password;

  @FindBy(xpath = ".//input[@name='confirmPassword']")
  WebElement confirmPassword;

  @FindBy(xpath = ".//input[@name='register']")
  WebElement submitButton;


}
