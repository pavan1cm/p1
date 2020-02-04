package pcm1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class HomePage {
	
	public static WebDriver myD;
	public static String URL;
	
	
	
	public static void welcome()
	{
		System.out.println("Enter the browser you want to choose: chrome, firefox");
		Scanner s= new Scanner(System.in);
		String name= s.next();
	
		
		if(name.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\TR soft\\selenium\\Selenium Jars\\chromedriver.exe");
			myD = new ChromeDriver();
		}
		else if(name.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\TR soft\\selenium\\Selenium Jars\\geckodriver.exe");
			myD = new FirefoxDriver();
		}
		else 
		{
			System.out.println("Enter the valid browser");
		}
	}
	
	
	public static void open() throws IOException
	{
		myD.manage().window().maximize();
		myD.get("https://www.google.com");
		//screenshot();
		URL = myD.getCurrentUrl();
		System.out.println("You are in : "+URL);
	}
	public static String verify() throws IOException
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the URL : ");
		String v = s.next();
		
		if(v.equals(URL))
			return "PASS";
		else
		{
			screenshot();
			return "FAIL";
		}
	}
	public static void close()
	{
		myD.close();
	}
	
	public static void screenshot() throws IOException
	{
		File scrFile = (File) ((TakesScreenshot)myD).getScreenshotAs(OutputType.FILE);
		Files.copy(scrFile, new File("D:\\TR soft\\selenium\\Selenium Jars\\1.jpg"));
		
	}
}