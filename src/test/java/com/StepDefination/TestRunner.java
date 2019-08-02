package com.StepDefination;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resource/",glue= {"com.StepDefination"},monochrome=false,dryRun=true,plugin="html:target")
public class TestRunner {

}
    