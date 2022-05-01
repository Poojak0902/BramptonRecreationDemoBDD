package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverManager.DriverManager;
import utils.CommonMethods;

public class CustomerServiceAction {

private WebDriver driver;
CommonMethods common = new CommonMethods(DriverManager.getdriver());

public CustomerServiceAction(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
	
}

@CacheLookup
@FindBy(xpath="//*[@class='activityItem']")
public List<WebElement> csActivities;


@CacheLookup
@FindBy(xpath="//*[@class='activityLink']")
public List<WebElement> csbuttons;

@CacheLookup
@FindBy(id="email_address_1")
public WebElement email;

@CacheLookup
@FindBy(id="first_name_1")
public WebElement fname;

@CacheLookup
@FindBy(id="last_name_1")
public WebElement lname;

@CacheLookup
@FindBy(id="postal_code_1")
public WebElement postalcode;


@CacheLookup
@FindBy(xpath="//*[contains(text(),'Sign Up Here')]")
public WebElement signupbutton;


public void click() {
	common.waitforElement(signupbutton);
	common.Scrollele(signupbutton);
	common.higlightement(signupbutton);
	signupbutton.click();
	}

public void sendKeys(WebElement ele, String str) {
	common.waitforElement(ele);
	common.Scrollele(ele);
	common.higlightement(ele);
	ele.sendKeys(str);
	
}

}
