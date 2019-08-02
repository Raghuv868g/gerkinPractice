package com.StepDefination;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import com.resource.Base;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends Base {
@Before
public void beforeStart() {
Date k=new Date()	;
SimpleDateFormat g=new SimpleDateFormat("dd/MMM/yy");
String format = g.format(k);
System.out.println(format);

}
@After
public void close() {
	d.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);

	d.close();
}

}
