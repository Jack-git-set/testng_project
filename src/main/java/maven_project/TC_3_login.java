package maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_3_login {
	
public void login_with_username(WebDriver chr)
	
	{
		System.out.println("TC3_login");
		
		send_keys(chr,By.xpath("//*[@id='username']"));
		
	}

}
