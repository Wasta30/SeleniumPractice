package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElement {

    public static void main(String[] args) {

        //setup chrome and create Webdriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();



        // make the window maximized
        driver.manage().window().maximize();

        // navigate to google.com
        driver.get("https://www.google.com");


        //AcceptAllKeyLocate by xpath method
        WebElement AcceptKey = driver.findElement(By.xpath("//div[.=\"Accept all\"]"));
AcceptKey.click();

        // identify I'm Feeling Lucky element and save the element
                WebElement byClassName = driver.findElement(By.className("RNmpXc"));

        // find value of attribute
        String textImFeelingLucky = byClassName.getAttribute("value");

        // verify if value is "I'm Feeling Lucky"
       if(textImFeelingLucky.equals("I'm Feeling Lucky")){
           System.out.println("Test Passed");

       }else {
           System.out.println("Test Failed ");
       }


       driver.quit();

    }


}
