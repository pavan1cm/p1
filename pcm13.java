package pcm1;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pcm13 {
	public static WebDriver myD;
	public static void open()
	{
		myD.manage().window().maximize();
		myD.get("https://www.google.com/");
		myD.close();
	}
	public static void main(String[] args) {
		
		System.out.println("Enter the browser you want to choose: chrome, firefox");
		Scanner s= new Scanner(System.in);
		String name= s.nextLine();
		pcm13 a=new pcm13();
		if(name.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\TR soft\\selenium\\Selenium Jars\\chromedriver.exe");
			myD = new ChromeDriver();
			a.open();
			
		}
		else if(name.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\TR soft\\selenium\\Selenium Jars\\geckodriver.exe");
			myD = new FirefoxDriver();
			a.open();
		}
		else 
		{
			System.out.println("Enter the valid browser");
		}
	}
}
