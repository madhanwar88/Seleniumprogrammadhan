package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class YourlogoTestNG {
	WebDriver driver;
	@Test(priority=1)
	public void browseropen() {
		//browserinitial
		System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		}
	@Test(priority=2)
	public void signin() {
		//clicksignin
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email_create")).sendKeys("july17madj124@gmail.com");
		WebElement create = driver.findElement(By.id("SubmitCreate"));
		create.click();
	}
	@Test(priority=3)
	public void personalInfo() throws InterruptedException {
		//personalinformation
	Thread.sleep(3000);
		WebElement rado = driver.findElement(By.id("uniform-id_gender1"));
		rado.click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Ujala");
		driver.findElement(By.id("customer_lastname")).sendKeys("Blue");
		driver.findElement(By.id("passwd")).sendKeys("Raman&1245");
		Select date = new Select(driver.findElement(By.id("days")));
		date.selectByVisibleText("7  ");
		Select month = new Select(driver.findElement(By.id("months")));
		month.selectByVisibleText("June ");
		Select year = new Select(driver.findElement(By.id("years")));
		year.selectByVisibleText("1988  ");
		WebElement checkbox = driver.findElement(By.id("newsletter"));
		checkbox.click();
	}
	@Test(priority=4)
	public void addressInfo() {
		//addressinformation
		driver.findElement(By.id("firstname")).sendKeys("Ujala");
		driver.findElement(By.id("lastname")).sendKeys("Blue");
		driver.findElement(By.id("company")).sendKeys("westco");
		driver.findElement(By.id("address1")).sendKeys("no 12/45 nadhisivan julai");
		driver.findElement(By.id("address2")).sendKeys("Thilai nagar kula");
		driver.findElement(By.id("city")).sendKeys("Chennai");
		Select city = new Select(driver.findElement(By.id("id_state")));
		city.selectByVisibleText("Arizona");
		driver.findElement(By.id("postcode")).sendKeys("60005");
		driver.findElement(By.id("phone_mobile")).sendKeys("9848452258");
		WebElement Regiter = driver.findElement(By.id("submitAccount"));
		Regiter.click();
	}
		
		
		
		
		

	}


