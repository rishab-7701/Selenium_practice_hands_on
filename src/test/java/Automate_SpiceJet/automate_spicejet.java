package Automate_SpiceJet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automate_spicejet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://book.spicejet.com/");
		
		//Handle From city using xpath locator
		WebElement FromDropDown = driver.findElement(By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT']"));
		FromDropDown.click();
		
		// now after getting the drop down menu option I'll select the city
		WebElement fromCity = driver.findElement(By.xpath("//a[normalize-space()='Pune (PNQ)']"));
		fromCity.click();
		Thread.sleep(1000); // let drop-down to settle
       
		
		// Handle to city
		WebElement toCity = driver.findElement(By.xpath("(//a[@value='BOM'][normalize-space()='Mumbai (BOM)'])[2]"));
		toCity.click();
		
		
		//selecting date from datepicker
		WebElement date = driver.findElement(By.xpath("(//a[@href='#'][normalize-space()='6'])[1]"));
		date.click();
		
		//Handling passenger through dropdown
		WebElement passengerDropdown = driver.findElement(By.xpath("//div[@id='divpaxinfo']"));
		passengerDropdown.click();
		
		//clicking on the adult drop-down menu
		WebElement adult = driver.findElement(By.xpath("//*[@id=\"ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT\"]/option[2]"));
		adult.click();
		
		// Now finally we need to click on search to search for the result we need
		WebElement search = driver.findElement(By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_ButtonSubmit']"));
		search.click();
		
		System.out.println("SpiceJet flight automation search completed");
		driver.quit();
		
		
	}

}
