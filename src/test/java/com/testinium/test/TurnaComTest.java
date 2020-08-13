package com.testinium.test;

import com.testinium.base.BaseTest;
import com.testinium.page.TurnaPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


import java.util.concurrent.TimeUnit;

public class TurnaComTest extends BaseTest {
    WebDriver driver;
    TurnaPage turnaPage;

    @Before
    public void before()
    {

        turnaPage = new TurnaPage(getDriver());
        getDriver().navigate().to("https://www.turna.com/");

    }

    @Test
    public void roundTripTest() throws InterruptedException{
        turnaPage.roundTrip();
        turnaPage.getFlightTicketPage().selectFlightTicket();
        turnaPage.getPassengerInfoPage().FillPassengerInfo();
    }



    @After
    public void after() throws InterruptedException{
        TimeUnit.SECONDS.sleep(2);
        getDriver().quit();
    }
}
