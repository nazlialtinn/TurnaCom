package com.testinium.page;


import com.testinium.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.testinium.constants.ConstantTicketPage.*;

public class FlightTicketPage extends BasePage {
    public FlightTicketPage(WebDriver driver) {
        super(driver);
    }

    public FlightTicketPage selectFlightTicket(){

        List<WebElement> ticketFrom = findElements(TICKET_FROM);
        ticketFrom.get(0).click();

        List<WebElement> ticketTo = findElements(TICKET_TO);
        ticketTo.get(0).click();

        clickElement(TICKET_BUTTON);

        return this;

    }

}
