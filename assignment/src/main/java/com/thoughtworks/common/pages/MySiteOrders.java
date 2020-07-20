/**
 * 
 */
package com.thoughtworks.common.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Debamrita
 *
 */
public class MySiteOrders {

	private WebDriver driver;
	public MySiteOrders(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using="name")
	private WebElement name;
	@FindBy(how=How.ID, using="mobile")
	private WebElement mobile;
	@FindBy(how=How.ID, using="increment")
	private WebElement increment;
	@FindBy(how=How.ID, using="address")
	private WebElement address;
	@FindBy(how=How.ID, using="submit")
	private WebElement submitButton;
	@FindBy(how=How.ID, using="otp")
	private WebElement otp;
	@FindBy(how=How.ID, using="pay")
	private WebElement pay;
	
	public WebElement getName() {
		return name;
	}
	public WebElement getMobile() {
		return mobile;
	}
	public WebElement getIncrement() {
		return increment;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getSubmitButton() {
		return submitButton;
	}
	public WebElement getOtp() {
		return otp;
	}
	public WebElement getPay() {
		return pay;
	}
	
}


