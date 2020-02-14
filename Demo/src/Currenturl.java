import org.openqa.selenium.chrome.ChromeDriver;

    public class Currenturl {
	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.gmail.com");
	String curl=driver.getCurrentUrl();
	System.out.println(curl);
    driver.close();
	}

}
