import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getsfun {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.magento.com");
		WebElement myacct=driver.findElement(By.linkText("My account"));
		System.out.println(myacct.getText());
		System.out.println(myacct.getTagName());
		System.out.println(myacct.getAttribute("href"));
		
		
		
	}

}
