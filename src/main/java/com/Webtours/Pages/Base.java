package com.Webtours.Pages;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import com.Webtours.Util.TestUtil;

public class Base {

  public static WebDriver driver;
  public static Properties properties;
  public static Logger logger;

  public Base() {
    properties = new Properties();
    try {
      InputStream inputStream = new FileInputStream(
          "C:\\Users\\bhara\\eclipse-workspace\\WebTours\\src\\main\\resources\\configuration.properties");
      properties.load(inputStream);
    } catch (Exception e) {
      e.printStackTrace();
    }

    logger = LogManager.getLogger(Base.class);
  }

  public static void BrowserInvoke() {
    String browserName = properties.getProperty("browser");
    if (browserName.equals("chrome")) {
      driver = new ChromeDriver();
    } else if (browserName.equals("firefox")) {
      driver = new FirefoxDriver();
    }
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
    driver.get(properties.getProperty("url"));
  }

  @BeforeMethod
  public static void loggers() {


  }

}
