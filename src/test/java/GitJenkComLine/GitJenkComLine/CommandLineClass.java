package GitJenkComLine.GitJenkComLine;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommandLineClass {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		
		/*
		 * String browser = System.getProperty("browser"); String url =
		 * System.getProperty("url");
		 * 
		 * if(browser.equalsIgnoreCase("chrome")) {
		 * WebDriverManager.chromedriver().setup(); driver= new ChromeDriver(); } else
		 * if(browser.equalsIgnoreCase("firefox")) {
		 * WebDriverManager.firefoxdriver().setup(); driver = new FirefoxDriver(); }
		 * driver.get(url);
		 */
		 
		
		  WebDriverManager.chromedriver().setup(); 
		  driver= new ChromeDriver();
		  driver.get("https://www.google.com/");
		 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
	}
	
	
	@Test
	public void search() {
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("abcd");	
	}
	
	
	@AfterTest
	public void tearDown() {
		//driver.quit();	
	}

}
