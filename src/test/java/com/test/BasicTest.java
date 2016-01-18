package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/*
 * Created by zen on 1/17/16.
 */
public class BasicTest {
    public WebDriver driver;

        @BeforeSuite

        public void initDriver() throws Exception{
            System.out.println("you are testing in Firefox");
            driver = new FirefoxDriver();
        }
        @Test
        public void goToSite(){
            driver.navigate().to("http://www.qaacademy.nyc");

        }
        @AfterSuite
        public void quiteDriver() throws Exception {
        }
}
