package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multiplemouseover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement Closecl = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		Closecl.click(); 
		WebElement Elect = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Thread.sleep(2000);
		Actions Mous = new Actions(driver);
		Mous.moveToElement(Elect).build().perform();
		Thread.sleep(3000);
		WebElement Apple = driver.findElement(By.xpath("//a[text()='Apple']"));
		Apple.click();
		Thread.sleep(1000);
		WebElement Baby = driver.findElement(By.xpath("//span[contains(text(),'Baby & Kids')]"));
		Actions Basi = new Actions(driver);
		Basi.moveToElement(Baby).build().perform();
		WebElement Toys = driver.findElement(By.xpath("//a[contains(text(),'Toy Guns')]"));
		Toys.click();
		

	}

}
