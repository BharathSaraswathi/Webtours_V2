package com.Webtours.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelsPage extends Base {

  public HotelsPage() {
    PageFactory.initElements(driver, this);
  }


  @FindBy(xpath = ".//a[contains(text(),'Hotels')]")
  WebElement hotelsLink;
}
