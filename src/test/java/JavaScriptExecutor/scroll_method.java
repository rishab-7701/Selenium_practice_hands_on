package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// calling the url https://en.wikipedia.org/wiki/Selenium
		driver.get("https://en.wikipedia.org/wiki/Selenium");
		
			// create object of JavaScriptExecutor 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//scroll down by 500 pixels
		js.executeScript("window.scrollBy(0,500);");
		System.out.println("Scrolled down by 500 pixels");
		
		Thread.sleep(2000);
		
		// scroll-down to the bottom of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight);");
		System.out.println("Sucessfully scrolled down to the bottom of the page");
	}
}
