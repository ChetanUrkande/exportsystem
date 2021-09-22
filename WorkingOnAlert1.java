package testscript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnAlert1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
		try{
			Alert a=driver.switchTo().alert();
			a.dismiss();
			String message =driver.findElement(By.id("demo")).getText();
			System.out.println(message);
		}
		catch (NoAlertPresentException e) {
			System.out.println(e);
		}
		driver.findElement(By.linkText("Alert with Textbox")).click();
		driver.findElement(By.cssSelector("button.btn.btn-info")).click();
		try{
			Alert a=driver.switchTo().alert();
			a.sendKeys("admin");
			a.accept();
			String message=driver.findElement(By.id("demo1")).getText();
			System.out.println(message);
		}
		catch (NoAlertPresentException e){
			System.out.println(e);
		}


	}

}
