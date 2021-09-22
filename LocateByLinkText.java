package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByLinkText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://WWW.google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Gmail")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Images")).click();
		String title=driver.getTitle();
		if(title.equals("Google Images"))
		{
			System.out.println("Pass");
		}
		else
			System.out.println("Fail");
		driver.navigate().back();
		driver.findElement(By.partialLinkText("How Search")).click();
		driver.close();
		
		

	}

}
