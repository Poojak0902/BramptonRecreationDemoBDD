package stepdef;


import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import driverManager.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.CustomerServiceAction;

public class CustomerService {

	CustomerServiceAction  csAct= new CustomerServiceAction(DriverManager.getdriver());

	@Given("I want to validate that i am on cs page")
	public void i_want_to_validate_that_i_am_on_cs_page() {
		//String exp="";
	 String actualurl= DriverManager.getdriver().getCurrentUrl();
	 Assert.assertTrue("This is not correct url", actualurl.contains("https://www.brampton.ca/EN/residents/Recreation/Customer-Care/Pages/Welcome.aspx"));
	Reporter.log("This is expected url >> "+ actualurl);
	
	
	
	}

	@When("I land on cs page I see {int} tiles on page")
	public void i_land_on_cs_page_i_see_tiles_on_page(Integer int1) {
		List<WebElement> lst=csAct.csActivities;
		System.out.println("this size of tile >> "+ lst.size());
		Assert.assertTrue("this is not the correct numner ", lst.size()==int1);
	}

	@Then("I want to validate {int} learn more buttons are there")
	public void i_want_to_validate_learn_more_buttons_are_there(Integer int1) {
		List<WebElement> lst=csAct.csbuttons;
		System.out.println("this size of tile >> "+ lst.size());
		Assert.assertTrue("this is not the correct numner ", lst.size()==int1);
	}

	@Given("^I click on Sign up button$")
	public void iClickOnSignUpButton() throws Throwable {
			csAct.click();
			Thread.sleep(3000);
			Assert.assertEquals("https://www.brampton.ca/EN/residents/Recreation/Pages/Email-List-Sign-Up.aspx", DriverManager.getdriver().getCurrentUrl());
	Reporter.log("This is the correct url>> "+ DriverManager.getdriver().getCurrentUrl());
	}

	
	
	

	

	@Then("^I See \"([^\"]*)\" field$")
	public void iSeeField(String email) throws Throwable {
		csAct.sendKeys(csAct.email, email);
	}

	@Then("^I see \"([^\"]*)\" section$")
	public void iSeeSection(String arg1) throws Throwable {
		csAct.sendKeys(csAct.fname, arg1);
	}

	@Then("^I See \"([^\"]*)\" field in the form$")
	public void iSeeFieldInTheForm(String lastname) throws Throwable {
		csAct.sendKeys(csAct.lname, lastname);
	}

	@Then("^I See \"([^\"]*)\" in the form$")
	public void iSeeInTheForm(String arg1) throws Throwable {
		csAct.sendKeys(csAct.postalcode, arg1);
	}

	

}
