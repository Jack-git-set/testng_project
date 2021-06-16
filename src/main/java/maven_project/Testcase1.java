package maven_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Testcase1 {
	ExtentReports er = new ExtentReports("report/extent/abc.html",true);
	ExtentTest et;
	WebDriver driver;
	
	@BeforeTest
	public void webs() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium drivers\\chromedriver.exe");
		driver=new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	@Test
	public void login_page() {
	
		
		System.out.println("Hello login 1"+Thread.currentThread().getId());
		et = er.startTest("test_login_page");
		driver.get("https://web.openrainbow.com/");
		System.out.println(driver.getTitle());
		
		
		try {
		WebElement connected = driver.findElement(By.xpath("//*[text()='Connect to Rainbow']"));
		
		System.out.println("MAin element"+connected);
		
		if(connected != null){
			et.log(LogStatus.PASS, "Test step login has been passed");
			System.out.println("PAss");
		}else{
			et.log(LogStatus.FAIL, "Test step login Failed");
			System.out.println("Fail");
			}
		}
		catch(Exception e)
		{
		System.out.println("Exception");
		et.log(LogStatus.FAIL, "Test step login Failed");
		}
	}

	
	/*@Test
	public void text_message() {
		System.out.println("Hello text_message 2 "+Thread.currentThread().getId());
		et = er.startTest("test_text_message");
		et.log(LogStatus.PASS, "Test step message failed to send");
	}*/
	
	@AfterSuite
	public void make_call() {
		System.out.println("Hello make_call 3"+Thread.currentThread().getId());
		er.flush();
		
		
	}
}
