package homeworks;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Homework_4 extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

   @Before
    public void setup()
    {
        openBrowser(baseUrl);
    }

    @Test
    public void VerifyTheLoginPanel() {
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

        String expectedMessage = "Welcome Jessica";
        WebElement message = driver.findElement(By.xpath("//b[contains(text(),'Welcome Jessica')]"));
        String actualMessage = message.getText();
        Assert.assertEquals("Welcome Jessica", expectedMessage, actualMessage);
        driver.findElement(By.xpath("//a[@id='welcome']")).click();
        driver.findElement(By.xpath("//div[(text(),'Logout')]")).click();

        String expectedMessage1 = "LOGIN Panel";
        WebElement message1 = driver.findElement(By.xpath("//div[@id='logInPanelHeading']"));
        String actualMessage1 = message1.getText();
        Assert.assertEquals("LOGINPanel Heading", expectedMessage, actualMessage);

    }

    @After
    public void tearDown() {

    }
}

