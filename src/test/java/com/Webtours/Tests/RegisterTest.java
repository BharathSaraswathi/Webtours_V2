package com.Webtours.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Webtours.Pages.Base;
import com.Webtours.Pages.Register;

public class RegisterTest extends Base {

  Register register;

  @BeforeMethod
  public void setUpTest() {
    BrowserInvoke();
    register = new Register();
  }

  @Test(priority = 1)
  public void registerTest() {
    register.clickRegistrationLink();
    register.customerDetails();
    register.clicksubmitButton();

  }

  @AfterMethod
  public void endTest() {
    driver.quit();
  }
}
