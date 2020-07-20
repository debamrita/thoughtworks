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
public class MySiteCheckOutPage {

	private WebDriver driver;
	public MySiteCheckOutPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using="search")
	private WebElement search;
	@FindBy(how=How.ID, using="check-out")
	private WebElement checkOut;
	@FindAll({@FindBy(id = "prod")})
	private List<WebElement> products;
	@FindBy(how=How.ID, using="increment")
	private WebElement increment;
	@FindBy(how=How.ID, using="decrement")
	private WebElement decrement;
	public WebElement getSearch() {
		return search;
	}
	public WebElement getCheckOut() {
		return checkOut;
	}
	public List<WebElement> getProducts() {
		return products;
	}
	public WebElement getIncrement() {
		return increment;
	}
	public WebElement getDecrement() {
		return decrement;
	}
	
	
}


