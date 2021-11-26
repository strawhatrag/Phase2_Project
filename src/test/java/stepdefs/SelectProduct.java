package stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SelectProduct {
	
	WebDriver driver = Baseclass.driver;
    
    @And("^user add a product \"([^\"]*)\" to the cart$")
    public void user_add_a_product_something_to_the_cart(String name) throws Throwable {
    	
    	WebElement Product = driver.findElement(By.xpath("//div[@class='inventory_item_name' and text()='" + name + "']/following::button[1]"));
    	Product.click();
    	
    }
    
    
    @Then("^Product should be added to cart$")
    public void product_should_be_added_to_cart() throws Throwable {
    	
    	WebElement cart = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span"));
    	Assert.assertEquals("1", cart.getText());
    	
    }

}
