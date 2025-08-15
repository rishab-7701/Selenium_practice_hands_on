package Automate_Mouse_Events;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_actions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/menu/");
		
		//create Actions class object
		Actions action = new Actions(driver);
		
		//locating the menu item element
		WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Main Item 2']"));
		action.moveToElement(element).perform();
		
		System.out.println("Successfully hovered over the main menu item 2");
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
