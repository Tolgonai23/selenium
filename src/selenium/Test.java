package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
  public static void main (String []args) {
	  WebDriver driver; //we initialing ChromeDriver
	 System.setProperty("webdriver.chrome.driver" , "/Users/tolgonaib/eclipse-workspace/selenium/seleniumdriver/chromedriver");//giving location
  
	 driver= new ChromeDriver();
	 
	 driver.get("https://www.google.com/");
	 
    System.out.println(driver.getTitle());
    
    driver.get("https://www.amazon.com/");
    System.out.println(driver.getTitle());
    
 //   WebElement el=driver.findElement(By.id("s-suggestion"));
  
  }
	
}
