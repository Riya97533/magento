import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///D:/new1.html");
		driver.findElement(By.xpath("html/body/input[2]")).sendKeys("1234");

	}

}
