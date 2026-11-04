package com.fourbell.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CrossBrowserTest {

    public static void main(String[] args) {

        // Chrome Browser
        WebDriver driver = new ChromeDriver();

        driver.get("https://sv2.starclinch.com/express-booking/on-demand");

        System.out.println("Chrome Title: " + driver.getTitle());

        driver.quit();

        // Edge Browser
        System.setProperty("webdriver.edge.driver",
        		"C:\\Users\\prave\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver edge = new EdgeDriver();

        edge.get("https://sv2.starclinch.com/express-booking/on-demand");

        System.out.println("Edge Title: " + edge.getTitle());

        edge.quit();
    }
}