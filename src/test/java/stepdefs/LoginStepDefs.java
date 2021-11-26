package stepdefs;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


//import io.cucumber.datatable.DataTable;



public class LoginStepDefs {
	
		WebDriver driver = Baseclass.driver;
	
	
		@Given("^User has opened swaglabs$")
		public void user_has_opened_swaglabs() throws Throwable {

	        driver.get("https://www.saucedemo.com/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
	        
	    }
		
		//Positive login
		
	    @When("^User has entered correct \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_has_entered_correct_something_and_something(String username, String password) throws Throwable {
		 
		 WebElement UserName = driver.findElement(By.name("user-name"));
		 UserName.sendKeys(username);
		 
		 WebElement Password = driver.findElement(By.name("password"));
		 Password.sendKeys(password);
		 
		 
	    }

	    
	    @Then("^Validating if that user has been  navigated to product page$")
	    public void validating_if_that_user_has_been_navigated_to_product_page() throws Throwable {
	    	
	    	WebElement title = driver.findElement(By.xpath("//span[@class='title']"));
	    	Assert.assertEquals(title.getText(), "PRODUCTS");
	    }

	   
	    @And("^User click on Login Button$")
	    public void user_click_on_login_button() throws Throwable {
	    	
	    	WebElement login_button = driver.findElement(By.id("login-button"));
			login_button.click();
	    }
	    
	    //Negative login
	    
	    @When("^User has entered wrong \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_has_entered_wrong_something_and_something(String username, String password) throws Throwable {
	    	
	    	WebElement USerName = driver.findElement(By.name("user-name"));
	    	USerName.sendKeys(username);
	    	
			WebElement Password = driver.findElement(By.name("password"));
			Password.sendKeys(password);
			 
	    }

	    @Then("^Validating if that user is  getting \"([^\"]*)\"$")
	    public void validating_if_that_user_is_getting_something(String error) throws Throwable {
	    	
	    	WebElement Error = driver.findElement(By.xpath("//h3[@data-test='error']"));
	    	String Actualmsg = Error.getText();
	    	
	    	Assert.assertEquals(error,Actualmsg );
	    	
	    }
	    
	    
}