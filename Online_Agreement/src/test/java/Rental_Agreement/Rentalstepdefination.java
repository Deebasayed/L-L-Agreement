package Rental_Agreement;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)

public class Rentalstepdefination {
	public WebDriver driver;
	@Given("^Open the chrome and start application$")
    public void open_the_chrome_and_start_application() throws Throwable {
		
		 System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		
		//this.initialize_driver();
		//driver = new ChromeDriver();
		
	 if(driver==null)
	 {
	 	driver=new ChromeDriver();
	 }
		driver.get("https://feature-lnl-template.dvcv96tcnzwik.amplifyapp.com/online-rental-agreement");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='react-responsive-modal-closeButton']")).click();

    }

    @Given("^: click on rental agreement$")
    public void _click_on_rental_agreement() throws Throwable {
      
    	driver.findElement(By.xpath("//a[@class='nav-link w-nav-link'][3]")).click();
    }

    @When("^: User should select value from drop down$")
    public void _user_should_select_value_from_drop_down() throws Throwable {
    	
    	/*
    	 * Select sel = new Select(driver.findElement(By.xpath("//select[@id='party_type']")));
    	 
    	sel.selectByVisibleText("TENANT");
    	*/
    	
    	WebElement dropdown = driver.findElement(By.xpath("//select[@id='party_type']"));
    	
    	dropdown.click();
    			
    }

    @When("^: User enters valid/invalid \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void _user_enters_validinvalid_something_and_something_and_something_and_something(String firstname, String lastname, String mobilenumber, String mailid) throws Throwable {

    driver.findElement(By.xpath("//input[@id='inputFirstName']")).sendKeys(firstname);
    
    driver.findElement(By.xpath("//input[@id='inputLastName']")).sendKeys(lastname);
    driver.findElement(By.xpath("//input[@id='inputMobile']")).sendKeys(mobilenumber);
    driver.findElement(By.xpath("//input[@id='inputMailId']")).sendKeys(mailid);
    
    Thread.sleep(2000);
    }

    @Then("^: Click on Save and Continue button$")
    public void _click_on_save_and_continue_button() throws Throwable {
    	
    	driver.findElement(By.xpath("//button[@class='button']")).click();
    }

   
     @Then("^: Close browse$")
  
    public void _close_browse() throws Throwable {
    	driver.close();
    }
       
    
}
