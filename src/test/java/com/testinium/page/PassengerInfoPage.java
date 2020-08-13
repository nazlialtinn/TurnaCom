package com.testinium.page;

import com.testinium.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.testinium.constants.ConstantPassengerInfoPage.*;


public class PassengerInfoPage extends BasePage {
    public PassengerInfoPage(WebDriver driver) {
        super(driver);
    }

    public PassengerInfoPage FillPassengerInfo(){
        clickElement(PASSENGER_GENDER);

        List<WebElement> elementName = findElements(PASSENGER_NAME);
        elementName.get(0).sendKeys("nazli");

        List<WebElement> elementSurname = findElements(PASSENGER_SURNAME);
        elementSurname.get(1).sendKeys("altin");

        selectOptionByValue(BIRTH_DAY,"06");

        selectOptionByValue(BIRTH_MONTH,"09");

        selectOptionByValue(BIRTH_YEAR,"1998");

        sendKeys(CITIZEN_NUMBER,"01234567890");

        sendKeys(HES_CODE,"0123456789");

        sendKeys(PHONE_NUMBER,"535 235 3535");

        sendKeys(EMAIL,"nazli@altin.com");

        return this;

    }
}
