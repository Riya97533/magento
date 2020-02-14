import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booleanfun {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com");
		WebElement roundtrip=driver.findElement(By.id("RoundTrip"));
		if(roundtrip.isSelected()==true)
		{
			System.out.println("RoundTrip is selected");
		}
		else
		{
			roundtrip.click();
			
		}
		WebElement returndate=driver.findElement(By.id("ReturnDate"));
		if(returndate.isDisplayed()==true)
		{
			returndate.sendKeys("Sat,7 Mar,2020");
			
		}
		else
		{
			System.out.println("Round on is not getting displayed");
			
		}
		
		
		
	}

}
