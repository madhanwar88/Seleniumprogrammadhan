package testNGFramework;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class shopcluestestng {
	WebDriver driver;
@Test
public void bshopclue() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.shopclues.com/");
	driver.manage().window().maximize();
	Thread.sleep(9000);
	WebElement alow = driver.findElement(By.xpath("//button[text()='Allow']"));
	alow.click();
}
@Test
public void kidere () throws InterruptedException {
   WebElement mobe = driver.findElement(By.xpath("//a[contains(text(),'Mobiles & Electr')]"));
   Actions kico = new  Actions(driver);
   kico.moveToElement(mobe).build().perform();
   Thread.sleep(9000);
   driver.findElement(By.xpath("//a[contains(text(),'Headphones & Earph')]")).click();
   ArrayList <String> openo = new ArrayList <String> (driver.getWindowHandles());
   	driver.switchTo().window(openo.get(1));
   	driver.manage().timeouts().implicitlyWait(9,TimeUnit.SECONDS);
    WebElement pohoe =driver.findElement(By.xpath("//label[contains(text(),'Digimate Earphones & Head')]"));
    pohoe.click();
    WebElement tele = driver.findElement(By.xpath("//div[text()='Price            ']/following::label[3]"));
    tele.click();
    driver.findElement(By.xpath("//span[contains(text(),'Digimate-03  In th')]")).click();
    ArrayList <String> neta = new ArrayList <String>(driver.getWindowHandles());
    driver.switchTo().window(neta.get(2));
    Thread.sleep(5000);
    
    WebElement white = driver.findElement(By.id("//span[@id='348406']"));
    Actions whcli = new Actions(driver);
    whcli.moveToElement(white).click().build().perform();
    WebElement acar = driver.findElement(By.id("//button[@id='add_cart']"));
    acar.click();
    WebElement acacc = driver.findElement(By.xpath("(//span[text()='1'])[1]"));
    acacc.click();
    WebElement plaor = driver.findElement(By.xpath("//div[contains(text(),'Place Order')]"));
    plaor.click();
   }
} 

