package com.fourbell.pages;




import org.openqa.selenium.WebDriver;

public class ExpressBookingPage {

    WebDriver driver;

    public ExpressBookingPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}


