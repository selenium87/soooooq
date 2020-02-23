package Adhoc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Site.pages.Forgotofpsswd;
import Site.pages.Home;

public class ut {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  Home forgotlk=new Home(driver);
		Thread.sleep(6000);
		forgotlk.forgotofpsswd();
		Thread.sleep(6000);
		Forgotofpsswd fg=new Forgotofpsswd(driver);
		fg.cancel();
		Thread.sleep(6000);
		forgotlk.forgotofpsswd();
		Thread.sleep(6000);
		fg.forgotfield("slem@gmail.com");
		Thread.sleep(6000);
		fg.searchbt();}
  
@BeforeClass
public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\VAADMIN\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.navigate().to("https://facebook.com");
	
	  driver.manage().window().maximize();
}

@AfterClass
public void afterClass() {
}
}
