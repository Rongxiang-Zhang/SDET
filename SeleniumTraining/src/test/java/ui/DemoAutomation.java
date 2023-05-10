package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.edge.EdgeDriver;

public class DemoAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "D:\\Browserdrivers\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
//		EdgeDriver driver = new EdgeDriver();
//		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://www.ebay.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("mobile");
		driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
		driver.close();
		//driver.quit();
	}

}
