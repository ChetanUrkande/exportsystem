package testscript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.findElement(By.name("proceed")).click();
		try
		{
			Alert a=driver.switchTo().alert();
			System.out.println(a.getText());
			a.accept();
		}
		catch (NoAlertPresentException e) {
			System.out.println("No alert");
			
			
		}
	driver.findElement(By.id("login1")).sendKeys("admin");
		
		

	}

}
