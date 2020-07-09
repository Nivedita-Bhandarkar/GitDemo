package Udemy.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentReportTest {
	ExtentReports report;
	@Test
	public void initialdemo() {
		report.createTest("initialdemo") ;
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/com.relevantcodes/extentreports/2.41.2");
		System.out.println(driver.getTitle());
		report.flush();
	}
	


	@BeforeTest
	public void config() {
		ExtentSparkReporter reporter = new ExtentSparkReporter("C:\\Users\\sishu\\Desktop\\Selenium\\Maven\\ExtentReports\\index.html");
		/*
		 * reporter.config().setReportName("WebAutomationResults");
		 * reporter.config().setDocumentTitle("Test Results");
		 */
	    report = new ExtentReports();
	   report.attachReporter(reporter);
	//   report.setSystemInfo("Tester", "Nisha");
	   
	   
	}
}
