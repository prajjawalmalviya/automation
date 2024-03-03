import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	
	
	

	public static void main(String[] args)  throws InterruptedException{ 
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs");
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='JLR']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='JSA']")).click();
		driver.quit();
		
		

	}
	

	
	

}
