package com.specifiedcheckbox.sample3;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkboxespagesPO {
	
	public checkboxespagesPO(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	@FindAll({
		@FindBy(id="a1"),
		@FindBy(id="a3"),
		@FindBy(id="a5")
	})
	private List<WebElement> allChkBx;
	
	public int allChkBxSize() {
		return allChkBx.size();
		
	}
public WebElement getAllChkBx(int i) {
return allChkBx.get(i);
}

}
