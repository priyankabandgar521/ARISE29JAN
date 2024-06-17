package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginpage {

	//all the data members webelements should declared globally and with private access specifier
	// we use @FindBy annotation to find elements in pom
		
		@FindBy (xpath="//input[@id='user-name']")private WebElement username;
		
		@FindBy (xpath= "//input[@id='password']")private WebElement password;
		
		@FindBy (xpath = "//input[@id='login-button']") private WebElement login ;
		
	// constructor should be always public	
		public SwagLabLoginpage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		public void enterusername(String name) {
			username.sendKeys(name);
		}
		
		public void enterpassword(String pass) {
			password.sendKeys(pass);
		}
		 public void clickonloginbutton() {
			 login.click();
		 }
		
}
