package homeworks;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Random;

public class Homework_2 extends BaseTest {
    String baseUrl = "https://www.google.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyThatUsershouldTheRegisteredSuccessfully() {

        //  driver.findElement(By.linkText("//div[contains(text(),'I agree')]")).click();
        driver.navigate().to("https://demo.nopcommerce.com/");


        // click on the register link
        // finding web element by xpath
        //fill all the Field
        driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
        // driver.findElement(By.xpath("//label[contains(text(),'Male') ]]")).click();
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Laxmi");
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Prajapati");
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("5");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("April");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1985");


        WebElement emailtext = driver.findElement(By.xpath("//input[@id='Email']"));
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(430);
        emailtext.sendKeys("Raj" + randomInt + "@gmail.com");

        driver.findElement(By.id("Company")).sendKeys("Prime Testing");
        driver.findElement(By.xpath("//label[contains(text(),'Newsletter:')]")).click();
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("raj1234");
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("raj1234");
        driver.findElement(By.xpath("//button[@id='register-button']")).click();
    }
    @After
    public void tearDown() {
        closeBrowser();
    }

}