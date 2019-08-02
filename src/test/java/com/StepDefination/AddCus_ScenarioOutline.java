package com.StepDefination;

import org.junit.Assert;

import com.objectREpRepo.AddCuspage;
import com.objectREpRepo.Homepage;
import com.resource.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCus_ScenarioOutline extends Base {
	AddCuspage x;

	@Given("user  to present in home page")
	public void user_to_present_in_home_page() {
		loadUrl();  
}

	@When("fill all info and click submit btn{string},{string},{string},{string},{string}")
	public void fill_all_info_and_click_submit_btn(String a, String b, String c, String d, String e) {
		x=new AddCuspage();
		Homepage h=new Homepage();
		h.AddCusBtn();
		x.checkBox();
		x.fillForm(a, b, c, d, e);
		x.sub();
	}

	@Then("user validate the outcomes and test the outcome")
	public void user_validate_the_outcomes_and_test_the_outcome() {
		boolean verifyCusId = x.verifyCusId();  
		Assert.assertTrue(verifyCusId);
}

}
