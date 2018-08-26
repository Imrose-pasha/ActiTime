package com.specifiedcheckbox.sample3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Now the Chrome Browser Launches & gets maximize");
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/IMROSE%20PASHA/Desktop/HTML%20programs/Program7.html");
		checkboxespagesPO linkpo = new checkboxespagesPO(driver);
		System.out.println(linkpo.allChkBxSize());
		linkpo.getAllChkBx(0).click();
		linkpo.getAllChkBx(1).click();
		linkpo.getAllChkBx(2).click();

	}
}
