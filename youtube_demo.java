package pcm1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class youtube_demo 
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\TR soft\\selenium\\Selenium Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("search")).sendKeys("jab harry met sejal songs");
		Thread.sleep(1000);
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'Safar Full Video')]")).click();
		Thread.sleep(10000);
		driver.get("https://www.google.com/");
		driver.quit();
	}

}
