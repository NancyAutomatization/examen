package Examen;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Examen
{
    private WebDriver driver;
    @Before
    public void setUp ()
    {
        //Se coloca la dirección del driver, sea chrome, sea mozilla o edge.
        System.setProperty("webdriver.chrome.driver","src/main/Drivers/Chrome.Drivers/chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com/");

    }

    @Test
    public void Examen () throws InterruptedException
    {
        WebElement inputBuscar = driver.findElement(By.xpath("//input[@name='q']"));
        inputBuscar.click();
        inputBuscar.clear();
        inputBuscar.sendKeys("Alexa");
        inputBuscar.submit();
        Thread.sleep(2000);
        WebElement inputLink = driver.findElement(By.xpath("//div[@class='cfxYMc JfZTW c4Djg MUxGbd v0nnCb']"));
        inputLink.click();
        Thread.sleep(2000);

    }

    @After
    public void tearDown()
    {
        //Cierra el navegador
        driver.quit();
    }

}
