package Home_Page;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
@RunWith(Cucumber.class)


public class Home_Basic {
	
	public  WebDriver driver;
	
	@Given("^: Open the the browser with chrome$")
    public void _open_the_the_browser_with_chrome() throws Throwable {
		
		 System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		
		//this.initialize_driver();
		//driver = new ChromeDriver();
		
	 if(driver==null)
	 {
	 	driver=new ChromeDriver();
	 }

		
    }
	
	@And("^: Navigate to url$")
    public void _navigate_to_url() throws Throwable {
   
		 
		 driver.get("https://feature-lnl-template.dvcv96tcnzwik.amplifyapp.com/online-rental-agreement");
		 Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='react-responsive-modal-closeButton']")).click();

	 }

    @Given("^: click on Home Page$")
    public void _click_on_rental_agreement() throws Throwable {
		 Thread.sleep(2000);

    	driver.findElement(By.xpath("//a[@class='nav-link w-nav-link'][2]")).click();
    }


    @When("^: click on read more button$")
    public void _click_on_read_more_button() throws Throwable {
    	
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//a[@class='button w-button']")).click();
    	/*
    	 * driver.findElement(By.xpath("//div[@id='autoSuggestInputDivrefine_keyword']")).sendKeys("mum");;
    	

    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@class='location_search_result'][2]")).click();
    	driver.navigate().back();
    	 */
    	Thread.sleep(2000);

    }
    
   
    
    @When("^: User enters valid/invalid \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" \"([^\"]*)\"$")
    public void _user_enters_validinvalid_something_and_something_and_something_something(String fullname, String emailaddress, String mobilenumber, String yourquery) throws Throwable {
       
    	
    	driver.findElement(By.xpath("//input[@name='name']")).sendKeys(fullname);
    	Thread.sleep(2000);

    	driver.findElement(By.xpath("//*[@placeholder='EMAIL ADDRESS']")).sendKeys(emailaddress);
    	Thread.sleep(2000);

    	driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys(mobilenumber);
    	Thread.sleep(2000);

    	driver.findElement(By.xpath("//*[@name='query']")).sendKeys(yourquery);
    	Thread.sleep(2000);

    	//System.out.println(driver.findElement(By.xpath("//span[@class='validationError']")).getText());
    	

    	
    }
    
    @Then("^: Click on submit button$")
    public void _click_on_submit_button() throws Throwable {
    
    	driver.findElement(By.xpath("//*[@type='submit']")).click();
    	
    	driver.close();

}


    
}
    

