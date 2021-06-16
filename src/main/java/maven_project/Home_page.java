package maven_project;

import java.io.File;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public abstract class Home_page implements Testcase_declaration,Variable_declaration {
	
	ExtentReports er = new ExtentReports("report/extent/abc.html", true);
	ExtentTest et;
	WebDriver driver;
	//private WebElement welcome;
	int i=1;

	
	@Override
	public void search_element(By elmnt) {
		try{
			WebElement welcome = driver.findElement(elmnt);
			if(welcome != null) {
				et.log(LogStatus.PASS, driver.findElement(elmnt).getText() + " available");
			    } else	{
				et.log(LogStatus.FAIL, "not loaded");
			       }
			}
			catch(Exception e)
			{
				et.log(LogStatus.FAIL, "No such elements " + elmnt);
			}
	}
	
	public void send_keys_value(By send_value,String input) {
		//System.out.println("Username"+user);
		try {
		WebElement send_values = driver.findElement(send_value);
		send_values.sendKeys(input);
		if(send_values != null) {
			et.log(LogStatus.PASS, driver.findElement(send_value).getText() + " available");
		    } 
		}
		catch(Exception e)
		{
			et.log(LogStatus.FAIL, "No such elements " + send_value);
		}
		//System.out.println("Welcome_value"+welcome);

	}
	public void click_element(By click_info)
	{
		System.out.println("Entered to click");
		try {
		WebElement click_value = driver.findElement(click_info);
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(SrcFile, new File("C:/Jaga/Rainrain/report/extent/"+i+".jpg"));
		click_value.click();
		if(click_value != null) {
			et.log(LogStatus.PASS,et.addScreenCapture("C:/Jaga/Rainrain/report/extent/"+i+".jpg")+ driver.findElement(click_info).getText() + " available");
		    } 
		}
		catch(Exception e)
		{
			et.log(LogStatus.FAIL, "No such elements " + click_info);
		}
		System.out.println("Entered to click done");
		i++;
	}
	
	public void click_element(By click_info,int y)
	{
		System.out.println("Entered to click");
		try {
		WebElement click_value = driver.findElement(click_info);
		if (y==1){
			TakesScreenshot scrShot =((TakesScreenshot)driver);
			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(SrcFile, new File("C:/Jaga/Rainrain/report/extent/"+i+".jpg"));
		
		
		click_value.click();
		if(click_value != null) {
			et.log(LogStatus.PASS,et.addScreenCapture("C:/Jaga/Rainrain/report/extent/"+i+".jpg")+ driver.findElement(click_info).getText() + " available");
		    } 
		}
		else {
			click_value.click();
			if(click_value != null) {
				et.log(LogStatus.PASS,driver.findElement(click_info).getText() + " available");
			    } 
		}
		}
		
		catch(Exception e)
		{
			et.log(LogStatus.FAIL, "No such elements " + click_info);
		}
		System.out.println("Entered to click done");
		i++;
	}
	
	/*
	public void send_keys(WebDriver drv,By elmnt) {
		try {
			System.out.println("working fine_1");
			//WebElement sendkeys_1 = drv.findElement(elmnt);
			
			welcome.sendKeys(myusername);
			System.out.println("working fine");
			}
			catch(Exception e)
			{
				System.out.println("Exception in sendkeys"+e);
				et.log(LogStatus.FAIL, "No such elements " + elmnt);
				
			}	
		}
	*/
}
	

