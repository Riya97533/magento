import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.gmail.com");
	String page=driver.getPageSource();
	System.out.println(page);
		
	}

}
