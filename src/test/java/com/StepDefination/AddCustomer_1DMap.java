package com.StepDefination;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.objectREpRepo.AddCuspage;
import com.objectREpRepo.Homepage;
import com.resource.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddCustomer_1DMap extends Base {
	AddCuspage x;
	@Given("user navigte to home page n user click no add customer")
	public void user_navigte_to_home_page_n_user_click_no_add_customer() {
loadUrl();  
	}

	@When("fill all info")
	public void fill_all_info(io.cucumber.datatable.DataTable data) {
	
	Map<String, String> li = data.asMap(String.class, String.class);
	x=new AddCuspage();
	Homepage h=new Homepage();
	h.AddCusBtn();
	x.checkBox();
x.fillForm(li.get("f_name") ,li.get("L_name"), li.get("mail"), li.get("add"),li.get("p_no"));

	}

	@When("click on the submit button")
	public void click_on_the_submit_button() {

	x.sub();   
	}

	@Then("user validate the result")
	public void user_validate_the_result() {
	boolean verifyCusId = x.verifyCusId();  
	Assert.assertTrue(verifyCusId);
	}
}
