/**
 * 
 */
package com.thoughtworks.common.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Debamrita
 *
 */
public class MySiteLoginPage {

	private WebDriver driver;
	public MySiteLoginPage(WebDriver driver) {
		//uper(driver);
        this.driver=driver;
        PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using="user-name")
	private WebElement userName;
	@FindBy(how=How.ID, using="password")
	private WebElement pwd;
	@FindBy(how=How.ID, using="captcha")
	private WebElement captcha;
	@FindBy(how=How.ID, using="login-button")
	private WebElement loginButton;
	@FindBy(how=How.ID, using="header")
	private WebElement header;
	
	
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPwd() {
		return pwd;
	}
	public WebElement getCaptcha() {
		return captcha;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public WebElement getHeader() {
		return header;
	}
	
	
}


