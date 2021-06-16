package maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;

public interface Variable_declaration {
	String url = "https://web.openrainbow.com/";
	String myusername = "jagadeesh.selvanathan@al-enterprise.com";
	By account_name = By.xpath("//*[@id='username']");
	By account_password = By.name("authPwd");
	By continue_botton = By.xpath("//*[text()='Continue']//parent::button");
	By connect_botten = By.xpath("//*[text()='Connect']//parent::button");
}
