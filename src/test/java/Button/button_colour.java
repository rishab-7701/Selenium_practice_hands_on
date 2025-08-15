package Button;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class button_colour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
       driver.get("https://www.flashscore.in/tennis/");
       
       WebElement us_button = driver.findElement(By.xpath("//div[@title='WTA - SINGLES: US Open']//a[@class='leftMenu__href']//*[name()='svg']"));
       us_button.click();
       
       String bgcolor = us_button.getCssValue("background");
       System.out.println("Background color is:"+bgcolor);
       
	}

}
