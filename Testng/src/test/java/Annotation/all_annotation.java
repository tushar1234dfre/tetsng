package Annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class all_annotation {

	
	@BeforeSuite
	public void beforesuit()
	{
		System.out.println("I will execute first before the suite");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("I will execute before the test folder");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("I will execute once before the class");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("I will execute before the each method");

	}

	@AfterSuite
	public void afteresuit()
	{
		System.out.println("I will execute after the suite completion");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("I will execute after the test folder");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("I will execute after the class");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("I will execute after the each method");

	}
	
	
	@Test
	public void MobileApp()
	{
		System.out.println("Mobile App");
	}
	
	@Test
	public void MobileWeb()
	{
		System.out.println("Mobile Web");

	}
	
	@Test
	public void Androidapp()
	{
		System.out.println("Android App");
	}
	
	@Test
	public void IosApp()
	{
		System.out.println("Ios  App");

	}
}

