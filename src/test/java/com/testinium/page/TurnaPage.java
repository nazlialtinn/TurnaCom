package com.testinium.page;

import com.testinium.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;
import static com.testinium.constants.ConstantTurnaPage.*;
import static com.testinium.constants.ConstantTicketPage.*;
import static com.testinium.constants.ConstantPassengerInfoPage.*;

public class TurnaPage extends BasePage {


    public TurnaPage(WebDriver driver) {
        super(driver);
    }
    public void roundTrip() throws InterruptedException{
        clickElement(ROUND_TRIP);

        findElement(FLIGHT_FROM).clear();
        sendKeys(FLIGHT_FROM,"SAW");

        findElement(FLIGHT_TO).clear();
        sendKeys(FLIGHT_TO,"ADB");

        //clickElement(POPUP_CLOSE);

        clickElement(SEARCH_BUTTON);

    }

    public void selectFlightTicket(){

        List<WebElement> ticketFrom = findElements(TICKET_FROM);
        ticketFrom.get(0).click();

        List<WebElement> ticketTo = findElements(TICKET_TO);
        ticketTo.get(0).click();

        clickElement(TICKET_BUTTON);


    }



}
