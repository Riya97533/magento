
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Launch9 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		WebElement drop=driver.findElement(By.id("month"));
		Select s=new Select(drop);
		s.selectByIndex(12);
		Thread.sleep(2000);
		s.selectByValue("Dec");
		
		
		
		
	}

}