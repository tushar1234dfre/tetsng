package Annotation;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
@Parameters({"URL"}) 
public class test3 {

	@Parameters({"URL","Username"}) // The Scope of this @Parameters is only for Signup() method
	@Test
	public void signup(String urlname,String username)
	{
		System.out.println("Hello");
		System.out.println(urlname);
		System.out.println(username);
	}
	

	@Test(groups= {"Smoke"})
	public void login()
	{
		System.out.println("Everone");
		
	}
	

}
