import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Locators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Set up WebDriverManager for ChromeDriver
        WebDriverManager.chromedriver().setup();
        
     // Instantiate ChromeDriver
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
	    System.out.println(driver.findElement(By.tagName("p")).getText());
	    Assert.(driver.findElement(By.tagName("p")).getTagName();


 
		
	}

}
