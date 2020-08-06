package testNGFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class orangewebsite {
	WebDriver driver;
@Test
public void blaunch() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32//chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://orangehrm-demo-6x.orangehrmlive.com/auth/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("txtUsername")).clear();
	driver.findElement(By.id("txtUsername")).sendKeys("admin");
	driver.findElement(By.id("txtPassword")).clear();
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	Thread.sleep(4000);
}
@Test
public void cmainscreen() throws InterruptedException {
	driver.findElement(By.xpath("//span[text()='PIM']")).click();
	driver.findElement(By.xpath("(//span[contains(text(),'Add Employee')])[2]")).click();
	Thread.sleep(15000);
	driver.findElement(By.id("firstName")).sendKeys("mukhilan");
	Actions tabc = new Actions(driver);
	tabc.sendKeys(Keys.TAB).build().perform();
	tabc.sendKeys(Keys.TAB,"maiir").build().perform();
	tabc.sendKeys(Keys.TAB).build().perform();
	tabc.sendKeys(Keys.TAB).build().perform();
	for (int i=0; i<=3; i++) {
		tabc.sendKeys(Keys.ARROW_DOWN).build().perform();
		tabc.sendKeys(Keys.ENTER).build().perform();
	}
	
	WebElement clino = driver.findElement(By.xpath("//label[contains(text(),'Create Login')]"));
	clino.click();
	driver.findElement(By.id("username")).sendKeys("madhandi1021");
	tabc.sendKeys(Keys.TAB).build().perform();
	tabc.sendKeys(Keys.TAB,"Muruganvel@123").build().perform();
	tabc.sendKeys(Keys.TAB,"Muruganvel@123").build().perform();
	tabc.sendKeys(Keys.TAB).build().perform();
	tabc.sendKeys(Keys.TAB).build().perform();
	tabc.sendKeys(Keys.TAB).build().perform();
	for (int i=0; i<3; i++) {
		tabc.sendKeys(Keys.ARROW_DOWN).build().perform();
		}
	tabc.sendKeys(Keys.ENTER).build().perform();
	Thread.sleep(3000);
	driver.findElement(By.id("systemUserSaveBtn")).click();	
}
@Test
public void maiupda () throws InterruptedException {
	Thread.sleep(8000);
	driver.findElement(By.id("middleName")).click();
	driver.findElement(By.id("middleName")).sendKeys("villain");
	driver.findElement(By.id("emp_birthday")).sendKeys("Thu, 07 Jul 1977");
	WebElement mari = driver.findElement(By.id("emp_marital_status_inputfileddiv"));
	mari.click();
	Actions fil = new Actions(driver);
	for (int i=0; i<2; i++) {
		fil.sendKeys(Keys.ARROW_DOWN).build().perform();
	}
	fil.sendKeys(Keys.ENTER).build().perform();
	WebElement genas = driver.findElement(By.id("emp_gender_inputfileddiv"));
	genas.click();
	Actions gcar = new Actions(driver);
	for (int i=0; i<2; i++) {
		gcar.sendKeys(Keys.ARROW_DOWN).build().perform();
	}
	gcar.sendKeys(Keys.ENTER).build().perform();
	WebElement cou = driver.findElement(By.id("nation_code_inputfileddiv"));
	cou.click();
	Actions cofi = new Actions(driver);
	for(int i=0; i<30; i++) {
		cofi.sendKeys(Keys.ARROW_DOWN).build().perform();
	}
	cofi.sendKeys(Keys.ENTER).build().perform();
	driver.findElement(By.id("licenseNo")).sendKeys("DLF0124578");
	Actions tape = new Actions(driver);
	tape.sendKeys(Keys.TAB,"Sun, 02 Jul 2023").build().perform();
	driver.findElement(By.id("nickName")).sendKeys("Jil");
	driver.findElement(By.id("militaryService")).sendKeys("No Service");
	WebElement blor = driver.findElement(By.id("1_inputfileddiv"));
	blor.click();
	Actions blgre = new Actions(driver);
	for(int i=0; i<2; i++) {
		blgre.sendKeys(Keys.ARROW_DOWN).build().perform();
	}
	blgre.sendKeys(Keys.ENTER).build().perform();
	driver.findElement(By.id("5")).sendKeys("Play Station");
	driver.findElement(By.xpath("//button[text()='Next']")).click();
	}
