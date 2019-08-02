package com.StepDefination;

import java.util.List;

import org.junit.Assert;

import com.objectREpRepo.AddCuspage;
import com.objectREpRepo.Homepage;
import com.resource.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddCustomer_2dList extends Base {
	AddCuspage x;

	@Given("user navigte to home page")
	public void user_navigte_to_home_page() {
loadUrl();	}

	@Given("user click no add customer")
	public void user_click_no_add_customer() {
		Homepage h=new Homepage();
		h.AddCusBtn(); 
	}

	@When("fill all detail")
	public void fill_all_detail(DataTable data) {

		x=new AddCuspage();
		x.checkBox();
		
	List<List<String>> l=data.asLists(String.class);
	x.fillForm(l.get(0).get(0), l.get(1).get(1),l.get(0).get(2),l.get(1).get(3), l.get(1).get(4));
	}

	@When("click on submit button")
	public void click_on_submit_button() {
		x.sub();  
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		 boolean cusId = x.verifyCusId();
		 Assert.assertTrue(cusId);  
}

}
