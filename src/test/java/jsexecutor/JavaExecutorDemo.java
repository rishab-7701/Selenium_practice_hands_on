package jsexecutor;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaExecutorDemo {

	public static void main(String[] args) {
      WebDriver driver = new ChromeDriver();
      
      driver.get("https://testautomationpractice.blogspot.com/");
      driver.manage().window().maximize();
      
//      driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Rishab");
      
      WebElement inputbox = driver.findElement(By.xpath("//input[@id='name']"));
      JavascriptExecutor js = (JavascriptExecutor) driver;
      
      js.executeScript("arguments[0].setAttribute('value','Rishab')", inputbox);
      
      WebElement emailbox = driver.findElement(By.xpath("//input[@id='email']"));
      js.executeScript("arguments[0].setAttribute('value','rishab@gmail.com')", emailbox);
      
      
	}

}
