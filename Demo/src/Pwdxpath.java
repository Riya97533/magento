import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pwdxpath {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='pass'][@class='inputtext login_form_input_box']")).sendKeys("1234");
	}

}
