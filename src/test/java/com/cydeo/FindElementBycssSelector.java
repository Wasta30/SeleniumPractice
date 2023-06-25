package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementBycssSelector {

    public static void main(String[] args) {



        //set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        //for CssSelector
        // tagName[attribute='value']
// tagName#idValue
//. stands for class attribute
// tagName[attribute='value'] > childTagName ( to go from parent to child)

        // navigate to google.com
        driver.get("https://google.com");

        //AcceptAllKeyLocate by xpath method
        WebElement AcceptKey = driver.findElement(By.xpath("//div[.=\"Accept all\"]"));
        AcceptKey.click();

        //search for cydeo
        WebElement searchBox = driver.findElement(By.cssSelector("textarea[name='q']"));
        searchBox.sendKeys("cydeo"+ Keys.ENTER);


        //verify Cydeo is appeared in the results

WebElement cydeoText = driver.findElement(By.cssSelector("a[href='https://cydeo.com/']>h3"));

if(cydeoText.getText().equals("Cydeo")){
    System.out.println("Cydeo text test is passed");
}else {
    System.out.println("test failed ");
}


        //close the browser
        driver.quit();







    }


}
