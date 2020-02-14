   import org.openqa.selenium.chrome.ChromeDriver;

    public class Gettitle {
	public static void main(String[] args) {
		String url="https://www.gmail.com";
		ChromeDriver driver=new ChromeDriver();
        driver.get(url);
        String title=driver.getTitle();
        System.out.println(title);
        driver.close();
	}

}
