package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginFacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("u_0_m")).sendKeys("Madan");
		driver.findElement(By.id("u_0_o")).sendKeys("Jagan");
		driver.findElement(By.name("reg_email__")).sendKeys("9098878878");
		driver.findElement(By.id("password_step_input")).sendKeys("rauie3245");
		Select date = new Select(driver.findElement(By.id("day")));
		date.selectByVisibleText("9");
		Select Month = new Select(driver.findElement(By.id("month")));
		Month.selectByVisibleText("Sept");
		Select Year = new Select(driver.findElement(By.id("year")));
		Year.selectByVisibleText("1965");
		WebElement gendertype = driver.findElement(By.xpath("//label[text()='Female']"));
		gendertype.click();
		WebElement Signup = driver.findElement(By.id("u_0_12"));
		Signup.click();
		
		
		
	}

}
