package Contact;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)

public class ContactStep {
	
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
			
 } @Given("^: click on contact Us$")
   public void _click_on_contact_us() throws Throwable {
   	driver.findElement(By.xpath("//*[@class='clickable_item nav-link w-nav-link'] [text()='Contact Us']")).click();
	//Thread.sleep(15000);

   }


  @When("^: Div should be open$")
   public void _div_should_be_open() throws Throwable {
   	
   	System.out.println(driver.getTitle());
   }
   
   

   @When("^: User enters valid/invalid \"([^\"]*)\" and \"([^\"]*)\"$")
   public void _user_enters_validinvalid_something_and_something(String fullname, String mobilenumber) throws Throwable {
   
   
   	driver.findElement(By.xpath("//input[@name='name']")).sendKeys(fullname);
   	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   	driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys(mobilenumber);
   	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   //System.out.println(driver.findElement(By.xpath("//div[@class='react-responsive-modal-overlay'] /div//span[@class='validationError']")).getText());
   }
   
   @Then("^: Click on submit button$")
   public void _click_on_submit_button() throws Throwable {
	   	driver.findElement(By.xpath("//button[@type='submit']")).click();
	   	driver.close();

	   
   }

}
	

