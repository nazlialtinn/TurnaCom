package com.testinium.constants;

import org.openqa.selenium.By;

public class ConstantPassengerInfoPage {
    public static final By PASSENGER_GENDER = By.id("lb-female");
    public static final By PASSENGER_NAME = By.cssSelector("div.form-item input");
    public static final By PASSENGER_SURNAME = By.cssSelector("div.form-item input");
    public static final By BIRTH_DAY = By.cssSelector("select.datepicker-select.day-select.day-of-birth");
    public static final By BIRTH_MONTH = By.cssSelector("select.datepicker-select.month-select.month-of-birth");
    public static final By BIRTH_YEAR = By.cssSelector("select.datepicker-select.year-select.year-of-birth");
    public static final By CITIZEN_NUMBER = By.className("citizenno");
    public static final By HES_CODE = By.name("hesCode");
    public static final By PHONE_NUMBER = By.id("txtPhone");
    public static final By EMAIL = By.id("txtEmail");
}
