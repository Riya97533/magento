import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbox {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.echoecho.com/javascript4.htm");
		WebElement alert=driver.findElement(By.className("B1"));
		alert.click();
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();

	}

}
