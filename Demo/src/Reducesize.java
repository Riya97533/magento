import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Reducesize {

	public static void main(String[] args) {
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Dimension dim=driver.manage().window().getSize();
		System.out.println(" the width of the browser is"+dim.width);
		System.out.println("the height of the browser is"+dim.height);
		Dimension ndim=new Dimension(dim.width/3,dim.height/3);
		driver.manage().window().setSize(ndim);
		
	}

}
