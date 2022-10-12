package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class LoginPage extends BaseClass
{
    @FindBy(id="loginForm:username12")
     WebElement uname;
    
    @FindBy(id="loginForm:password")
    WebElement pass;
	
    @FindBy(id="loginForm:loginButton")
    WebElement click;
    
    
    public LoginPage()
    {
    	PageFactory.initElements(driver, this);
    }
	public void username(String un)
	{
		uname.sendKeys(un);
	}
	
	public void password(String ff)
	{
		pass.sendKeys(ff);
	}
	
	public void submit()
	{
		click.click();
	}
	
}
