import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch7 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.magento.com");
		WebElement myacct=driver.findElement(By.linkText("My Account"));
		myacct.click();
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("lastamiriya@gmail.com");
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("Welcome12345");
		WebElement login=driver.findElement(By.id("send 2"));
	     login.click();
	     WebElement logout=driver.findElement(By.linkText("logout"));
	     logout.click();
	     
		
		
	}

}
