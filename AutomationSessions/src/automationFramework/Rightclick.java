package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement rightclick = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		Actions rc = new Actions(driver);
		rc.contextClick(rightclick).build().perform();
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		Thread.sleep(2000);
		Alert aler = driver.switchTo().alert();
		String rajn = aler.getText();
		System.out.println(rajn);
		aler.accept();
		

	}

}
