package maven_project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class Home_page_test_case_1 extends Home_page {
	
	@BeforeTest
	@Parameters("Browser")
	public void selenium_include(String browser)
	{
	if(browser.equals("Firefox")) {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		
	}
	else {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	@Parameters({"JIRA","Browser"})
	public void m4(String url,String abc) throws InterruptedException 
	{
		System.out.println("Url value"+url);
		System.out.println("maven m4 " + Thread.currentThread().getId());
		et = er.startTest("Test m4");
		driver.get(url);
		Thread.sleep(5000);
		//search_element(By.xpath("//*[text()='Welcome to JIRA']"));
		//search_element(By.xpath("//*[text()='Dashboards']"));
		//search_element(By.xpath("//*[text()='REQUEST JIRA ACCOUNT']"));
		//search_element(By.xpath("//*[text()='ALM']"));
		search_element(account_name);
		//close_browser();
		
	}
	@Test
	public void username_entered() 
	{
		try {
		//String useraccount = "jagadeesh.selvanathan@al-enterprise.com";
		System.out.println("Usrname_entered");
		et = er.startTest("Test user_check");
		send_keys_value(account_name,"jagadeesh.selvanathan@al-enterprise.com");
		Thread.sleep(2000);
		click_element(continue_botton,1);
		send_keys_value(account_password,"Jagan1228!");
		Thread.sleep(2000);
		click_element(connect_botten,0);
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		System.out.println("screenshot_0");
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		System.out.println("screenshot_1");
		FileUtils.copyFile(SrcFile, new File("C:/Jaga/Rainrain/report/extent/xyz.jpg"));
		System.out.println("screenshot_2");
		//File x = new File("/target/xyz.jpg");
		}
		catch(Exception e)
		{
			System.out.println("Screenshot not successful"+e);
		}
	
		//TC();
	}
	
	
	
	
	/*
	public void TC()
	{
		TC_2_Login tc2_login = new TC_2_Login();
		tc2_login.login_with_username(driver);
		tc2_login.enter_password(driver);
	}
	
	
	
	
	
	

	public void login_with_username() throws InterruptedException
	{
		System.out.println("TC2_login");
		Thread.sleep(3000);
		send_keys(By.xpath("//*[@id='username']"));
		
	}
*/
	
	@AfterSuite
	public void m55() {
		er.flush();
		System.out.println("maven m55 " + Thread.currentThread().getId());
	}

}
