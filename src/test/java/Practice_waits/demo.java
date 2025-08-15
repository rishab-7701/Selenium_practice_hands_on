package Practice_waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//Executing implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Executing explicit wait
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement namebox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='name']")));
        namebox.sendKeys("Rishab Agarwal");

	}

}
