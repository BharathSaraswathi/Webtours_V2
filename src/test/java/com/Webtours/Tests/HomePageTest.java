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
    logger.info("Invoke the Browser and launch the URL");
    BrowserInvoke();
    homePage = new HomePage();
  }

  @Test
  public void signOnTest() {
    logger.info("Click on Sign on Link");
    homePage.clickonSignOn();
    logger.info("Enter UserName and Password");
    homePage.enterCredentails();
  }

  @AfterMethod
  public void endTest() {
    logger.info("Close the Browser after the test");
    driver.quit();
  }

}
