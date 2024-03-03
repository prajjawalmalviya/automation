
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosugested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs");
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		List<WebElement>options= driver.findElements(By.className("ui-menu-item"));
		
	for(WebElement option:options)
	{
	
		if(option.getText().equalsIgnoreCase("India"))
		
		{
	    option.click();
	    break;
		}
	

	}
	
	driver.close();
	driver.quit();
	
	
	}
	
}
	
      	


	





