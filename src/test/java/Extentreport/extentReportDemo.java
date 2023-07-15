package Extentreport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class extentReportDemo {
	
	public ExtentReports extent;
	@BeforeTest
	public void initialdemo()
	{
		// Two classes are important 1. ExtentReports , 2. ExtentSpartReporter
		
		String path = System.getProperty("user.dir")+ "\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Basic Test");
		reporter.config().setDocumentTitle("WEB AUTOMATION");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester Name", "Tushar Phatangare");
		extent.setSystemInfo("Operating System", "Windows");
		
		
	}
	
	
	@Test
	public void demo()
	{
		extent.createTest("Demo");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		extent.flush();
	}

}
