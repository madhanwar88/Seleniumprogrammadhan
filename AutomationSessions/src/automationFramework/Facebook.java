package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//hit url
		driver.get("https://www.facebook.com/");
		//to maximize
		driver.manage().window().maximize();
		
		// to type the eamil
		driver.findElement(By.id("email")).sendKeys("madhanwar45@gmail.com");
		
		//to type password
		driver.findElement(By.name("pass")).sendKeys("rammu@123");
		driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
		Thread.sleep(3000);
		String facebookurl=driver.getCurrentUrl();
		System.out.println(facebookurl);
		
		
		
		

	}

}
