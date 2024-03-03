import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		driver.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
        
		//Count checkBox
		System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).getSize());
		driver.findElement(By.id("divpaxinfo")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//Assert.asse
		
		
		int i =1;
	while(i<5)
	{
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
	}
	
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.quit();
	

	
	
		}

}
