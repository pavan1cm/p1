package pcm1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googledemo {
	public static void verify(String s)
	{
		System.out.println(s);
		if(s.equals("wikipedia"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\TR soft\\selenium\\Selenium Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("wikipedia");
		Thread.sleep(1000);
		driver.findElement(By.id("resultStats")).click();
		String stat = driver.findElement(By.id("gsr")).getText();
        driver.quit();
        System.out.println(stat);*/
		driver.get("https://www.google.com/");
		//driver.findElement(By.name("q")).sendKeys("wikipedia");
		driver.findElement(By.xpath("//input[@class = 'gLFyf gsfi']")).sendKeys("wikipedia");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click();
		String s;
		s = driver.findElement(By.name("q")).getAttribute("value");
		verify(s);
		driver.quit();
	}

}
