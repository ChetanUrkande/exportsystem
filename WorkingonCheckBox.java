package testscript;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingonCheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		List<WebElement> checkbox=driver.findElements(By.cssSelector("input[type='checkbox']"));
		for(WebElement ch:checkbox)
		{
			String value=ch.getAttribute("value");
					if(value.equalsIgnoreCase("Hockey"))
					{
						if(!ch.isSelected())
						{
							ch.click();
							break;
						}
					}
			
				
		}
		driver.close();

	}

}
