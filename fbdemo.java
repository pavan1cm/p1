package pcm1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbdemo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\TR soft\\selenium\\Selenium Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("praveenpradeep14@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("abcpraveenabc");
		driver.findElement(By.id("u_0_b")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.className("_8u _42ef")).click();
		//driver.findElement(By.id("send_sms:AYi9nCvGOfpwU5_H7n0SE8rG2K6wteKLbURahkTQX4lGu6vQOYKgZAGiU4I8nO9r4gw)).click();
	
	}

}