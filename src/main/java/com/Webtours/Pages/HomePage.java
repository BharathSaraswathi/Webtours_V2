package com.Webtours.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base {

  public HomePage() {
    PageFactory.initElements(driver, this);
  }

  public void clickonSignOn() {
    signOnLink.click();
  }

  public void enterCredentails() {
    userName.sendKeys("UserName");
    password.sendKeys("Password");
  }

  public void clickSubmit() {
    submitButton.click();

  }

  @FindBy(xpath = "//a[contains(text(),'SIGN-ON')]")
  WebElement signOnLink;

  @FindBy(xpath = ".//input[@name='userName']")
  WebElement userName;

  @FindBy(xpath = ".//input[@name='password']")
  WebElement password;

  @FindBy(xpath = ".//input[@name='login']")
  WebElement submitButton;

}
