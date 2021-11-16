package homeworks;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Homework_3 extends BaseTest {
    String baseUrl ="http://automationpractice.com/index.php/";
    @Before
    public void setup()
    {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldEnterCorrectDetails(){
       // Click on sign In
        driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
        //driver.findElement(By.xpath("//h3[contains(text(),'Already registered?')]"));
        driver.findElement(By.id("email")).sendKeys("laxmi123@gmail.com");
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("raj1234");
        driver.findElement(By.name("SubmitLogin")).click();
       // driver.findElement(By.xpath("//p[contains(text(),'THere is 1 error']"));
        String expectedMessage="There is 1 error";
        WebElement message= driver.findElement(By.xpath("//p[contains(text(),'There is 1 error')]"));
        String actualMessage= message.getText();
        Assert.assertEquals("There is 1 error displayed",expectedMessage,actualMessage);
    }
    @After
    public void tearDown(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

    }

}
