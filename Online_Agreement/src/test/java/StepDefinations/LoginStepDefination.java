package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class LoginStepDefination {
	
	public  WebDriver driver;
	
  @Given("^Initialize driver$")
	
    public void initialize_driver() throws Throwable 
    {
		 System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		
		//this.initialize_driver();
		//driver = new ChromeDriver();
//driver=initialize_driver();
		if(driver==null)
		{
			driver=new ChromeDriver();
		}

		driver.get("https://feature-lnl-template.dvcv96tcnzwik.amplifyapp.com/online-rental-agreement");
		
		Thread.sleep(10000);
    }
	  
	 
	    @Given("^close pop up div$")
	  
	    public void close_pop_up_div() throws Throwable {
	  
	    	driver.findElement(By.xpath("//button[@class='react-responsive-modal-closeButton']")).click();
	  }

 
    @Given("^User click on login$")
    public void user_click_on_login() throws Throwable
    {
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    	driver.findElement(By.xpath("//div[@class='nav-link w-nav-link clickable_item']")).click();
    
    }
	
	
    @Given("^User landed on welcome to MultiLiving page$")
    public void user_landed_on_welcome_to_multiliving_page() throws Throwable {

		System.out.println(driver.getTitle());
	}

	@When("User enter valid mobile number to get otp on there mobile number")
	public void Get_otp() throws Throwable
	{
		
		driver.findElement(By.name("mobile")).sendKeys("9821155824");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	
	@Then("Enter otp field page get displayed with login button") 
	public void Enter_otp() throws Throwable
	{
		System.out.println(driver.getTitle());
	}
	
	@And("After enter correct otp page and click on login then user should displayed My Account tab")
	public void login() throws Throwable
	{
		
		//driver.findElement(By.name("otp")).sendKeys("");
		Thread.sleep(15000);
		
		driver.findElement(By.xpath("//button[@class='buttoncta']")).click();
		
		Thread.sleep(1500);

		
	}
	
	

	@Given("^User click on My Account$")
    public void user_click_on_my_account() throws Throwable {
	        driver.findElement(By.xpath("//*[@class='nav-link w-nav-link'][3]")).click();
			Thread.sleep(1500);

}
	 
	 @When("^user enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_enters_something_and_something_and_something(String firstname, String lastname, String emailid) throws Throwable {
		
	
	   driver.findElement(By.name("firstName")).sendKeys(firstname);
		 Thread.sleep(2000);
		 driver.findElement(By.name("lastName")).sendKeys(lastname);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@name='email']")).sendKeys(emailid);
		 Thread.sleep(2000);
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		 
		}
	
	@Then("^click on submit button$")
    public void click_on_submit_button() throws Throwable {
		 
		 driver.findElement(By.xpath("//*[text()='Submit']")).click();
		   //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		 //driver.findElement(By.xpath("//div[text()='Log out']")).click();

		 driver.close();
	 }

	 
}