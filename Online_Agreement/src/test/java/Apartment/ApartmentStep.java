package Apartment;
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

public class ApartmentStep {
	
	public WebDriver driver;

	
	@Given("^: Open the chrome and start application$")
    public void _open_the_chrome_and_start_application() throws Throwable {
	        
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
	 

	    @Given("^: click on Apartments$")
	    public void _click_on_apartments() throws Throwable {
	    	
	    	driver.findElement(By.xpath("//*[text()='Apartments'][1]")).click();
	    }

	    
	    @When("^: Search data by Aapply filter")
	    public void _apply_filter_for_search() throws Throwable {
	    	
	    	//driver.findElement(By.xpath("//*[@class='cityLocProjectField noPlace']")).click();
	    	Thread.sleep(15000);
	    	
	    	driver.findElement(By.xpath("//*[@class='cityLocProjectField noPlace']")).click();
	    	driver.findElement(By.xpath("//*[@class='cityLocProjectField noPlace']")).sendKeys("mum");;

	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("//*[@class='location_search_result'][2]")).click();
	    	
	    	driver.findElement(By.xpath("//*[text()='Rent']")).click();
	    	driver.findElement(By.xpath("//*[@class='rc-slider-handle rc-slider-handle-1']")).click();
	    	driver.findElement(By.xpath("//div[@class='filterdropdown w-dropdown'][2]")).click();
	    	Thread.sleep(2000);
	    	for(int i=0; i<5; i++)
	    	{
		    	driver.findElement(By.xpath("//div[@class='filterdropdown w-dropdown'][2] //div[@class='w-checkbox-input w-checkbox-input--inputType-custom checkbox-2 ']")).click();

	    	}


	    	Thread.sleep(2000);

	    	driver.findElement(By.xpath("//div[@class='filterdropdown w-dropdown'][2] //button[@type='submit']")).click();
	    	Thread.sleep(2000);

	    	driver.findElement(By.xpath("//div[@class='filterdropdown w-dropdown'][3]")).click();

	    	for(int i=0; i<3; i++)
	    	{
	    	driver.findElement(By.xpath("//div[@class='filterdropdown w-dropdown'][3] //div[@class='w-checkbox-input w-checkbox-input--inputType-custom checkbox-2 ']")).click();
	    	//driver.findElement(By.xpath("//div[@class='filterdropdown w-dropdown'][3] //input[@name='standard']")).click();
	    	}
	    	Thread.sleep(2000);

	    	driver.findElement(By.xpath("//div[@class='filterdropdown w-dropdown'][3] //button[@type='submit']")).click();
	    	Thread.sleep(2000);

	    	driver.findElement(By.xpath("//div[@class='filterdropdown w-dropdown'][4]")).click();
	    	driver.findElement(By.xpath("//div[@class='filterdropdown w-dropdown'][4]//span[@class='rc-slider-dot rc-slider-dot-active'][2]")).click();
	    	Thread.sleep(2000);

	    	driver.findElement(By.xpath("//div[@class='filterdropdown w-dropdown'][5]")).click();
	    	driver.findElement(By.xpath("//div[@class='filterdropdown w-dropdown'][5]//span[@class='cust_slider round']")).click();
	    	//driver.findElement(By.xpath("//div[@class='filterdropdown w-dropdown'][5]//input[@name='Swimming Pool']")).click();

	    	System.out.println(driver.findElements(By.xpath("//div[@class='filterdropdown w-dropdown'][5]//div[@class='w-checkbox-input w-checkbox-input--inputType-custom checkbox-2 ']")).size());

	    	int count = driver.findElements(By.xpath("//div[@class='filterdropdown w-dropdown'][5]//div[@class='w-checkbox-input w-checkbox-input--inputType-custom checkbox-2 ']")).size();

	    	while(count <3)
	    	{
	    		driver.findElement(By.xpath("//div[@class='filterdropdown w-dropdown'][5]//div[@class='w-checkbox-input w-checkbox-input--inputType-custom checkbox-2 ']")).click();

	    		count++;
	    	}
	    	
	    	Thread.sleep(2000);

	    	driver.findElement(By.xpath("//div[@class='filterdropdown w-dropdown'][5]//button[@type='submit']")).click();
	    	
	    	Thread.sleep(2000);

	    	driver.findElement(By.xpath("//div[@class='clickable_item filterbar_clearall_button']")).click();

	    	driver.manage().timeouts().implicitlyWait(20,  TimeUnit.SECONDS);
	    }
	    
	    
	     @When("^: User enters valid/invalid \"([^\"]*)\" and \"([^\"]*)\"$")
	 
	    public void _user_enters_validinvalid_something_and_something(String fullname, String mobilenumber) throws Throwable {
	    	
	    	driver.findElement(By.xpath("//input[@name='name']")).sendKeys(fullname);

	    	driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys(mobilenumber);
	    	//System.out.println(driver.findElement(By.xpath("//span[@class='validationError']")).getText());
	    	

	    	
	    }
	 
	    @Then("^: Click on schedule call button$")
	    public void _click_on_schedule_call_button() throws Throwable {
	    
	    	driver.findElement(By.xpath("//button[@class='maincta w-button_Homepage fullWidthButton']")).click();
   
	    	
	    	driver.close();
	}
	
}

