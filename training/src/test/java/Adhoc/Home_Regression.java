package Adhoc;

import org.testng.annotations.Test;

import Site.pages.Forgotofpsswd;
import Site.pages.Home;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Home_Regression {
 public WebDriver driver;
	@Test(priority=1)
  public void Login() {
		Home home=new Home(driver);
		home.Emailidfield("Zoha.kharazmi@yahoo.com");
		home.psswordfield("zk");
		home.loginbt();
		driver.navigate().back();
		}
	/*@Test(priority=2)
	public void forgotid() throws InterruptedException {
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
		fg.searchbt();
	}*/
  @BeforeClass
  @Parameters({"url","browser"})
  

  public void beforeClass(String wbsite, String br) {
	 if(br.equalsIgnoreCase("chrome")){
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\husky\\eclipse-workspace\\training\\src\\main\\Driver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.navigate().to(wbsite);
	 driver.manage().window().maximize();
  }else if(br.equalsIgnoreCase("firefox")) {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\husky\\eclipse-workspace\\training\\src\\main\\Driver\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.navigate().to(wbsite);
	  driver.manage().window().maximize();
  }else{
	  System.out.println("Please check name");
  }
}

  @AfterClass
  public void afterClass() {
  }

}