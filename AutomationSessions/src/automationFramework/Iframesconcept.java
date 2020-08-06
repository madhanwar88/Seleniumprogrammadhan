package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframesconcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://nunzioweb.com/index.shtml");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		int iframecount =driver.findElements(By.tagName("iframe")).size();
		System.out.println(iframecount);
		driver.switchTo().frame("oddcouple");
		String iframetext = driver.findElement(By.xpath("//div[contains(text(),'always liked')]")).getText();
		System.out.println(iframetext);
	}

}
