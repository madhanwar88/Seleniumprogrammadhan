package automationFramework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Timesofindaiauto {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.timesjobs.com/candidate/register.html?siteparams=3p9901&utm_source=google&utm_medium=cpc&utm_campaign=search&outSource=versionA_B&gclid=Cj0KCQjw3s_4BRDPARIsAJsyoLP97kHkpJp92gud0ewWgp0W-Ct5Y-YZVo_OZ8W7knOIuZLy-52l1t0aApaIEALw_wcB");
	driver.manage().window().maximize();
	driver.findElement(By.id("emailAdd")).sendKeys("madharwr74@gmail.com");
	driver.findElement(By.id("passwordField")).sendKeys("dererr@1548");
	driver.findElement(By.id("retypePassword")).sendKeys("dererr@1548");
	driver.findElement(By.id("mobNumber")).sendKeys("9848252124");
	Thread.sleep(3000);
	 use up and down arrow enter
	Select jober = new Select(driver.findElement(By.id("defLabelSpnId")));
	jober.selectByVisibleText("Human Resource / IR / Training & Development");
	driver.findElement(By.id("cboWorkExpYear")).sendKeys("12");
	driver.findElement(By.id("cboWorkExpMonth")).sendKeys("4");
	Select work = new Select(driver.findElement(By.id("curLocation")));
	work.selectByVisibleText("Bhubaneshwar");
	WebElement chosefile = driver.findElement(By.id("resumeFile_basic"));
	chosefile.sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures//New Microsoft Word Document.doc");
	WebElement clicked = driver.findElement(By.id("basicSubmit"));
	clicked.click();
	
	
	
	
	
	

	}

}
