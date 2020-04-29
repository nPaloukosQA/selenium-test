package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.*;

public class MakingOrderTest {


        private WebDriver driver;

        @Before
        public void setUp(){
            driver = new ChromeDriver();
        }

        @Test
        public void seleniumExampleTest() throws InterruptedException {
            driver.manage().window().maximize();
            driver.get("http://automationpractice.com/index.php");

            driver.findElement(By.linkText("Women")).click();
            sleep(2000);
            driver.findElement(By.linkText("Faded Short Sleeve T-shirts")).click();
            sleep(2000);
            driver.findElement(By.id("add_to_cart")).click();
            sleep(2000);
            driver.findElement(By.linkText("Proceed to checkout")).click();
            sleep(2000);
            driver.findElement(By.linkText("Proceed to checkout")).click();
            sleep(2000);




        }

        @After
        public void tearDown(){
            driver.close();
        }

}
