package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data_Provider {

	
	  @Test(description = "This is a web login test case")
	  public void Weblogin()
	  {
		  System.out.println("webLogin");
		  
		  
		  
	  }
	  @Test(dataProvider = "getData")
	  public void Websignup(String username , String password)
	  
	  {
		  System.out.println("Websignup");
		  System.out.println(username);
		  System.out.println(password);
	  }
	  @Test
	  public void Mobileandroid()
	  {
		  System.out.println("Mobile Android");
	  }
	  @Test
	  public void Mobileios()
	  {

		  System.out.println("Mobile IOS");
	  }
	  
	  
	  @Test(dataProvider ="getData")
	  public void Mobileapp(String username,String password)
	  {
		  System.out.println("Mobile App");  
		  System.out.println(username);
		  System.out.println(password);
	  }
	  
	  

    @DataProvider
    public Object[][] getData()
    {
    	
    	//Make three sets of comination of username and password
    	
    	Object[][] data = new Object[3][2];
    	
    	//1st combination of username and password
    	data [0][0] = "Firstusername";
    	data [0][1] = "FirstPassword";
    	
    	//2ndt combination of username and password
    	data [1][0] = "Secondusername";
    	data [1][1] = "SecondPassword";
    	
    	//3rd combination of username and password
    	data [2][0] = "Thirdusername";
    	data [2][1] = "ThirdPassword";
    	
    	return data;
    	
    	
    	
    	
    }

}

