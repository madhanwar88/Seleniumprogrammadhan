package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Redifmailtab {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_detail");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//td[contains(text(),'Full Name')]/following::input[1]")).sendKeys("Duty");
		Actions mail = new Actions(driver);
		mail.sendKeys(Keys.TAB,"igiocase74154").build().perform();
		WebElement check = driver.findElement(By.xpath("//td[contains(text(),'Rediffmail ID')]/following::input[2]"));
		check.click();
		Actions passw = new Actions(driver);
		passw.sendKeys(Keys.TAB,"Ammaappa@123").build().perform();
		passw.sendKeys(Keys.TAB,"Ammaappa@123").build().perform();
		passw.sendKeys(Keys.TAB,"Ammaappa@gmail.com").build().perform();
		WebElement clcker = driver.findElement(By.xpath("//td[contains(text(),'Alternate Email')]/following::input[2]"));
		clcker.click();
		Thread.sleep(2000);
		Actions cre = new Actions(driver);
		cre.sendKeys(Keys.TAB).build().perform();
		Actions mre = new Actions(driver);
		mre.sendKeys(Keys.ARROW_DOWN).build().perform();
		mre.sendKeys(Keys.TAB,"my pay").build().perform();
		mre.sendKeys(Keys.TAB,"Yam").build().perform();
		mre.sendKeys(Keys.TAB,"1563254878").build().perform();
		Select daye = new Select(driver.findElement(By.xpath("//td[contains(text(),'Date of Birth')]/following::select[1]")));
		daye.selectByVisibleText("03");
		Select month = new Select(driver.findElement(By.xpath("//td[contains(text(),'Date of Birth')]/following::select[2]")));
		month.selectByVisibleText("AUG");
		Select yea = new Select(driver.findElement(By.xpath("//td[contains(text(),'Date of Birth')]/following::select[3]")));
		yea.selectByVisibleText("1968");
		WebElement rad = driver.findElement(By.xpath("//td[text()='Gender']/following::input[1]"));
		rad.click();
		Select con = new Select(driver.findElement(By.id("country")));
		con.selectByVisibleText("India");
		
		
		
		
		
		
		
		
		
		

	}

}
