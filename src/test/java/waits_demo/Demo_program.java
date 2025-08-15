package waits_demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo_program {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		//Implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//input[@id='name']"));
//		ele.sendKeys("Rishab");
		
		// Explicit wait
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement searchbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")));
		searchbox.sendKeys("Selenium");
		
		
		
		
		
		

	}

}
