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

public class AddCus_2DMap extends Base {
	AddCuspage x;
	@Given("user navigte to homepage")
	public void user_navigte_to_homepage() {
loadUrl();  
	}


@When("fill all information")
public void fill_all_information(DataTable data) {
	
List<Map<String, String>> li = data.asMaps(String.class, String.class);
x=new AddCuspage();
Homepage h=new Homepage();
h.AddCusBtn();
x.checkBox();
x.fillForm(li.get(0).get("f_name") ,li.get(0).get("l_name"), li.get(0).get("email"), li.get(1).get("add"),li.get(1).get("p_no"));
}

@When("click on the submit button and wait")
public void click_on_the_submit_button_and_wait() {
 
x.sub();}

@Then("user validate the output")
public void user_validate_the_output() {
	boolean verifyCusId = x.verifyCusId();  
	Assert.assertTrue(verifyCusId);
}
}
