package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement Double = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
		Thread.sleep(3000);
		Actions dclicked = new Actions(driver);
		dclicked.doubleClick(Double).build().perform();
		Alert aler = driver.switchTo().alert();
		String Dung = aler.getText();
		System.out.println(Dung);
		aler.accept();
	}

}
