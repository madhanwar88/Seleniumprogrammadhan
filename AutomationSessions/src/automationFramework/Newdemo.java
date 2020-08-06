package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Newdemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("first_name")).sendKeys("duraim");
		driver.findElement(By.name("last_name")).sendKeys("palan");
		driver.findElement(By.name("email")).sendKeys("madhusudh7848@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("845021545");
		driver.findElement(By.name("address")).sendKeys("arumugam street");
		Thread.sleep(2000);
		driver.findElement(By.name("city")).sendKeys("chennai");
		Select sate = new Select(driver.findElement(By.name("state")));
		sate.selectByVisibleText("Kentucky");
		driver.findElement(By.name("zip")).sendKeys("60012");
		driver.findElement(By.name("website")).sendKeys("Manual Testing");
		WebElement radio = driver.findElement(By.name("hosting"));
		radio.click();
		driver.findElement(By.name("comment")).sendKeys("thamzhi");
		WebElement send = driver.findElement(By.xpath("//label[contains(text(),'Project Description')]/following::textarea"));
		send.click();
		
		

	}

}
