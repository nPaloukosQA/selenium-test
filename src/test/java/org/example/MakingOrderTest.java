package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.sleep;

public class MakingOrderTest {


        private WebDriver driver;

        @Before
        public void setUp(){
            driver = new ChromeDriver();
        }

        @Test
        public void seleniumExampleTest() {
            driver.get("http://automationpractice.com/index.php");
        }

        @After
        public void tearDown(){
            driver.close();
        }

}
