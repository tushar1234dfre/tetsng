package Test;

import org.testng.annotations.Test;

public class test2 {
	
  @Test(dependsOnMethods = "practice",alwaysRun=true)
  public void sample() {
	  System.out.println("Good");
  }
  
 @Test(timeOut=4000)
  public void practice()
  {
	  System.out.println("Bye");
  }
 

@Test
public void Handson()
{
	test1 te = new test1();
	te.day2();
	
}
}