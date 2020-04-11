package com.Webtours.Tests;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Webtours.Pages.Base;
import com.Webtours.Pages.HomePage;

public class HomePageTest extends Base {

  HomePage homePage;

  @BeforeMethod
  public void setUpTest() {
    BrowserInvoke();
    homePage = new HomePage();
  }

  @Test
  public void signOnTest() {
    homePage.clickonSignOn();
    homePage.enterCredentails();
  }

  @AfterMethod
  public void endTest() {
    driver.quit();
  }

}
