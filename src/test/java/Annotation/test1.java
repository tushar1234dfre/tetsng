package Annotation;

import org.testng.annotations.Test;

public class test1 {
	
  @Test
  public void day1() {
	  System.out.println("Hello");
  }
  
  @Test(groups= {"Smoke"})
  public void day2()
  {
	  System.out.println("Hii");
 
  }
  
  
}
