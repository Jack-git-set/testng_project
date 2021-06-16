package maven_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TC_2_Login extends Home_page {	
	
	public void login_with_username(WebDriver chr)
	
	{
		System.out.println("TC2_login");
		
		send_keys(chr,By.xpath("//*[@id='username']"));
		
	}

	public void enter_password(WebDriver chr)
	
	{
		System.out.println("TC2_login");
		
		send_keys(chr,By.xpath("//*[@id='username']"));
		
	}
	
	/*
	public void passing_driver() {
		Home_page_test_case_1 abc = new Home_page_test_case_1();
		
		driver = abc.selenium_include("Firefox");
	} */
}
