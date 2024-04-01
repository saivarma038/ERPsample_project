package sample_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Frameworks
{
ExtentReports report;
ExtentTest logger;
WebDriver driver;

@BeforeTest
public void generateReports()
{
//define path of html
	
	report = new ExtentReports("./ExtentReports/Demo.html");
}
@BeforeMethod
public void setup()
{
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://google.com");
	}
@Test
public void passtest()
{
	//start test case here
	logger = report.startTest("Test pass");
	logger.assignAuthor("sai");
	String Expected = "Google";
	String Actual =driver.getTitle();
	if(Expected.equalsIgnoreCase(Actual))
	{
		logger.log(LogStatus.PASS, "title is matching::"+Expected+"-------"+Actual);
	
	}
	else
	{
	logger.log(LogStatus.FAIL, "title is not matching::"+Expected+"-------"+Actual);	
	}
	driver.quit();
	}
	
}
