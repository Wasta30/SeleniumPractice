package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuitMethod {

    public static void main(String[] args) throws InterruptedException {


        //set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        // navigate to a practice page that open to a new tab
        //this practice url will open and wait 3 seconds and open a new tab
        driver.get("http://practice.cydeo.com/open_new_tab");


        //wait 5 sec
        Thread.sleep(5000);

        // close current tab
        driver.close();

        // close all browser window opened by driver
        driver.quit();







    }



}
