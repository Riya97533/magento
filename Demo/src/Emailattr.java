import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Emailattr {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("lastamiriya@gmail.com");

	}

}
