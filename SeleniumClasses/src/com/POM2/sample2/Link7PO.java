package com.POM2.sample2;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Link7PO {
	public Link7PO(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
//find single checkbox
	/*@FindBy(id="a1")
	private WebElement chkBx1;
	public WebElement chkBx1() {
		return chkBx1;
	}
	@FindBy(id="a2")
	private WebElement chkBx2;
	public WebElement chkBx2() {
		return chkBx2;
	}
	@FindBy(id="a3")
	private WebElement chkBx3;
	public WebElement chkBx3() {
		return chkBx3;
	}
	@FindBy(id="a4")
	private WebElement chkBx4;
	public WebElement chkBx4() {
		return chkBx4;
	}
	@FindBy(id="a5")
	private WebElement chkBx5;
	public WebElement chkBx5() {
		return chkBx5;
	}*/

	// to find all the Checkboxes at a time
	@FindBys({

		@FindBy(xpath="//input[@type='checkbox']")	
	})
	private List<WebElement> allchkBox;
	public int allchkBoxsize() {
		
		return allchkBox.size() ;
	}
	
	public WebElement getAllChkBx(int i) {
		return allchkBox.get(i);
	}

	/*//Single Radio button 
	@FindBy(id="r1")
	private WebElement rdBtn1;
	public WebElement rdBtn1() {
		return rdBtn1;
	}

	@FindBy(id="r2")
	private WebElement rdBtn2;
	public WebElement rdBtn2() {
		return rdBtn2 ;
	}

	@FindBy(id="r3")
	private WebElement rdBtn3;
	public WebElement rdBtn3() {
		return rdBtn3 ;
	}

	@FindBy(id="r4")
	private WebElement rdBtn4;
	public WebElement rdBtn4() {
		return rdBtn4 ;
	}*/


}
