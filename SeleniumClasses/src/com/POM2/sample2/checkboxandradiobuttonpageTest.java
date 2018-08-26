package com.POM2.sample2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxandradiobuttonpageTest {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/IMROSE%20PASHA/Desktop/HTML%20programs/Program7.html");
	Link7PO link7po = new Link7PO(driver);
	
	/*
	 * Click single check box
	 * link7po.chkBx1().click();
	link7po.chkBx2().click();
	link7po.chkBx3().click();
	link7po.chkBx4().click();
	link7po.chkBx5().click();*/
	System.out.println("Number of check boxes = "+link7po.allchkBoxsize());
	for (int i = 0; i <link7po.allchkBoxsize(); i++) {
		link7po.getAllChkBx(i).click();
	}
	
	/*link7po.rdBtn1().click();
	link7po.rdBtn2().click();
	link7po.rdBtn3().click();
	link7po.rdBtn4().click();
	//link7po.rdBtn5().click();
*/}

}
