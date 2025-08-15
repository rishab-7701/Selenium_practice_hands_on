package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_actions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.irctc.co.in/nget/train-search");
		
		WebElement ele = driver.findElement(By.xpath("//a[@aria-label='Menu Train']//strong[contains(text(),'TRAINS')]"));
		
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform(); // mouse hovers to the train section in the top bar
		
		//Right-Click Context click
		action.contextClick(driver.findElement(By.xpath("//input[@class='ng-tns-c58-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']"))).perform();
		
	}

}
