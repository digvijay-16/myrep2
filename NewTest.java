package mavpk1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class NewTest {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\batch 4760 java\\chromedriver.exe");
	  WebDriver w=new ChromeDriver();
  }
}
