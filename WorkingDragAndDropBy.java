package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingDragAndDropBy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Actions builder=new Actions(driver);
		driver.switchTo().frame(0);
		WebElement source=driver.findElement(By.id("draggable"));
		Point p =source.getLocation();
		builder.dragAndDropBy(source, p.getX()+100,p.getY()+130).perform();
		

	}

}
