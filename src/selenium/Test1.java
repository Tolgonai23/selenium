package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/tolgonaib/eclipse-workspace/SpiceJet/seleniumdriver/chromedriver");
		driver=new ChromeDriver();
        driver.get("https://www.bestbuy.com/");
        System.out.println(driver.getTitle());
        driver.get("https://www.bestbuy.com/site/searchpage.jsp?st=airpods");
        System.out.println(driver.getTitle());
	}

}
