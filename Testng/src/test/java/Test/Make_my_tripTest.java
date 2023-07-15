package Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Make_my_tripTest {
	
	public static WebDriver driver;
  @Test(description ="Successfuuly initialize the driver and hit the url in  browser",priority =1)
  public void initialize_the_driver() {
	  
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		String url = "https://www.makemytrip.com/";
		
		driver.get(url);
	  
	  
  }
  
  @Test(description = "Successfully select the from city" , priority =2)
  public void from_city()
  {
	  driver.findElement(By.xpath("//input[@id='fromCity']")).click();
	  driver.findElement(By.xpath("//div/p[text()='Mumbai, India']")).click();
  }
  
  @Test(description = "Successfully select the to city" , priority = 3 )
  public void to_city()
  {
	  driver.findElement(By.xpath("//label/input[@id='toCity']")).click();
	  driver.findElement(By.xpath("//div/p[text()='New Delhi, India']")).click();
  }
  
  @Test(description = "Successfully select the date from the calender" , priority =4)
  public void calender_date()
  {
		driver.findElement(By.xpath("(//div[@class='dateInnerCell']/p[text()='29'])[2]")).click();

  }
  
  @Test(description = "Successfully select the passanger type and travel class" , priority = 5)
  public void traveller_class() throws InterruptedException
  {
	//Select traveller and class
			Thread.sleep(3000);
			driver.findElement(By.xpath("//label/span[@class='lbl_input appendBottom5']")).click();
			
			//Select traveller type
			
			driver.findElement(By.xpath("//ul/li[@data-cy='adults-3']")).click();
			
			//Select class
			driver.findElement(By.xpath("//ul/li[text()='Premium Economy']")).click();
			
			//Click on Apply button
			driver.findElement(By.xpath("//button[@class='primaryBtn btnApply pushRight']")).click();
  }
  
  @Test(description = "Successfully click on the student radio button" , priority =6)
  public void radio_button()
  {
		WebElement studentRadio = driver.findElement(By.xpath("(//li[@class='font12 blackText wrapFilter  '])[2]"));
		studentRadio.click();
		System.out.println(studentRadio.getText());
		System.out.println("Student Radio button is selected : " + studentRadio.isSelected());
		
  }
  
  @Test(description ="Successfully click on the serach button" , priority = 7)
  public void serach_button()
  {
	//Click on search button
	driver.findElement(By.xpath("//p/a[text()='Search']")).click();
  }
  
  @Test(description = "Successfully click on go it button" , priority = 8)
  public void gotit_button()
  {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='OKAY, GOT IT!']")));
		
		driver.findElement(By.xpath("//button[text()='OKAY, GOT IT!']")).click();
  }
  @Test(description = "Successfully validate the slider" , priority = 9)
  public void slider_test() throws InterruptedException
  {
 
			Thread.sleep(3000);
			WebElement slider = driver.findElement(By.xpath("//div[@class='rangeslider__handle']"));
			Actions move = new Actions(driver);
		    move.dragAndDropBy(slider, -20, 0).build().perform(); //-20 is negative x coordinate it move baclkward from its position at the moment
		    
  }
  
  @Test(priority = 10 , description = "Successfully verified the filter button")
  public void popular_filter_radio_button() throws InterruptedException
  {
	  String flightName = "SpiceJet";  
	  List<WebElement> checkBoxes = driver.findElements(By.xpath("//div/label[@class='checkboxContainer ']"));
	 
	  System.out.println("Total number of Checkboxes are : " + checkBoxes.size());
	  
	  for(WebElement checkBox : checkBoxes)
	  {
		  if(checkBox.getText().startsWith(flightName))
		  {
			  checkBox.click();
			  
			  Thread.sleep(6000);
			  System.out.println(checkBox.isSelected());

			  break;
			  
		 }
		  
		  
	  }
	  
	  
	  
	  
	  
	  
  }
  
  
  
}
