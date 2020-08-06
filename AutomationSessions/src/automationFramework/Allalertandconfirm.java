package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allalertandconfirm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement alertcl = driver.findElement(By.xpath("//button[contains(text(),'Simple Alert')]"));
		alertcl.click();
		Alert  aler = driver.switchTo().alert();
		String doger = aler.getText();
		System.out.println(doger);
		aler.accept();
		Thread.sleep(5000);
		WebElement popup = driver.findElement(By.xpath("//button[contains(text(),'Confirm Pop up')]"));
		popup.click();
		Alert moger = driver.switchTo().alert();
		String giner = moger.getText();
		System.out.println(giner);
		moger.accept();
		Thread.sleep(5000);
		WebElement texter = driver.findElement(By.xpath("//button[contains(text(),'Prompt Pop up')]"));
		texter.click();
		Alert tetmes = driver.switchTo().alert();
		String dunal = tetmes.getText();
		System.out.println(dunal);
		tetmes.sendKeys("Pagal");
		tetmes.accept();
		
	
	}

}