@Test
public void operea () throws InterruptedException {
	Thread.sleep(9000);
	driver.findElement(By.id("joined_date")).sendKeys("Wed, 01 Jul 2020");
	driver.findElement(By.id("date_of_permanency")).sendKeys("Wed, 01 Jul 2020");
	driver.findElement(By.id("job_title_id_inputfileddiv")).click();
	Actions mange = new Actions(driver);
	for(int i=0; i<7; i++) {
		mange.sendKeys(Keys.ARROW_DOWN).build().perform();
	}
	mange.sendKeys(Keys.ENTER).build().perform();
	driver.findElement(By.id("employment_status_id_inputfileddiv")).click();
	Actions der = new Actions(driver);
	for(int i=0; i<3; i++) {
		der.sendKeys(Keys.ARROW_DOWN).build().perform();
	}
	der.sendKeys(Keys.ENTER).build().perform();
	driver.findElement(By.id("job_category_id_inputfileddiv")).click();
	Actions loae = new Actions(driver);
	for(int i=0; i<6; i++) {
		loae.sendKeys(Keys.ARROW_DOWN).build().perform();
	}
	loae.sendKeys(Keys.ENTER).build().perform();
	driver.findElement(By.id("subunit_id_inputfileddiv")).click();
	Actions seti = new Actions(driver);
	for(int i=0; i<2; i++) {
		seti.sendKeys(Keys.ARROW_DOWN).build().perform();
	}
	seti.sendKeys(Keys.ENTER).build().perform();
	driver.findElement(By.id("work_shift_id_inputfileddiv")).click();
	Actions joti = new Actions(driver);
	for(int i=0; i<1; i++) {
		joti.sendKeys(Keys.ARROW_DOWN).build().perform();
	}
	joti.sendKeys(Keys.ENTER).build().perform();
	driver.findElement(By.id("comment")).sendKeys("Form Submission");
	driver.findElement(By.id("9_inputfileddiv")).click();
	Actions regi = new Actions(driver);
	for(int i=0; i<1; i++) {
		regi.sendKeys(Keys.ARROW_DOWN).build().perform();
	}
	regi.sendKeys(Keys.ENTER).build().perform();
	WebElement perci = driver.findElement(By.id("10_inputfileddiv"));
	perci.click();
	Actions muru = new Actions(driver);
	for(int i=0; i<2; i++) {
		muru.sendKeys(Keys.ARROW_DOWN).build().perform();
	}
	muru.sendKeys(Keys.ENTER).build().perform();
	WebElement nier = driver.findElement(By.id("11_inputfileddiv"));
	nier.click();
	Actions temo = new Actions(driver);
	for(int i=0; i<2; i++) {
		temo.sendKeys(Keys.ARROW_DOWN).build().perform();
	}
	temo.sendKeys(Keys.ENTER).build().perform();
	driver.findElement(By.xpath("//button[text()='Save']")).click();	
}
@Test 
public void steoirt () throws InterruptedException {
	Thread.sleep(14000);
	driver.findElement(By.xpath("//label[text()='Veg']")).click();
	driver.findElement(By.xpath("//label[text()='Handball']")).click();
	driver.findElement(By.xpath("//label[text()='Football']")).click();
	driver.findElement(By.xpath("(//button[text()='save'])[2]")).click();
	WebElement upare = driver.findElement(By.xpath("//a[text()='Add']"));
	upare.click();
	Thread.sleep(4000);
	WebElement upoer = driver.findElement(By.id("filename"));
	Thread.sleep(5000);
	upoer.sendKeys("C://Users//Public//Pictures//Sample Pictures//Tulips.jpg");
	driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
}
}
