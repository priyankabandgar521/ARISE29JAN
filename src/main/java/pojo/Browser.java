package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {
	public static WebDriver launchBrowser(String url) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Documents\\chromedriver-win64\\chromedriver.exe");	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get(url);
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		//this wait applicable for all the elements and max time duration for wait is 5sec.	
		return driver;
		
		
}
}














