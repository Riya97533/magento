import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail1 {

	public static void main(String[] args) throws Exception {
		String url="https://www.gmail.com";
		ChromeDriver driver=new ChromeDriver();
        driver.get(url);
		Thread.sleep(5000);
		driver.close();
		
	}

}
