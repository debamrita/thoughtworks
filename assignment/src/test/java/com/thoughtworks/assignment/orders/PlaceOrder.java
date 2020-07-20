package com.thoughtworks.assignment.orders;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.thoughtworks.common.ConfigParameters;

import java.io.IOException;
import java.sql.SQLException;

/**
 * @author Debamrita
 *
 */

public class PlaceOrder extends ConfigParameters {

  @Test(dataProvider = "data",priority=1,enabled=true)
  @Parameters(value = { "browser", "platform", "version", "lib", "profile", "node" })
  public void verifyKellogsPrint(String url, String user, String pwd) {
	  driver = id.startDriver(driver, browserName, url, profileValue, nodeUrl, libValue,platformValue, versionName);
	  driver.get(url);
	  softassert.assertEquals(loginPage.getHeader().getText(), "* My Site XYZ");
	  loginPage.getUserName().sendKeys(user);
	  loginPage.getPwd().sendKeys(pwd);
	  loginPage.getLoginButton().click();
	  checkOut.getCheckOut().click();
	  ordersPage.getName().sendKeys("deba");
	  ordersPage.getMobile().sendKeys("123456780");
	  ordersPage.getAddress().sendKeys("HSR");
	  ordersPage.getSubmitButton().click();
	  ordersPage.getOtp().sendKeys("123456");
	  ordersPage.getPay().click();
  }

  @DataProvider(name = "data")
  public Object[][] createData() {
		Object[][] result = null;
			result = new Object[][] {
					{"https://www.mysite.com/placeorder", "deba", "password"},
					};
		return result;
	}
}
