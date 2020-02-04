package pcm1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class droppabledemo {

	public static void main(String[] args) throws InterruptedException {
		gmaildemo g = new gmaildemo();
		
		//static String source,dest;
		
		System.setProperty("webdriver.chrome.driver","D:\\TR soft\\selenium\\Selenium Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(1000);
		
		driver.switchTo().frame(0);
		//driver.switchTo().frame("NAME OR ID CAN BE DIRECTLY GIVEN HERE");
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		//myprint(driver.findElement((By.id("draggable"))).getText();
		
		WebElement source  = driver.findElement(By.id("draggable"));
		WebElement dest  = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(source,dest).build().perform();
		
		driver.switchTo().defaultContent();
		driver.quit();
	}

}