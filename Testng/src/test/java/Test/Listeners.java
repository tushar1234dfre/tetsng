package Test;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


//ITestListener is a interface which have all the methods of TestNG Listeners
//ITestListener is a interface which  implements TestNG Listeners methods

public class Listeners implements ITestListener   {
	
	public void onTestStart(ITestResult result) {   //ITestRuslt is a class which describes the result of test 
        // TODO Auto-generated method stub  
		System.out.println("Test Start");
          
    }  
  
    public void onTestSuccess(ITestResult result) {  
        // TODO Auto-generated method stub  
        System.out.println("Success of test cases and its details are : "+result.getName());   //getName() - get the name of methods 
    }  
  
    public void onTestFailure(ITestResult result) {  
        // TODO Auto-generated method stub  
        System.out.println("Failure of test cases and its details are : "+result.getName());  
    }  
  
    public void onTestSkipped(ITestResult result) {  
        // TODO Auto-generated method stub  
        System.out.println("Skip of test cases and its details are : "+result.getName());  
    }  
  
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {  
        // TODO Auto-generated method stub  
        System.out.println("Failure of test cases and its details are : "+result.getName());  
    }  
  
    public void onStart(ITestContext context) {   
        // TODO Auto-generated method stub  
    	System.out.println("Methods start");
          
    }  
    
//     ITestContext
//    This class defines a test context which contains all the information for a given test run. 
//    Aninstance of this context is  passed to the test listeners so they can query information about their environment.
  
    public void onFinish(ITestContext context) {  
        // TODO Auto-generated method stub  
          
    }  


	
	


}
