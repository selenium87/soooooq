package Site.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgotofpsswd {
	public WebDriver driver;
@FindBy (id="identify_email")
WebElement forgotid;

@FindBy(name="did_submit")
WebElement searchbutton;
@FindBy(linkText="Cancel")
WebElement cancel;
public Forgotofpsswd (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
public void forgotfield(String id) {
	forgotid.sendKeys(id);
}

public void searchbt() {
	
	searchbutton.click();
}
public void cancel() {
	cancel.click();
}
}