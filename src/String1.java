import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class String1 {

	public static void main(String[] args) {
		/*
		 * ChromeOptions chromeOptions = new ChromeOptions();
		 * 
		 * String chromeBinaryLocation =
		 * "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
		 * chromeOptions.setBinary(chromeBinaryLocation);
		 */
		 // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        
      
        
        // Initialize WebDriver object for Chrome with ChromeOptions
        WebDriver driver = new ChromeDriver();
       
        driver.manage().window().maximize();
        
        
        
        
        
       
        
        
        

	}

}
