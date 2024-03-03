import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) throws Exception {
		new String();
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new  EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("ravi");
		driver.findElement(By.name("inputPassword")).sendKeys("ravi@1234");
		driver.findElement(By.className("signInBtn")).click();
	    System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	    driver.findElement(By.linkText("Forgot your password?")).click();
	    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Prathvi Malviya");
	    driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("prathvimalviya2023@gmail.com");
	    driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("7869116182");
	    Thread.sleep(1000);
	    driver.findElement(By.className("reset-pwd-btn")).click();
	    System.out.println(driver.findElement(By.className("infoMsg")).getText());
	    driver.findElement(By.className("go-to-login-btn")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("rahul");
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rahulshettyacademy");
	    driver.findElement(By.id("chkboxOne")).click();
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
	    driver.close();
	    driver.quit();

	}
	
	public String getpassword(EdgeDriver driver) throws InterruptedException
	
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
	    driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
	    driver.findElement(By.className("reset-pwd-btn")).click();
	    String passwordText=driver.findElement(By.className("infoMsg")).getText();
	    passwordText.split("'");
		return passwordText;
		


		
		
	}

}
