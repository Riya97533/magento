import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ISenable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com");
		WebElement search=driver.findElement(By.id("SearchBtn"));
		if(search.isEnabled()==true)
		{
			search.click();

	}
		else
		{
			System.out.println("search flight is not in enabled mode");
			}
		}

}
