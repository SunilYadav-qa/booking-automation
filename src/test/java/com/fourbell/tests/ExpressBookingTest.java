
package com.fourbell.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fourbell.base.BaseTest;
import com.fourbell.pages.ExpressBookingPage;

public class ExpressBookingTest extends BaseTest {

    @Test
    public void verifyExpressBookingPage() {

        ExpressBookingPage page = new ExpressBookingPage(driver);

        System.out.println("Page Title: " + page.getPageTitle());
        System.out.println("Current URL: " + page.getCurrentUrl());

        Assert.assertTrue(
            page.getCurrentUrl().contains("express-booking"),
            "Express Booking URL is incorrect"
        );
    }
}


