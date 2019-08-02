package com.resource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver d;
	public void loadUrl() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAGHU\\eclipse-workspace\\demo\\dri\\chromedriver.exe");
		 d=new ChromeDriver();
			d.get("http://demo.guru99.com/telecom/");
		
}
public static void type (WebElement e,String s) {
e.sendKeys(s);
	}
	public void clik(WebElement e) {
		e.click();

	}

}
