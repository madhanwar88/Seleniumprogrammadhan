package testNGFramework;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Flipcarthandlewindow2 {
	WebDriver driver;
@Test
public void a_pagelaunch() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials\\chromedriver_win32//chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	WebElement clint  = driver.findElement(By.xpath("//button[text()='✕']"));
	clint.click();
	Thread.sleep(6000);		
}
@Test
public void b_searchproduct() throws InterruptedException {
	WebElement necl = driver.findElement(By.xpath("//span[contains(text(),'Sports, Books & More')]"));
	Actions kido = new Actions(driver);
	kido.moveToElement(necl).build().perform();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//a[text()='Cycling']")).click();
	Thread.sleep(8000);
	driver.findElement(By.xpath("//div[contains(text(),'4★ & above')]")).click();
	driver.findElement(By.xpath("(//a[text()='Cycles'])[1]")).click();
	Thread.sleep(8000);
	driver.findElement(By.xpath("//div[text()='HERCULES']")).click();
	Thread.sleep(8000);
	WebElement herc = driver.findElement(By.xpath("//a[contains(text(),'HERCULES Turn')]"));
	herc.click();
	ArrayList <String> newin = new ArrayList <String>(driver.getWindowHandles());
	driver.switchTo().window(newin.get(1));
	Thread.sleep(12000);
	WebElement adcac = driver.findElement(By.xpath("//div[contains(text(),'You might be interested in')]/preceding::button[8]"));
	adcac.click();
	Thread.sleep(8000);
	WebElement plucl = driver.findElement(By.xpath("//button[text()='+']"));
	plucl.click();
	driver.findElement(By.xpath("//div[text()='Remove']/following::button[1]")).click();
	driver.findElement(By.xpath("//span[text()='CONTINUE']/preceding::input[1]")).sendKeys("9884825797");
	Thread.sleep(12000);
	driver.findElement(By.xpath("//span[text()='CONTINUE']")).click();
	Thread.sleep(12000);
	driver.findElement(By.xpath("//span[text()='Login']/preceding::div[2]")).sendKeys("Saibaba@123");
	driver.findElement(By.xpath("//span[text()='Login']")).click();
}
}
