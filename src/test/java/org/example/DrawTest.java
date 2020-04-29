package org.example;

import com.google.common.base.Function;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.*;
import static java.util.concurrent.TimeUnit.SECONDS;

public class DrawTest {

    private WebDriver driver;

    @Before
    public void setUp(){driver = new ChromeDriver();}

    @Test
    public void seleniumDrawTest() throws InterruptedException{
        driver.manage().window().maximize();
        sleep(1000);
        driver.get("https://jspaint.app/");
        sleep(2000);

        Actions action = new Actions(driver);
        action.moveByOffset(167,225).clickAndHold().
                moveByOffset(0,100).
                moveByOffset(-50,0).
                moveByOffset(0,-100).
                moveByOffset(50,0).
                moveByOffset(-25,-25).
                moveByOffset(-25,25).release().perform();
        sleep(5000);
    }

//    @Test
//    public void explitWaitExample(){
//        driver.get("http://www.google.com");
//        WebElement searchBar = (new WebDriverWait(driver, 10))
//                .until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
//        assertTrue(searchBar.isDisplayed());
//    }

    @Test
    public void  fluentExample(){
        driver.get("http://www.google.com");
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(30, SECONDS)
                .pollingEvery(5, SECONDS)
                .ignoring(NoSuchElementException.class);
        WebElement searchBar = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver webDriver) {
                return driver.findElement(By.name("q"));
            }
        });
    }

    @After
    public void tearDown() {driver.close();}
}
