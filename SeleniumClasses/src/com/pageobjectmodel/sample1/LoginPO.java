package com.pageobjectmodel.sample1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPO {

public LoginPO(WebDriver driver) {
	// constructor
 PageFactory.initElements(driver, this);
}	
@FindBy(xpath="//input[@id='username']")
private WebElement unTxtBx;

public WebElement usTxtBx(String un) {
	return unTxtBx;
}

@FindBy(xpath="//input[@id='spswd']")
private WebElement pwTxtBx;
public WebElement pwTxtBx() {
	return pwTxtBx;
}
@FindBy(xpath="//a[@id='loginButton']")
private WebElement loginBtn; 


}
