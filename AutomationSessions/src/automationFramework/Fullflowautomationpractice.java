package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Fullflowautomationpractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("David");
		WebElement clickme = driver.findElement(By.xpath("//button[contains(text(),'Click Me')]"));
		clickme.click();
		Alert aler = driver.switchTo().alert();
		String folder = aler.getText();
		System.out.println(folder);
		aler.accept();
		Select Speed = new Select(driver.findElement(By.id("speed")));
		Speed.selectByVisibleText("Medium");
		Select selfil = new Select(driver.findElement(By.id("files")));
		selfil.selectByVisibleText("DOC file");
		Select selnu = new Select(driver.findElement(By.id("number")));
		selnu.selectByVisibleText("4");
		Select prod = new Select(driver.findElement(By.id("products")));
		prod.selectByVisibleText("Iphone");
		Select meow = new Select(driver.findElement(By.id("animals")));
		meow.selectByVisibleText("Avatar");
		driver.findElement(By.id("field1")).clear();
		driver.findElement(By.id("field1")).sendKeys("Rajendran");
		WebElement copye = driver.findElement(By.xpath("//button[contains(text(),'Copy Text')]"));
		Actions Dcheck = new Actions(driver);
		Dcheck.doubleClick(copye).build().perform();
		Thread.sleep(3000);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions dragdp = new Actions(driver);
		dragdp.dragAndDrop(drag, drop).build().perform();
		WebElement newdra = driver.findElement(By.xpath("//h2[contains(text(),'Drag and Drop Images')]/following::img[1]"));
		WebElement newdrop = driver.findElement(By.id("trash"));
		Actions abdrag = new Actions(driver);
		abdrag.dragAndDrop(newdra, newdrop).build().perform();
		WebElement dragnew = driver.findElement(By.xpath("//h2[contains(text(),'Drag and Drop Images')]/following::img[2]"));
		WebElement newdrope = driver.findElement(By.id("trash"));
		Actions ddragger = new Actions(driver);
		ddragger.dragAndDrop(dragnew, newdrope).build().perform();
		
		
		
		
	
		
		
		
		
		
		

	}

}
