package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonsite {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement mob = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		mob.click();
		Thread.sleep(2000);
		WebElement oneplus = driver.findElement(By.xpath("(//span[text()='Oppo'])[2]"));
		oneplus.click();
		

	}

}
