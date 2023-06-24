package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaasicNavigation {
    public static void main(String[] args) {

        //setup chrome and create Webdriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        // navigate.to(url)
        driver.navigate().to("https://www.google.com");

        //navigate.back()
        driver.navigate().back();

        // navigate.forward()
        driver.navigate().forward();


        //navigate.refresh
        driver.navigate().refresh();




    }






}
