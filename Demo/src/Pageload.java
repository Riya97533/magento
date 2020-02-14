import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pageload {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.magento.com");
		driver.manage().timeouts().pageLoadTimeout(0,TimeUnit.SECONDS);
		driver.findElement(By.linkText("My Account")).click();

	}

}
