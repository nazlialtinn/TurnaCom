package com.testinium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
public class TurnaTest {

    WebDriver driver;

    @Before
    public void before()
    {
        System.setProperty("webdriver.chrome.driver", "properties/driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("kiosk");
        options.addArguments("test-type");
        options.addArguments("disable-translate");
        options.addArguments("disable-popup-blocking");

        driver = new ChromeDriver(options);

        driver.navigate().to("https://www.turna.com/");

    }

    @Test
    public void wakeupChrome() throws InterruptedException{

        clickElement(By.id("lb-way"));
        TimeUnit.SECONDS.sleep(2);
        findElement(By.name("flight_origin")).clear();
        TimeUnit.SECONDS.sleep(2);
        sendKeys(By.name("flight_origin"),"SAW");
        TimeUnit.SECONDS.sleep(2);
        findElement(By.name("flight_destination")).clear();
        TimeUnit.SECONDS.sleep(2);
        sendKeys(By.name("flight_destination"),"ADB");
        TimeUnit.SECONDS.sleep(1);

        //clickElement(By.name("fromdate"));
        //clickElement(By.cssSelector("div.search-form-item.calendar.departure.datepicker-wrapper.dtp-wrap-from"));
        //selectOptionByValue(By.cssSelector("input.fromdate-next"),"2020-08-21");
        //clickElement(By.cssSelector("input#dp1597164961459.flight-date.fromdate.datepick.txt-date.noinput.search-item.hasDatepicker"));
        TimeUnit.SECONDS.sleep(2);
        //driver.findElement(By.id("btnSearch")).click();
        //clickElement(By.className("popup-close"));
        clickElement(By.id("btnSearch"));
        TimeUnit.SECONDS.sleep(3);
        List<WebElement> elements = findElements(By.cssSelector("div.div-search-list-items div[id='1010'] div.button"));
        elements.get(0).click();
        TimeUnit.SECONDS.sleep(3);
        List<WebElement> elementss = findElements(By.cssSelector("div.div-search-list-items div[id='1064'] div.button"));
        elementss.get(0).click();
        TimeUnit.SECONDS.sleep(3);
        clickElement(By.className("bt-choose"));
        TimeUnit.SECONDS.sleep(3);
        clickElement(By.id("lb-female"));
        TimeUnit.SECONDS.sleep(3);
        List<WebElement> elementName = findElements(By.cssSelector("div.form-item input"));
        elementName.get(0).sendKeys("nazli");
        TimeUnit.SECONDS.sleep(3);
        List<WebElement> elementSurname = findElements(By.cssSelector("div.form-item input"));
        elementSurname.get(1).sendKeys("altin");
        TimeUnit.SECONDS.sleep(3);
        clickElement(By.cssSelector("div.select-box.day"));
        selectOptionByValue(By.cssSelector("select.datepicker-select.day-select.day-of-birth"),"06");
        TimeUnit.SECONDS.sleep(3);
        clickElement(By.cssSelector("div.select-box.month"));
        selectOptionByValue(By.cssSelector("select.datepicker-select.month-select.month-of-birth"),"09");
        TimeUnit.SECONDS.sleep(3);
        clickElement(By.cssSelector("div.select-box.year"));
        selectOptionByValue(By.cssSelector("select.datepicker-select.year-select.year-of-birth"),"1998");
        TimeUnit.SECONDS.sleep(3);
        sendKeys(By.className("citizenno"),"01234567890");
        TimeUnit.SECONDS.sleep(3);
        sendKeys(By.name("hesCode"),"0123456789");
        TimeUnit.SECONDS.sleep(3);
        sendKeys(By.id("txtPhone"),"535 235 3535");
        TimeUnit.SECONDS.sleep(3);
        sendKeys(By.id("txtEmail"),"nazli@altin.com");
        TimeUnit.SECONDS.sleep(3);

        //selectOptionByValue(By.tagName("ui-state-default"),"18");

    }
    @Test
    public void roundTrip() throws InterruptedException{
        clickElement(By.id("lb-way"));
        TimeUnit.SECONDS.sleep(3);
    }
    @Test
    public void selectWay() throws InterruptedException{
        roundTrip();
        findElement(By.name("flight_origin")).clear();
        sendKeys(By.name("flight_origin"),"SAW");
        TimeUnit.SECONDS.sleep(3);
        findElement(By.name("flight_destination")).clear();
        sendKeys(By.name("flight_destination"),"ADB");

    }
    @Test
    public void clickSearchButton() throws InterruptedException{
        selectWay();
        TimeUnit.SECONDS.sleep(3);
        clickElement(By.id("btnSearch"));
    }
    @Test
    public void selectFlightTicket() throws InterruptedException{
        clickSearchButton();
        List<WebElement> elements = findElements(By.cssSelector("div.div-search-list-items div[id='1002'] div.button"));
        elements.get(0).click();
        TimeUnit.SECONDS.sleep(3);
        List<WebElement> elementss = findElements(By.cssSelector("div.div-search-list-items div[id='1050'] div.button"));
        elementss.get(0).click();
        TimeUnit.SECONDS.sleep(3);
        clickElement(By.className("bt-choose"));
        TimeUnit.SECONDS.sleep(3);

    }

    @Test
    public void FillPassengerInfo() throws  InterruptedException{
        selectFlightTicket();
        clickElement(By.id("lb-female"));
        TimeUnit.SECONDS.sleep(3);
        List<WebElement> elementName = findElements(By.cssSelector("div.form-item input"));
        elementName.get(0).sendKeys("nazli");
        TimeUnit.SECONDS.sleep(3);
        List<WebElement> elementSurname = findElements(By.cssSelector("div.form-item input"));
        elementSurname.get(1).sendKeys("altin");
        TimeUnit.SECONDS.sleep(3);
        clickElement(By.cssSelector("div.select-box.day"));
        selectOptionByValue(By.cssSelector("select.datepicker-select.day-select.day-of-birth"),"06");
        TimeUnit.SECONDS.sleep(3);
        clickElement(By.cssSelector("div.select-box.month"));
        selectOptionByValue(By.cssSelector("select.datepicker-select.month-select.month-of-birth"),"09");
        TimeUnit.SECONDS.sleep(3);
        clickElement(By.cssSelector("div.select-box.year"));
        selectOptionByValue(By.cssSelector("select.datepicker-select.year-select.year-of-birth"),"1998");
        TimeUnit.SECONDS.sleep(3);
        sendKeys(By.className("citizenno"),"01234567890");
        TimeUnit.SECONDS.sleep(3);
        sendKeys(By.name("hesCode"),"0123456789");
        TimeUnit.SECONDS.sleep(3);
        sendKeys(By.id("txtPhone"),"535 235 3535");
        TimeUnit.SECONDS.sleep(3);
        sendKeys(By.id("txtEmail"),"nazli@altin.com");
        TimeUnit.SECONDS.sleep(3);
    }


    public WebElement findElement(By by){
        return driver.findElement(by);
    }

    public void clickElement(By by){
        findElement(by).click();
    }

    public void sendKeys(By by, String text){
        findElement(by).sendKeys(text);
    }

    public String getText(By by){
        return findElement(by).getText();
    }

    public List<WebElement> findElements(By by){
        return driver.findElements(by);
    }

    public void selectOptionByValue(By by, String value){
        Select select = new Select(findElement(by));
        select.selectByValue(value);
    }


    @After
    public void tearDown() throws InterruptedException{
        TimeUnit.SECONDS.sleep(2);
        driver.quit();
    }
}
