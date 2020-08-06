package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class bigbasket {
	WebDriver driver;
@Test
public void pagelaunch() {
	System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.bigbasket.com/");
	driver.manage().window().maximize();
}
@Test
public void searchit() {
	driver.findElement(By.id("input")).sendKeys("oil");
	Actions tab = new Actions(driver);
	tab.sendKeys(Keys.ENTER).build().perform();
}
@Test
public void oilcl() throws InterruptedException {
	Thread.sleep(3000);
	WebElement yennai = driver.findElement(By.xpath("//a[contains(text(),'Refined - Sunflower Oil')]"));
	yennai.click();
	WebElement baske = driver.findElement(By.xpath("//span[contains(text(),'ADD TO BASKET')]"));
	baske.click();
}
@Test
public void mousove() {
	WebElement mouover = driver.findElement(By.xpath("//span[contains(text(),'My Basket')]"));
	Actions mocli = new Actions(driver);
	mocli.moveToElement(mouover).build().perform();
}
}