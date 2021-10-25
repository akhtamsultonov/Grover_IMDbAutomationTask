package com.imdb.utilities;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class BrowserUtils {


    /**
     * Performs a pause
     *
     * @param seconds
     */
    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
