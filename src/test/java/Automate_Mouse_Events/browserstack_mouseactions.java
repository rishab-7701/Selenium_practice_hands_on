package Automate_Mouse_Events;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class browserstack_mouseactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.browserstack.com/");
		
		//Create an instance of Action class
		Actions action = new Actions(driver);
		
		// Now locate the web element in the browser where we need to hover
		WebElement ele = driver.findElement(By.xpath("//button[@id='products-dd-toggle']"));
		action.moveToElement(ele).perform();

	}

}
