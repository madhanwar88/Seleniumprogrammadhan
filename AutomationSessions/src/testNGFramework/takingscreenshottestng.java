package testNGFramework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class takingscreenshottestng {
	WebDriver driver;
@Test
public void youlosin() throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32//chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	driver.findElement(By.className("login")).click();
	driver.findElement(By.id("email_create")).sendKeys("maioie1245");
	driver.findElement(By.id("SubmitCreate")).click();
	Thread.sleep(2000);
	getscreenshot();
	driver.findElement(By.id("email")).sendKeys("rioer@gmier.com");
	driver.findElement(By.id("passwd")).sendKeys("12451");
	driver.findElement(By.id("SubmitLogin")).click();
	Thread.sleep(2000);
	getscreenshot();
}
public void getscreenshot() throws IOException {
	File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("H:\\Screenshots\\Screenshot" +System.currentTimeMillis()+ ".png"));
	
}
}
