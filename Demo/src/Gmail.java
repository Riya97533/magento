import org.openqa.selenium.chrome.ChromeDriver;
public class Gmail {

	public static void main(String[] args) {
		String url="https://www.gmail.com";
		ChromeDriver driver=new ChromeDriver();
        driver.get(url);
		
	}

}
