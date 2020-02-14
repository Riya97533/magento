import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Promptbox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.echoecho.com/javascript4.htm");
		WebElement alert=driver.findElement(By.className("B3"));
		alert.click();
		Thread.sleep(3000);
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.sendKeys("Welcome1234");
		Thread.sleep(3000);
		a.accept();
	}

}
