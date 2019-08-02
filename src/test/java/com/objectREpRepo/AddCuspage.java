package com.objectREpRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resource.Base;

public class AddCuspage extends Base{
	@FindBy(xpath="//label[@for='done']")
	WebElement clm;

@FindBy(id="fname")
WebElement finame;

@FindBy(id="lname")
WebElement lname;
@FindBy(id="email")
WebElement email;
@FindBy(xpath="//textarea[@id='message']")
WebElement add;
@FindBy(id="telephoneno")
WebElement pno;
@FindBy(xpath="//input[@type='submit']")
WebElement sub;
@FindBy(xpath="(//td[@align='center'])[2]")
WebElement verify;

public AddCuspage() {
PageFactory.initElements(d,this);
}

public void fillForm(String fn,String ln,String em,String adxd,String pnum) {
	
	finame.sendKeys(fn);
lname.sendKeys(ln);email.sendKeys(em);
add.sendKeys(adxd);
pno.sendKeys(pnum);}
public void checkBox() {
	clm.click();
}

public void sub() {
	sub.click();
}
public boolean verifyCusId() {
	return 	verify.isDisplayed();
	
}}