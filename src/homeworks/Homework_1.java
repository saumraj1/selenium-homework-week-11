package homeworks;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Homework_1 extends BaseTest {

    String baseUrl = "https://www.google.com/";

    @Before
    public void setup() {

        openBrowser(baseUrl);
    }

    @Test
    public void VerifyUsershouldabletoSeeComputer() {
        driver.navigate().to("https://www.google.com/");
        driver.findElement(By.xpath("//div[contains(text(),'I agree')]")).click();
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div/div[1]/a/h3")).click();

        driver.findElement(By.linkText("Computers")).click();
        String expectedMessage = "Computers";
        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Computers')]"));
        String actualMessage = message.getText();
        Assert.assertEquals("Computer page not displayed", expectedMessage, actualMessage);
    }
    @Test
    public void VerifyUsershouldabletoSeeElectronics() {
        driver.navigate().to("https://www.google.com/");
        driver.findElement(By.xpath("//div[contains(text(),'I agree')]")).click();
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div/div[1]/a/h3")).click();

        driver.findElement(By.linkText("Electronics")).click();
        driver.navigate().to("https://www.google.com/");
        String expectedMessage = "Electronics";
        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Electronics')]"));
        String actualMessage = message.getText();
        Assert.assertEquals("Electronics page not displayed", expectedMessage, actualMessage);
    }
    @Test
    public void VerifyUsershouldabletoSeeApparel() {
        driver.navigate().to("https://www.google.com/");
        driver.findElement(By.xpath("//div[contains(text(),'I agree')]")).click();
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div/div[1]/a/h3")).click();

        driver.findElement(By.linkText("Apparel")).click();
        String expectedMessage = "Apparel";
        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Apparel')]"));
        String actualMessage = message.getText();
        Assert.assertEquals("Apparel page not displayed", expectedMessage, actualMessage);
    }
    @Test
    public void VerifyUsershouldabletoSeeDigitalDownloads() {
        driver.navigate().to("https://www.google.com/");
        driver.findElement(By.xpath("//div[contains(text(),'I agree')]")).click();
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div/div[1]/a/h3")).click();

        driver.findElement(By.linkText("Digital downloads")).click();
        String expectedMessage = "Digital downloads";
        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));
        String actualMessage = message.getText();
        Assert.assertEquals("Digital downloads page not displayed", expectedMessage, actualMessage);
    }
    @Test
    public void VerifyUsershouldabletoSeeBooks() {
        driver.navigate().to("https://www.google.com/");
        driver.findElement(By.xpath("//div[contains(text(),'I agree')]")).click();
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div/div[1]/a/h3")).click();

        driver.findElement(By.linkText("Books")).click();
        driver.navigate().to("https://www.google.com/");
        String expectedMessage = "Books";
        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Books')]"));
        String actualMessage = message.getText();
        Assert.assertEquals("Books page not displayed", expectedMessage, actualMessage);
    }

    @Test
    public void VerifyUsershouldabletoSeeGiftCards() {
        driver.navigate().to("https://www.google.com/");
        driver.findElement(By.xpath("//div[contains(text(),'I agree')]")).click();
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div/div[1]/a/h3")).click();

        driver.findElement(By.linkText("Gift Cards")).click();
        String expectedMessage = "Gift Cards";
        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));
        String actualMessage = message.getText();
        Assert.assertEquals("Gift Cards page not displayed", expectedMessage, actualMessage);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }


    }



