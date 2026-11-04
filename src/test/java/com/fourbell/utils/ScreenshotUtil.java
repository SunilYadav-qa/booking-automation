package com.fourbell.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {

    public static void captureScreenshot(WebDriver driver, String fileName) {

        File source = ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.FILE);

        try {
            Files.copy(source.toPath(),
                    new File("screenshots/" + fileName + ".png").toPath(),
                    StandardCopyOption.REPLACE_EXISTING);

            System.out.println("Screenshot saved: " + fileName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
