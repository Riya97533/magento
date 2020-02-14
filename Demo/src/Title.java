import java.util.Scanner;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {

	public static void main(String[] args) {
		System.out.println("Enter the title");
		Scanner scan=new Scanner(System.in);
		String eTitle=scan.next();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		String aTitle=driver.getTitle();
		if(eTitle.equals(aTitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
			
		}

	}

}
