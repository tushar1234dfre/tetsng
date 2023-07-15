package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {
	
  @Test(priority = 2)
  public void day1() {
	  System.out.println("Hello");
	 
  }
  
  @Test(priority = 1 ,enabled =false)
  public void day2()
  {
	  System.out.println("Hii");
 
  }
  
  
}
