package automationFramework;

import java.security.Security;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fullfacelogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("u_0_m")).sendKeys("Rajan");
		driver.findElement(By.id("u_0_o")).sendKeys("Madhuann");
		driver.findElement(By.name("reg_email__")).sendKeys("98848257891");
		driver.findElement(By.name("reg_passwd__")).sendKeys("guji@123");
		Select date = new Select(driver.findElement(By.id("day")));
		date.selectByVisibleText("8");
		Select Month = new Select(driver.findElement(By.id("month")));
		Month.selectByVisibleText("10");
		Select Year = new Select(driver.findElement(By.id("year")));
		Year.selectByVisibleText("1957");
		WebElement gendertype = driver.findElement(By.xpath("//label[text()='Female']"));
		gendertype.click();
		driver.findElement(By.id("u_0_12")).click();		
	

	}

}
