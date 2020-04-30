package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
            WebElement enteringMail = driver.findElement(By.name("email_create"));
            enteringMail.sendKeys("gmailll@nickk.com");
            enteringMail.sendKeys(Keys.ENTER);
            sleep(4000);

            driver.findElement(By.id("id_gender1")).click();
            sleep(200);

            WebElement fName = (new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(By.id("customer_firstname")));
            fName.sendKeys("Bob");
            sleep(200);

            WebElement lName = (new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(By.id("customer_lastname")));
            lName.sendKeys("Silent");
            sleep(200);

            WebElement psw = (new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(By.id("passwd")));
            psw.sendKeys("strong1");
            sleep(200);

            WebElement adr = (new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(By.id("address1")));
            adr.sendKeys("Road Srt 32");
            sleep(200);

            WebElement city = (new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(By.id("city")));
            city.sendKeys("New Yolk");
            sleep(200);

            WebElement state = (new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(By.id("id_state")));
            state.sendKeys("c");
            sleep(200);

            WebElement zip = (new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(By.id("postcode")));
            zip.sendKeys("00012");
            sleep(200);

            WebElement pnum = (new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(By.id("phone_mobile")));
            pnum.sendKeys("963590255");
            sleep(200);

            driver.findElement(By.id("submitAccount")).click();
            sleep(1000);

            driver.findElement(By.linkText("processAddress")).click();
            sleep(1000);
            driver.findElement(By.id("cgv")).click();
            driver.findElement(By.linkText("processCarrier")).click();
            sleep(2000);

            driver.findElement(By.linkText("Pay by bank wire (order processing will be longer)")).click();
            driver.findElement(By.xpath("//p[@id='cart_navigation']/button/span")).click();
            sleep(1000);





        }

        @After
        public void tearDown(){
            driver.close();
        }

}
