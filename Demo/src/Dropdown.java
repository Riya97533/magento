
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://account.magento.com/customer/account/create/");
		WebElement drop=driver.findElement(By.id("customer_company_type"));
		Select s=new Select(drop);
		s.selectByIndex(3);
		s.selectByVisibleText("Tech Partner");
		Thread.sleep(2000);
		s.selectByValue("analyst_media");
		
		
		
		
	}

}
