package Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test1 {
	 private static final Logger logger = LogManager.getLogger(test1.class.getName());

  @Test(priority = 2)
  public void day1() {
	  System.out.println("Hello");
	 logger.info("Hello Eveyone");
	 logger.error("Error Message");
  }
  
  @Test(priority = 1 ,enabled =false)
  public void day2()
  {
	  System.out.println("Hii");
	  
 
  }
  
  
  @BeforeClass
  public void setUp() {
      LoggerContext context = LoggerContext.getContext(false);
      context.start();
  }

  
  
}
