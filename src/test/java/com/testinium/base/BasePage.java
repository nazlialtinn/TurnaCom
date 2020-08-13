package com.testinium.base;

import com.testinium.page.FlightTicketPage;
import com.testinium.page.PassengerInfoPage;
import com.testinium.page.TurnaPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {

    WebDriver driver;
    WebDriverWait wait;
    public BasePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public WebElement findElement(By by){
        untilElementAppear(by);
        return driver.findElement(by);
    }

    public void clickElement(By by){
        untilElementClickable(by);
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

    public void untilElementAppear(By by){
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void untilElementClickable(By by){
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public TurnaPage getTurnaPage(){
        return new TurnaPage(driver);
    }

    public FlightTicketPage getFlightTicketPage(){
        return new FlightTicketPage(driver);
    }

    public PassengerInfoPage getPassengerInfoPage(){
        return new PassengerInfoPage(driver);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}
