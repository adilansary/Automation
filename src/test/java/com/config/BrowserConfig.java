package com.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class BrowserConfig {
    public static WebDriver driver;


    @BeforeMethod

    public static void chromelauncher(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://amazon.in");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }



    @Test
    public void verifyTitle(){
        String actualTitile = driver.getTitle();
        String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
        Assert.assertEquals(actualTitile,expectedTitle);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }



}

