package com.testinium.base;

import com.testinium.page.TurnaPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BaseTest {


    WebDriver driver;

    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "properties/driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("kiosk");
        options.addArguments("test-type");
        options.addArguments("disable-translate");
        options.addArguments("disable-popup-blocking");
        setDriver(new ChromeDriver(options));
        getDriver().manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);


    }

    @After
    public void tearDown() throws InterruptedException{
        TimeUnit.SECONDS.sleep(2);
        getDriver().quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}
