package com.objectREpRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resource.Base;

public class Homepage extends Base {
@FindBy(xpath="(//a[text()='Add Customer'])[1]")
 WebElement addcus;
@FindBy(xpath="//a[text()='Add Tariff Plan']")
WebElement addtariff;
@FindBy(xpath="(//a[@rel='home'])[2]")
WebElement logo;

public Homepage() {
PageFactory.initElements(d, this);
}
public   AddCuspage AddCusBtn()
{
	addcus.click();;
	return new AddCuspage();
}
public Addtarrif addTar() {
	addtariff.click();
	return new Addtarrif();
}

}
