import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws Exception {
		new String();
		
		WebDriver driver1 = (WebDriver) new ChromeDriver ();
		
		((WebDriver) driver1).manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver1.get("https://rahulshettyacademy.com/locatorspractice/");
		driver1.findElement(By.id("inputUsername")).sendKeys("ravi");
		driver1.findElement(By.name("inputPassword")).sendKeys("ravi@1234");
		driver1.findElement(By.className("signInBtn")).click();
	    System.out.println(driver1.findElement(By.cssSelector("p.error")).getText());
	    driver1.findElement(By.linkText("Forgot your password?")).click();
	    driver1.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Prathvi Malviya");
	    driver1.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("prathvimalviya2023@gmail.com");
	    driver1.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("7869116182");
	    Thread.sleep(1000);
	    driver1.findElement(By.className("reset-pwd-btn")).click();
	    System.out.println(driver1.findElement(By.className("infoMsg")).getText());
	    driver1.findElement(By.className("go-to-login-btn")).click();
	    Thread.sleep(2000);
	    driver1.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("rahul");
	    driver1.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rahulshettyacademy");
	    driver1.findElement(By.id("chkboxOne")).click();
	    driver1.findElement(By.xpath("//button[@type='submit']")).click();
	    driver1.findElement(By.xpath("//button[@class='logout-btn']")).click();
	    driver1.close();
	    

	}
	
	public String getpassword(ChromeDriver driver) throws InterruptedException
	
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
