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

public class AddCustomer extends Base {

	AddCuspage x;
@Given("user navigte to home pag")
public void user_navigte_to_home_pag() {
    loadUrl();
}

@Given("user click non add customer")
public void user_click_non_add_customer() {
	Homepage h=new Homepage();
h.AddCusBtn(); 
}

@When("fill all details")
public void fill_all_details(DataTable data) {
	x=new AddCuspage();
	x.checkBox();
List<String>li=data.asList(String.class); 
x.fillForm(li.get(0),li.get(1) ,li.get(2), li.get(3), li.get(4));
}

@When("click on submit btn")
public void click_on_submit_btn() {
x.sub();  
}

@Then("I validate the outcome")
public void i_validate_the_outcome() {
    boolean cusId = x.verifyCusId();
Assert.assertTrue(cusId);  
}


}
