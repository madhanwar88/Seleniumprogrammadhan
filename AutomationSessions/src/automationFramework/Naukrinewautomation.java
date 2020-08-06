package automationFramework;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Naukrinewautomation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://my.naukri.com/account/createaccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gclid=Cj0KCQjw3s_4BRDPARIsAJsyoLNFqAJmC7xywudp-B_U5ac-HavjyLCjPKa4SafpZ7l99T3MNg6X5vcaAsq6EALw_wcB");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement fresher = driver.findElement(By.xpath("//button[contains(text(),'I am a Fresher')]"));
		fresher.click();
		driver.findElement(By.id("fname")).sendKeys("Mukhilan");
		driver.findElement(By.id("email")).sendKeys("rajukualn7848@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Create Password')]/following::input[1]")).sendKeys("Jagan@1547");
		driver.findElement(By.xpath("//label[contains(text(),'Create Password')]/following::input[3]")).sendKeys("9884825770");
		driver.findElement(By.xpath("//label[contains(text(),'Create Password')]/following::input[5]")).sendKeys("Chennai");
		Thread.sleep(3000);
		Actions tab = new Actions(driver);
		tab.sendKeys(Keys.TAB).build().perform();
		for(int i=0;i<=24;i++){
		tab.sendKeys(Keys.ARROW_DOWN).build().perform();
		}
		tab.sendKeys(Keys.ENTER).build().perform();
		WebElement Clicker = driver.findElement(By.name("uploadCV"));
		Clicker.sendKeys("C://Users//Public//Pictures//Sample Pictures//New Microsoft Word Document.docx");
		WebElement radio = driver.findElement(By.id("term"));
		radio.click();
		WebElement register = driver.findElement(By.name("basicDetailSubmit"));
		register.click();
		

	}

}
