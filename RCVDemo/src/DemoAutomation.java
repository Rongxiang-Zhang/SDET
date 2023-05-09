import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "D:\\Browserdrivers\\msedgedriver.exe");

//		ChromeDriver driver = new ChromeDriver();
		EdgeDriver driver = new EdgeDriver();
//		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
	}

}
