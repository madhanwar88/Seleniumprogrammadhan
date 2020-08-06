package automationFramework;

import java.awt.Desktop.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Redifmail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[contains(text(),'Full Name')]/following::input[1]")).sendKeys("Vilan");
		driver.findElement(By.xpath("//td[contains(text(),'Rediffmail ID')]/following::input[1]")).sendKeys("ramklar7848");
		WebElement availab = driver.findElement(By.xpath("//td[contains(text(),'Full Name')]/following::input[3]"));
		availab.click();
		driver.findElement(By.xpath("//td[text()='Password']/following::input[1]")).sendKeys("Maran784@");
		driver.findElement(By.xpath("//td[text()='Password']/following::input[2]")).sendKeys("Maran784@");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[contains(text(),'Alternate')]/following::input[1]")).sendKeys("madhanwar891@gmail.com");
		WebElement inter = driver.findElement(By.xpath("//td[contains(text(),'Alternate')]/following::input[2]"));
		inter.click();
		Select security = new Select(driver.findElement(By.xpath("//td[contains(text(),'Security Question')]/following::select[1]")));
		security.selectByVisibleText("What is your favourite food?");
		driver.findElement(By.xpath("//td[contains(text(),'Enter an Answer')]/following::input[1]")).sendKeys("Aatukal Payaah");
		driver.findElement(By.xpath("//td[contains(text(),'Enter an Answer')]/following::input[2]")).sendKeys("Naali");
		driver.findElement(By.id("mobno")).sendKeys("9884825777");
		Select day = new Select(driver.findElement(By.xpath("//td[contains(text(),'Date of Birth')]/following::select[1]")));
		day.selectByVisibleText("05");
		Select month = new Select(driver.findElement(By.xpath("//td[contains(text(),'Date of Birth')]/following::select[2]")));
		month.selectByVisibleText("JUL");
		Select year = new Select(driver.findElement(By.xpath("//td[contains(text(),'Date of Birth')]/following::select[3]")));
		year.selectByVisibleText("1964");
		WebElement Gender = driver.findElement(By.xpath("//td[text()='Gender']/following::input[2]"));
		Gender.click();
		Select country = new Select(driver.findElement(By.id("country")));
		country.selectByVisibleText("India");
		Select city = new Select(driver.findElement(By.xpath("//td[contains(text(),'City')]/following::select[1]")));
		city.selectByVisibleText("Aligarh");
		Thread.sleep(6000);
		WebElement myaccount = driver.findElement(By.id("Register"));
		myaccount.click();
	
		
		
		
		
	}	

}
