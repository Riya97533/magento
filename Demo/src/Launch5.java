import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch5 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("lastamiriya@gmail.com");
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("Welcome1234");
		

	}

}
